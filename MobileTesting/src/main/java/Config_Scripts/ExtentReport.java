package Config_Scripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public abstract class ExtentReport {

    private static ExtentReports extent;
    private static ExtentTest report;
    private String deviceSerial;

    public ExtentReport(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    @BeforeSuite
    public void reportSetup() {

        extent = getInstance();

    }

    @BeforeMethod
    public void setupPerformance(Method method) {

        report = extent.createTest(method.getName());
        report.log(Status.INFO, "dispositivo : " + this.deviceSerial);


    }

    @AfterSuite
    public void reportTearDown() {
        extent.flush();

    }

    public static void logEvent(Status event, String text) {
        report.log(event, text);
    }

//    public static void logTableDataPerformance(String memoria, String rx, String tx, String cpuUser,String cpuKernel) {
//        String cpu = String.valueOf(Integer.parseInt(cpuUser) + Integer.parseInt(cpuKernel));
//        String[][] table = {
//                {"Memória", "Download", "UpLoad", "CPU"},
//                {memoria, rx, tx, cpu}
//        };
//
//        report.log(Status.INFO, MarkupHelper.createTable(table));
//    }



    private synchronized static ExtentReports getInstance() {
        if (extent == null)
            createInstance("Report/Relatorio.html");

        return extent;
    }

    private synchronized static ExtentReports createInstance(String fileName) {

        ExtentHtmlReporter html = new ExtentHtmlReporter(fileName);
        html.loadXMLConfig("/home/stf/Documentos/MobileTesting/src/main/java/Config_Scripts/configReport.xml");
        extent = new ExtentReports();
        extent.attachReporter(html);
        extent.setSystemInfo("OS", "Android");

        return extent;
    }

}
