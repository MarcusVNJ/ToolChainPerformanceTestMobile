package Config_Scripts;

import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;
import org.testng.annotations.*;


import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class ConfigGetPerformance extends ExtentReport{


    private String packageName;
    private Thread thread;
    private boolean paraThread;
    private String dadosMemoria = "", dadosCpu = "", dadosDownload = "", dadosUpload = "", dadosMemPrivate = "";


    public ConfigGetPerformance(String packageName, String deviceSerial) {
        super(deviceSerial);
        this.packageName = packageName;

    }


    @BeforeMethod
    public void setupPerformance() {
        this.paraThread = false;
        this.limpaConsumoMemoria();
        this.dataPerformanceCollection(this.packageName).start();
    }


    @AfterMethod
    public void dataCollection(Method method) {
        this.paraThread = true;
        logEvent(Status.INFO, "Consumo de Memória Principal " + this.capturaComsumoMemoria());

//        this.dadosMemoria = "";
//        this.dadosMemPrivate ="";
//        this.dadosCpu = "";
//        this.dadosUpload = "";
//        this.dadosDownload ="";
    }

    @AfterSuite
    public void resultados() {

        System.out.println("Pss Memory");
        System.out.println(this.dadosMemoria);
        System.out.println("Private Memory");
        System.out.println(this.dadosMemPrivate);
        System.out.println("CPU");
        System.out.println(this.dadosCpu);
        System.out.println("dowload");
        System.out.println(this.dadosDownload);
        System.out.println("upload");
        System.out.println(this.dadosUpload);
    }




    public void snapShotRecursos(String packageNameApp) {
        try {
            List<Object> rede = ConfigAppium.getAndroidDriver().getPerformanceData(packageNameApp, "networkinfo", 1).get(1);
//        System.out.println("rx = " + rede.get(2));
//        System.out.println("rt = " + rede.get(4));
            guardaDownloadInfo(rede.get(2).toString());
            guardaUploadInfo(rede.get(4).toString());
            List<Object> memoria = ConfigAppium.getAndroidDriver().getPerformanceData(packageNameApp, "memoryinfo", 1).get(1);
//        System.out.println("memoria = " + memoria);
            guardaMemoryInfoPss(memoria.get(5).toString());
            guardaMemoryInfoPrivate(memoria.get(0).toString());

        } catch (Exception e) {

        }

//        try {
//            List<Object> cpu = this.androidDriver.getPerformanceData(packageNameApp, "cpuinfo", 10).get(1);
//            String cpuR = String.valueOf(Integer.parseInt(cpu.get(0).toString()) + Integer.parseInt(cpu.get(1).toString()));
////            System.out.println("CPU = " + cpuR);
//            guardaCpuInfo(cpuR);
//
//        } catch (Exception e) {
//
//        }

    }


    private Thread dataPerformanceCollection(String packageNameApp) {
        this.thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    snapShotRecursos(packageNameApp);
                    if (paraThread) {
                        return;
                    }
                }
            }
        };
        return thread;
    }

    private void limpaConsumoMemoria() {

        ConfigAppium.getAndroidDriver().executeScript("mobile: shell", parametroComamd(parametroLimpaConsumoMemoriaArgs()));

    }

    private String capturaComsumoMemoria() {
        return (String) ConfigAppium.getAndroidDriver().executeScript("mobile: shell", parametroComamd(parametroConsumoMemoriaArgs()));
    }

    private static Map<String, Object> parametroComamd(List<String> objeto) {
        Map<String, Object> removePicsCmd = ImmutableMap.of(
                "command", "dumpsys",
                "args", objeto
        );
        return removePicsCmd;
    }

    private List<String> parametroLimpaConsumoMemoriaArgs() {
        List<String> removePicsArgs = Arrays.asList(
                "procstats",
                this.packageName,
                "--clear"
        );

        return removePicsArgs;

    }

    private List<String> parametroConsumoMemoriaArgs() {
        List<String> removePicsArgs = Arrays.asList(
                "procstats",
                this.packageName,
                "--current",
                " |grep 'TOTAL'",
                " |tail -1"
        );

        return removePicsArgs;

    }

    private void guardaMemoryInfoPss(String memoria) {

        this.dadosMemoria += new SimpleDateFormat("hh:mm:ss").format(new Date()) + ";" + memoria + "\n";

    }

    private void guardaMemoryInfoPrivate(String memoria) {

        this.dadosMemPrivate += new SimpleDateFormat("hh:mm:ss").format(new Date()) + ";" + memoria + "\n";

    }

//    private void guardaCpuInfo(String cpu) {
//
//        this.dadosCpu += new SimpleDateFormat("hh:mm:ss").format(new Date()) + ";" + cpu + "\n";
//
//    }

    private void guardaDownloadInfo(String download) {

        this.dadosDownload += new SimpleDateFormat("hh:mm:ss").format(new Date()) + ";" + download + "\n";

    }

    private void guardaUploadInfo(String upload) {

        this.dadosUpload += new SimpleDateFormat("hh:mm:ss").format(new Date()) + ";" + upload + "\n";

    }


//    private static List<String> parametroMemoriaArgs () {
//        List<String> removePicsArgs = Arrays.asList(
//                "meminfo",
//                "com.agendeiquadras",
//                " |grep 'TOTAL'",
//                " |awk 'NR==1'"
//        );
//
//        return removePicsArgs;
//
//    }
//
//    private static Map<String,Object> parametroMemoriaComamd(){
//        Map<String, Object> removePicsCmd = ImmutableMap.of(
//                "command", "dumpsys",
//                "args", parametroMemoriaArgs()
//        );
//        return removePicsCmd;
//    }
//    //dumpsys cpuinfo \| grep "'com.agendeiquadras'"
//
//    private static List<String> parametroCpuArgs () {
//        List<String> removePicsArgs = Arrays.asList(
//                "cpuinfo",
//                " |grep 'com.a'"
//
//        );
//
//        return removePicsArgs;
//
//    }
//
//    private static Map<String,Object> parametroCpuComamd(){
//        Map<String, Object> removePicsCmd = ImmutableMap.of(
//                "command", "dumpsys",
//                "args", parametroCpuArgs()
//        );
//        return removePicsCmd;
//    }

}
