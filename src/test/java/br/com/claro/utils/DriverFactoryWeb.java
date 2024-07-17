package br.com.claro.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class DriverFactoryWeb {
    // Cria a variavel global driver
    protected static WebDriver driver;

    // Método paraAcessar o metodo createDriver
    public static WebDriver getDriver() {
        // Se o driver for nulo,  cria um novo driver
        if (driver == null) {
            try {
                createDriver();
            } catch (MalformedURLException e) {
                System.out.println("Falha ao inicializar o driver" + e.getMessage());
            }
        }
        return driver;
    }

    // Método para criar o driver
    protected static void createDriver() throws MalformedURLException {
        // Configurar o WebDriverManager para gerenciarAutomaticamente o ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // Inicializar o ChromeDriver
        driver = new ChromeDriver();

        driver.get("https://sac.imusica.com.br/pt-br/account/index/");
        driver.manage().window().maximize();
    }

    // Método para fechar o driver
    public static void killDriver() {
        // Se o driver for diferente de null
        if (driver != null) {
            // Fechaa o  driver
            driver.quit();
            // Limpa o driver
            driver = null;
        }
    }


}
