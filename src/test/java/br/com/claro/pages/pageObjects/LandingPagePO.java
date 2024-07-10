package br.com.claro.pages.pageObjects;

public class LandingPagePO {
    public LandingPagePO(){

    }
    public static String  logoCalroMusica = "//android.widget.ImageView[@content-desc='Cm Logo']";
    public static String iconePais = "//android.view.View[@content-desc='country']";
    public static String  logoCalroMusicaCentral = "//android.widget.ImageView[@content-desc='claro_musica']";
    public static String textoOucaTudo = "//android.widget.TextView[contains(@text, 'Ouça tudo')]";
    public static String textoMaisDe100 = "//android.widget.TextView[contains(@text, 'Mais de 100 milhões')]";
    public static String btnEscuteGratis = "//android.widget.TextView[contains(@text, 'Escute grátis')]";
    public static String btnEntrar = "//android.widget.TextView[contains(@text, 'Entrar')]";
}
