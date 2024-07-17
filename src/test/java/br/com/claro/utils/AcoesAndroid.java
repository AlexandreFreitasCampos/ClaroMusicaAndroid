package br.com.claro.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class AcoesAndroid extends DriverFactory {
    private static String textoRecebido;
    private static List<String> erros = new ArrayList<>();

    public static void getURL(String string) {
        try {
            String textorecebido = getDriver().getCurrentUrl();
            Assert.assertEquals(string, textorecebido);
        } catch (AssertionError e) {
            PDF.escreveErroException(e.getMessage());
        }
    }

    public static boolean validarElementoPresente(String elemento) {
        List<MobileElement> elementos = (List<MobileElement>) getDriver().findElements(By.xpath(elemento));
        if (elementos.size() == 0) {
            erros.add(elemento + " não encontrado!!!");
        }

        return elementos.size() > 0;
    }

    public static void clicarBotao(String string) {
        getDriver().findElement(By.xpath(string)).click();
    }

    public static void validarTexto(String textoAtual, String xpath) {
        try {
            textoRecebido = getDriver().findElement(By.xpath(xpath)).getText();
            Assert.assertEquals(textoRecebido, textoAtual);
            PDF.escreveDocumento(textoRecebido);
        } catch (AssertionError e) {
            PDF.escreveErroTexto(textoAtual, textoRecebido);
            erros.add("Texto esperado: " + textoAtual);
            erros.add("Texto recebido: " + textoRecebido);
        }
    }

    public static void escreveTexto(String xpath, String string) {
        getDriver().findElement(By.xpath(xpath)).click();
        getDriver().executeScript("mobile: shell", ImmutableMap.of("command", "input text " + string));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //    public static void validarBotao(String textoAtual, String xpath) {
//        try {
//            textoRecebido = getDriver().findElement(By.xpath(xpath)).getText();
//            Assert.assertEquals(textoRecebido, textoAtual);
//            PDF.escreveDocumento("Botão " + textoRecebido);
//        }catch (AssertionError e){
//            PDF.escreveErroTexto(textoAtual, textoRecebido);
//            erros.add("Botão esperado: " + textoAtual);
//            erros.add("Botão recebido: " + textoRecebido);
//        }
//    }
    public static void aguardaElementoPresente(String elemento) {
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemento)));

    }

    public static void aguardaElementoClicavel(String elemento) {
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.elementToBeClickable(By.xpath(elemento)));

    }

    public static void salvarDocumento() {
        PDF.salvaDocumento();
        for (String erro : erros) {
            System.out.println("\u001B[31m" + erro + "\u001B[0m");
        }
    }

    public static void limparMsisdnSac(String msisdn, String usuario, String senha) {
        try {
            DriverFactoryWeb.getDriver().findElement(By.id("User")).sendKeys(usuario);
            DriverFactoryWeb.getDriver().findElement(By.id("fakePass")).sendKeys(senha);
            DriverFactoryWeb.getDriver().findElement(By.name("regular-login")).click();
            DriverFactoryWeb.getDriver().findElement(By.xpath("//div[@class='logo-store logo-es-mx img-circle dropdown-toggle']")).click();
            DriverFactoryWeb.getDriver().findElement(By.xpath("//a[text()='Claromusica - BR']")).click();
            Thread.sleep(2000);
            DriverFactoryWeb.getDriver().findElement(By.xpath("//a[text()='Blacklist']")).click();
            DriverFactoryWeb.getDriver().findElement(By.id("Msisdn")).sendKeys(msisdn);
            DriverFactoryWeb.getDriver().findElement(By.id("btn_process_msisdns")).click();
            DriverFactoryWeb.killDriver();
        } catch (Exception e) {

        }
    }

    public static void scrollAte(String string){
        boolean isFound = false;
        while (!isFound) {
            try {
                MobileElement element = (MobileElement) getDriver().findElement(By.xpath(string));
                isFound = element.isDisplayed();
            } catch (Exception e) {
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.8);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);

                new TouchAction<>(driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
            }
        }
    }
}



