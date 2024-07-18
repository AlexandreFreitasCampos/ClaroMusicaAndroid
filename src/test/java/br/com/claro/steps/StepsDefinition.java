package br.com.claro.steps;


import br.com.claro.pages.pageActions.*;
import br.com.claro.utils.AcoesAndroid;
import br.com.claro.utils.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.BeforeClass;

public class StepsDefinition {
    public StepsDefinition() {
        DriverFactory.getDriver();
    }

    @Dado("que criei o arquivo {string}")
    public void queCrieiOArquivo(String string) {
        switch (string){
            case "tela_de_permissoes":
                TelaPermissoesPA.criaArquivoPDF(string);
                //AcoesAndroid.limparMsisdnSac("5521966124127", "alexandre.campos", "@Gg190504");
                break;
            case "landing_page":
                LandingPagePA.criarArquivoPDF(string);
                break;
            case "cadastro_msisdn":
                CadastroMSISDNPA.criarArquivoPDF(string);
                break;
            case "onboarding":
                OnboardingPA.criarArquivoPDF(string);
                break;
            case "assinatura_mensal":
                PlanoMensalPA.criarArquivoPDF(string);
                break;
        }
    }
    @Quando("valido a imagem {string} {string}")
    public void validoAImagem(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.validarImagem(string);
        }else if (string2.equals("Landing Page")) {
            LandingPagePA.validarImagem(string);
        }else if (string2.equals("CadastroMSISDN")) {
            CadastroMSISDNPA.validarImagem(string);
        }else if (string2.equals("Onboarding")) {
            OnboardingPA.validarImagem(string);
        }else if (string2.equals("Plano mensal")) {
            PlanoMensalPA.validarImagem(string);
        }
    }
    @Quando("valido o texto {string} {string}")
    public void validoOTexto(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.validarTexto(string);
        }else if(string2.equals("Landing Page")){
            LandingPagePA.validarTexto(string);
        }else if(string2.equals("CadastroMSISDN")){
            CadastroMSISDNPA.validarTexto(string);
        }else if(string2.equals("Onboarding")){
            OnboardingPA.validarTexto(string);
        }else if(string2.equals("Plano mensal")){
            PlanoMensalPA.validarTexto(string);
        }

    }
    @E("clico no botao {string} {string}")
    public void clicoNoBotao(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.clicarBotao(string);
        }else if(string2.equals("Landing Page")){
            LandingPagePA.clicarBotao();
        }else if(string2.equals("CadastroMSISDN")){
            CadastroMSISDNPA.clicarBotao(string);
        }else if(string2.equals("Onboarding")){
            OnboardingPA.clicarBotao(string);
        }else if(string2.equals("Perfil")){
            MenuPerfilPA.clicarBotao(string);
        }else if(string2.equals("Plano mensal")){
            PlanoMensalPA.clicarBotao(string);
        }
    }
    @Quando("insiro o texto {string} {string}")
    public void insiroOTexto(String string, String string2) {
        if(string2.equals("CadastroMSISDN")){
            CadastroMSISDNPA.inserirTexto(string);
        }
    }
    @Entao("seleciono os {int} primeiros artistas {string}")
    public void selecionoOsPrimeirosArtistas(Integer artistas, String string) {
            OnboardingPA.selecionarArtistas(artistas);
    }
    @Quando("valido o carrossel {string} {string}")
    public void validoOCarrossel(String string, String string2) {
        if(string2.equals("Home")){
            HomePA.validarCarrossel(string);
        }
    }

    @Entao("salvo o documento")
    public void salvoODocumento() {
        AcoesAndroid.salvarDocumento();
    }
}
