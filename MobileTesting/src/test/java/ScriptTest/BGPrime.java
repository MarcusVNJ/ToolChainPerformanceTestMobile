package ScriptTest;


import Config_Scripts.ConfigAppium;

import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BGPrime extends ConfigAppium {

    @Factory(dataProvider = "parallelDp", dataProviderClass = DataDeviceId.class)
    public BGPrime(String deviceSerial) {
        super(deviceSerial,"com.bgprimeleague");
    }


    @Test
    public void AccessaCompetição () {

        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        logEvent(Status.INFO, "Iniciou o teste");
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"SUB 14 - 2019"+"']");
        el1.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Visualizando detalhes do evento");
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
        el2.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        rolagemTelaVertical(0.9,0.1);

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByAccessibilityId("Escalação, ");
        el3.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        rolagemTelaVertical(0.9,0.1);

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        MobileElement el4 = (MobileElement) getAndroidDriver().findElementByAccessibilityId("Comparativo, ");
        el4.click();

        rolagemTelaVertical(0.1,0.9);
        logEvent(Status.PASS, "Atualizando página");
        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        getAndroidDriver().navigate().back();

        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        getAndroidDriver().navigate().back();


        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        MobileElement el5 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"ALTERAR"+"']");
        el5.click();

    }


    private void rolagemTelaVertical(double iniciu, double fim){

        Dimension size = getAndroidDriver().manage().window().getSize();

        int x = size.width/2;

        int start_y = (int) (size.height*iniciu);
        int end_y = (int) (size.height*fim);

        (new TouchAction(getAndroidDriver()))
                .press(new PointOption().withCoordinates(new Point(x,start_y)))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(800)))
                .moveTo(new PointOption().withCoordinates(new Point(x, end_y)))
                .release()
                .perform();
    }


}