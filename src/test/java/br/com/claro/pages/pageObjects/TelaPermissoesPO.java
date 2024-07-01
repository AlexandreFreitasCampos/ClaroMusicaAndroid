package br.com.claro.pages.pageObjects;

import br.com.claro.utils.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TelaPermissoesPO extends DriverFactory {

    public TelaPermissoesPO() {

    }

    //public static List<String > listBtnRoot = "//android.widget.Button[@resource-id='android:id/button1']";
    public static String  btnRoot = "//android.widget.Button[@resource-id='android:id/button1']";
    public static String logoPermissoes1 = "//android.widget.LinearLayout[@resource-id='com.claro.claromusica.br:id/linearLayout_header']/android.widget.ImageView[1]";
    public static String logoPermissoes2 = "//android.widget.LinearLayout[@resource-id='com.claro.claromusica.br:id/linearLayout_header']/android.widget.ImageView[2]";
    public static String textoBemVindo = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_title']";
    public static String textoParaMelhorar = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_subtitle']";
    public static String iconeTelefone = "(//android.widget.ImageView[@resource-id='com.claro.claromusica.br:id/imageview_icon'])[1]";
    public static String textoNumeroTelefone = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_name'][1]";
    public static String textoParaFazerLogin = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_description'][1]";
    public static String iconeEmail = "(//android.widget.ImageView[@resource-id='com.claro.claromusica.br:id/imageview_icon'])[2]";
    public static String textoEmail = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_name' and @text='E-mail:']";
    public static String textoParaFazerLogin2 = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_description' and @text='Para fazer login ou registrar-se.']";
    public static String iconeInformacoes = "(//android.widget.ImageView[@resource-id='com.claro.claromusica.br:id/imageview_icon'])[3]";
    public static String textoInformacoesDispositivo = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_name' and @text='Informações do dispositivo:']";
    public static String textoParaMelhorarSuaExperiencia = "//android.widget.TextView[@text='Para melhorar sua experiência analisando dados de uso, erros etc.']";
    public static String iconeDadosDemoraficos = "(//android.widget.ImageView[@resource-id='com.claro.claromusica.br:id/imageview_icon'])[4]";
    public static String textoDadosDemograficos = "//android.widget.TextView[@text='Dados Demográficos:']";
    public static String textoParaRealizar = "//android.widget.TextView[@text='Para realizar compras e personalizar sua conta.']";
    public static String btnAceitarContinuar = "//android.widget.Button[@resource-id='com.claro.claromusica.br:id/button_accept']";
    public static String linkRecusar = "//android.widget.TextView[@resource-id='com.claro.claromusica.br:id/textview_reject']";
}
