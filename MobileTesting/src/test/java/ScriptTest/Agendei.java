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


public class Agendei extends ConfigAppium {

//Potocolo
//    limitação duante os tests
//    Abordagem do famework
//    uso do framework
//    relatorios
//    utilidade

    //consumo medio, minimo, maximo.

    //Limitações do trabalho, recursoso compartilhados de outras aplicações


    @Factory(dataProvider = "parallelDp", dataProviderClass = DataDeviceId.class)
    public Agendei(String deviceSerial) {
        super(deviceSerial, "com.agendeiquadras");
    }

    @Test
    public void realizaTutorial() {

        logEvent(Status.INFO, "Iniciou o teste");

        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        logEvent(Status.PASS, "Iniciou o tutorial");
        
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]");
        el1.click();
        el1.click();
        el1.click();
        el1.click();



    }

    @Test(dependsOnMethods = "editaPerfil")
    public void realizaCadastro() {

        logEvent(Status.INFO, "Iniciou o teste");
        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]");
        el1.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementById("android:id/button1");
        el2.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Cadastra novo usuario");
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        el4.sendKeys("nome");
        MobileElement el5 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el5.sendKeys("teste3@teste.com.br");
        MobileElement el7 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView");
        el7.click();
        getAndroidDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        MobileElement el8 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        getAndroidDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        el8.sendKeys("61999999999");
        MobileElement el9 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el9.sendKeys("12122012");
        el9.click();
        MobileElement el10 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]");
        el10.click();
        MobileElement el11 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView");
        el11.click();
        MobileElement el12 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"Masculino"+"']");
        el12.click();

        MobileElement el111 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView");
        el111.click();

        logEvent(Status.PASS, "Inserindo dados do local");
        MobileElement el13 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        el13.sendKeys("rua");
        MobileElement el14 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el14.sendKeys("123");
        MobileElement el15 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
        el15.sendKeys("bairro");
        MobileElement el16 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");
        el16.sendKeys("alegrete");
        MobileElement el17 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView");
        el17.click();

        logEvent(Status.PASS, "Inserindo senha");
        getAndroidDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        MobileElement el18 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        getAndroidDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        el18.sendKeys("123456");
        MobileElement el19 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el19.sendKeys("123456");
        MobileElement el20 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
        el20.click();

        logEvent(Status.PASS, "Confirmando criação de usuario");

        MobileElement el22 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView");
        el22.click();
        MobileElement el23 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView");
        el23.click();


    }

    @Parameters({"email", "senha"})
    @Test(dependsOnMethods = "realizaTutorial")
    public void realizaLogin(String email, String senha) {
        logEvent(Status.INFO, "Iniciou o teste");

        getAndroidDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

        logEvent(Status.PASS, "Digitando dados");
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        el1.sendKeys(email);
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el2.sendKeys(senha);
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView");
        el3.click();


    }

    @Test (dependsOnMethods = "realizaLogin")
    public void selecionaQuadra () {

        logEvent(Status.INFO, "Iniciou o teste.");
        getAndroidDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Reservar quadra");

        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View");
        el1.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        rolagemTelaVertical(0.8,0.1);

        logEvent(Status.PASS, "Escolhe local");
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"Agendei Quadras"+"']");
        el2.click();

        logEvent(Status.PASS, "Escolhe quadra");
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
        el3.click();

    }

    @Test (dependsOnMethods = "selecionaQuadra")
    public void reservaQuadra () {
        logEvent(Status.INFO, "Iniciou o teste.");

        getAndroidDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Selecionou a data.");
        //pode parametrizar
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+14+"']");
        el1.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        rolagemTelaVertical(0.9,0.4);

        logEvent(Status.PASS, "Selecionou horario.");
        //pode parametrizar
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"22:00 - 23:00"+"']");
        el2.click();

        logEvent(Status.PASS, "Confirmou horario.");
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
        el3.click();


        MobileElement el4 = (MobileElement) getAndroidDriver().findElementById("android:id/button1");
        el4.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Volta ao menu principal.");
        MobileElement el5 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
        el5.click();
    }

    @Test (dependsOnMethods = "reservaQuadra")
    public void editaPerfil () {
        logEvent(Status.INFO, "Iniciou o teste.");

        getAndroidDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        logEvent(Status.PASS, "Edita perfil");
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[2]");
        el1.click();

        logEvent(Status.PASS, "Preenchendo dados...");
        MobileElement el2 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText");
        el2.sendKeys("Marcus");
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText");
        el3.sendKeys("61666666666");
        MobileElement el4 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText");
        el4.sendKeys("12122012");

        logEvent(Status.PASS, "Seleciona genero");
        MobileElement el5 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) getAndroidDriver().findElementByXPath("//*[@text='"+"Masculino"+"']");
        el6.click();

        rolagemTelaVertical(0.9,0.1);

//        logEvent(Status.PASS, "Preenchendo dados...");
//        MobileElement el7 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText");
//        el7.sendKeys("rua");
//
//        MobileElement el8 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.EditText");
//        el8.sendKeys("2");
//
//        MobileElement el9 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText");
//        el9.sendKeys("bairro");
//
//        MobileElement el10 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.EditText");
//        el10.sendKeys("Alegrete");

        logEvent(Status.PASS, "Salva mudanças");
        MobileElement el11 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
        el11.click();
        MobileElement el12 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText");
        el12.sendKeys("123456");
        MobileElement el13 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView");
        el13.click();

        getAndroidDriver().navigate().back();

    }

    @Test (dependsOnMethods = "editaPerfil")
    public void cancelaRserva () {
        logEvent(Status.INFO, "Iniciou o teste");
        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        logEvent(Status.PASS, "Meus horarios");
        MobileElement el1 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.View");
        el1.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Seleciona horario");
        MobileElement el3 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]");
        el3.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Cancela horario");
        MobileElement el4 = (MobileElement) getAndroidDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
        el4.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Confirma canccelamento");
        MobileElement el5 = (MobileElement) getAndroidDriver().findElementById("android:id/button1");
        el5.click();

        getAndroidDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        logEvent(Status.PASS, "Volta ao menu");
        getAndroidDriver().navigate().back();
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
