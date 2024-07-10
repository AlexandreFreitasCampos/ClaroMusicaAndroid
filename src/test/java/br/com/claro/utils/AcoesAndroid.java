package br.com.claro.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static boolean validarElementoPresente(String elemento){
        List<MobileElement> elementos = (List<MobileElement>) getDriver().findElements(By.xpath(elemento));
        if(!elemento.equals("//android.widget.Button[@resource-id='android:id/button1']")
            && elementos.size() == 0){
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
        }catch (AssertionError e){
            PDF.escreveErroTexto(textoAtual, textoRecebido);
            erros.add("Texto esperado: " + textoAtual);
            erros.add("Texto recebido: " + textoRecebido);
        }
    }
    public static void escreveTexto(String xpath, String string ){
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
    public static void salvarDocumento(){
        PDF.salvaDocumento();
        if(erros.size() > 0){
            System.out.println("\u001B[31mFalha na execução do teste!!!\u001B[0m");
        }
        for(String erro : erros){
            System.out.println("\u001B[31m" + erro + "\u001B[0m");
        }
    }

    public static void highlightElement(String element) {
        MobileElement elemento = (MobileElement) getDriver().findElement(By.xpath(element));
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        //js.executeScript("arguments[0].style.border='3px solid red'", elemento);
        if (driver instanceof JavascriptExecutor) {
            System.out.println("Vou realçar");
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elemento);
        }
    }

}
