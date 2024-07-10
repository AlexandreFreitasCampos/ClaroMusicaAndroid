package br.com.claro.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Screenshot extends DriverFactory{
    static String nomeArquivo;
    public static void takeScreenshot() throws IOException {
        Random gerador =  new Random();

        // imprime sequência de 15 números inteirosAleatórios

        nomeArquivo =  Integer.toString(gerador.nextInt());
        nomeArquivo =  nomeArquivo.replace("-",  "");// remove tuodos os -
        nomeArquivo =  nomeArquivo + ".png";

        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        BufferedImage originalImage = ImageIO.read(screenshot);

        // Redimensiona a imagem
        int newWidth = 600; // largura desejada
        int newHeight = 1200; // altura desejada
        BufferedImage resizedImage = resizeImage(originalImage, newWidth, newHeight);

        // Salva a imagem redimensionada
        File output = new File("C:\\Automacao\\Img\\" + nomeArquivo);
        ImageIO.write(resizedImage, "png", output);
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();
        return outputImage;
    }
}
