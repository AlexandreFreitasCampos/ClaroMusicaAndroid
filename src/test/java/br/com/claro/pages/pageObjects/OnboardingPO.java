package br.com.claro.pages.pageObjects;

public class OnboardingPO {
    public OnboardingPO() {

    }
    public static String txtQuaisArtistas = "//android.widget.TextView[@text='Quais artistas você mais gosta?']";
    public static String btnRealizarOnboarding = "//android.view.View[@content-desc='CmSelectArtist SM']";
    public static String txtVamosComecar = "//android.widget.TextView[@text='Vamos começar!']";
    public static String txtAproveiteEssasMusicas = "//android.widget.TextView[contains(@text, 'Aproveite essas músicas')]";
    public static String txtBemVindo = "//android.widget.TextView[@text='Bem-vindo! Aproveite grátis']";
    public static String btnTocarAgora = "//android.widget.TextView[@text='Tocar agora']";
    public static String btnAgoraNao = "//android.widget.TextView[@text='Agora não']";
    public static String btnPermitir = "//android.widget.Button[@text='Permitir']";
    public static String txtSelecao = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView";
    public static String campoBusca = "//android.widget.TextView[@text='Buscar']";
    public static String listaArtistas = "(//android.view.View[@content-desc='Top Artist Card'])";
    public static String btnPular = "//android.widget.TextView[@text='Pular']";
    public static String btnContinuar = "//android.widget.TextView[@text='Continuar']";
    public static String inputSMS = "//android.widget.TextView[@text='0 0 0 0 0 0']";
    public static String btnEntendido = "//android.widget.TextView[@text='Entendido']";
    public static String txtClienteClaro = "//android.widget.TextView[contains(@text, 'Cliente Claro,')]";
    public static String btnFecharOfertaGratis = "//android.widget.ImageView[@resource-id='com.claro.claromusica.br:id/btn_close']";
    public static String btnPlayPause = "//android.widget.ImageView[@content-desc='Play icon']";
    public static String listaArtistasRecomendados = "//android.widget.ImageView[@content-desc='Recommendation Artist']";
    public static String txtBoaEscolha = "//android.widget.TextView[@text='Boa escolha!']";
    public static String txtRadioDJs = "//android.widget.TextView[contains(@text, 'Radio, DJ’s,')]";


}
