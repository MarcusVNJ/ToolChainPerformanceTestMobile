package Config_Scripts;

import Puglin_openSTF_Appium.DeviceApi;
import Puglin_openSTF_Appium.STFService;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;



public abstract class ConfigAppium extends ConfigGetPerformance {

    private static final String STF_SERVICE_URL = "http://10.0.2.15:7100";  // Change this URL
    private static final String ACCESS_TOKEN = "cf5a46faa8bd4f48baa8ffddf02722890611c1a7138c4a6f8cc05a63de2c033a";  // Change this access tokenpublic static ExtentHtmlReporter html;
    private static String packageNameApp;


    private String deviceSerial;

    private static AndroidDriver androidDriver;
    private AppiumDriverLocalService service;
    private DeviceApi deviceApi;

    public ConfigAppium(String deviceSerial, String packageName) {
        super(packageName, deviceSerial);
        packageNameApp = packageName;
        this.deviceSerial = deviceSerial;

    }


    @BeforeClass
    public void setup() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, this.deviceSerial);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, new File("src/test/resources/BGPRIME.apk").getAbsolutePath());

        connectToStfDevice();
        createAppiumService();

        androidDriver = new AndroidDriver(this.service.getUrl(), desiredCapabilities);

    }


    @AfterClass
    public void tearDown() {
        if (androidDriver != null) {
            androidDriver.quit();
        }

        if (this.service.isRunning()) {
            service.stop();
            this.deviceApi.releaseDevice(this.deviceSerial);
        }
    }


    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    private void createAppiumService() {

        ServerArgument serverArgument = new ServerArgument() {
            @Override
            public String getArgument() {
                return "--relaxed-security";
            }
        };
        this.service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort().withArgument(serverArgument).withIPAddress("127.0.0.1"));
        this.service.start();

    }

    private void connectToStfDevice() throws MalformedURLException, URISyntaxException {
        STFService stfService = new STFService(STF_SERVICE_URL,
                ACCESS_TOKEN);
        this.deviceApi = new DeviceApi(stfService);
        this.deviceApi.connectDevice(this.deviceSerial);
    }


}
