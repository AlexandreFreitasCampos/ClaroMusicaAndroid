package br.com.claro.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
public class DriverFactory {

    // Cria a variavel global driver
    protected static AndroidDriver<?> driver;

    // Método para acessar o metodo createDriver
    public static AndroidDriver<?> getDriver()  {
        criaPastas();
        // Se o driver for nulo, cria um novo driver
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void criaPastas() {
        // Caminho das pastas
        File evidencias = new File("C:\\Automacao\\Evidencias\\Claro Musica Android");
        File img = new File("C:\\Automacao\\Img");
        File log = new File("C:\\Automacao\\Log");
        File Massa = new File("C:\\Automacao\\Massa de dados");

        // Se não existir, cria o diretório
        if (!evidencias.exists()) {
            evidencias.mkdirs();
        }
        // Se não existir, cria o diretório
        if (!img.exists()) {
            img.mkdirs();
        }
        // Se não existir, cria o diretório
        if (!log.exists()) {
            log.mkdirs();
        }
        // Se não existir, cria o diretório
        if (!Massa.exists()) {
            Massa.mkdirs();
        }

    }

    // Método para criar o driver
    protected static void createDriver() {

        // Capacidades geradas no Appium Inspector
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "R38M504E5LR");
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:appPackage", "com.claro.claromusica.br");
        desiredCapabilities.setCapability("appium:appActivity", "com.amco.activities.NewSplashActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("noReset", true);
        // Para instalar um APK (desmarcar appPackage e appActivity
        // desiredCapabilities.setCapability(MobileCapabilityType.APP, "Caminho do
        // APP");XXXO

        // Nova instância do driver do android
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para fechar o driver
    public static void killDriver() {
        // Se o driver for diferente de null
        if (driver != null) {
            // Fecha a driver
            driver.quit();
            // Limpa o driver
            driver = null;
        }
    }

}
