package br.com.claro.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class AcoesAndroid extends DriverFactory {


    public static void getURL(String string) {
        try {
            String textorecebido = getDriver().getCurrentUrl();
            Assert.assertEquals(string, textorecebido);
        } catch (AssertionError e) {
            PDF.escreveErroException(e.getMessage());
        }
    }
    public static boolean validarElementoPresente(String elemento){
        List<MobileElement> elementos = (List<MobileElement>) getDriver().findElements(By.xpath(elemento));
            return elementos.size() > 0;
    }
    public static void clicarBotao(String string) {
        getDriver().findElement(By.xpath(string)).click();
    }

    public static void validarTexto(String textoAtual, String string) {
        String textoRecebido = getDriver().findElement(By.xpath(string)).getText();
        if(textoAtual.equals(textoRecebido)){
            PDF.escreveDocumento("Texto: " + textoRecebido);
        }else{
            PDF.escreveErroTexto(textoAtual, textoRecebido);
        }
    }
    public static void validarBotao(String textoAtual, String string) {
        String textoRecebido = getDriver().findElement(By.xpath(string)).getText();
        if(textoAtual.equals(textoRecebido)){
            PDF.escreveDocumento("Botão: " + textoRecebido);
        }else{
            PDF.escreveErroTexto(textoAtual, textoRecebido);
        }
    }

    public static void aguardaElementoPresente(String elemento) {
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemento)));

    }


    public static void clicarBotao(By by) {
        System.out.println("Estou no acoes");
        getDriver().findElement(by).click();
    }
}
