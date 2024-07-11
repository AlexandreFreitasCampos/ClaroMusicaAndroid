package br.com.claro.pages.pageObjects;

public class OnboardingPO {
    public OnboardingPO() {

    }

    public static String btnPermitir = "//android.widget.Button[contains(@text, 'Permitir')]";
    public static String txtSelecao = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView";
    public static String campoBusca = "//android.widget.TextView[@text='Buscar']";
    public static String listaArtistas = "(//android.view.View[@content-desc='Top Artist Card'])";
    public static String btnPular = "//android.widget.TextView[@text='Pular']";
    public static String btnContinuar = "//android.widget.TextView[@text='Continuar']";
    public static String inputSMS = "//android.widget.TextView[@text='0 0 0 0 0 0']";
}
