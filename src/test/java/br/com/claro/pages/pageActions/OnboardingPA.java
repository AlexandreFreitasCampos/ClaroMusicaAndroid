package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.LandingPagePO;
import br.com.claro.pages.pageObjects.OnboardingPO;
import br.com.claro.utils.AcoesAndroid;
import br.com.claro.utils.PDF;

import static br.com.claro.utils.PDF.*;

public class OnboardingPA {

    public static void criarArquivoPDF(String string) {
        try {
            criaDocumento(string);
            insereCaBecalho();
            escreveTitulo("Realizar o onboarding");
            escreveSubTitulo("Precondição:\nPossuir o aplicativo Claro música instalado\nPossuir um MSISDN" +
                    " sem cadastro no Claro Música");
        } catch (Exception e) {
            escreveErroException(e.getMessage());
        }
    }

    public static void validarTexto(String string) {
        if(AcoesAndroid.validarElementoPresente(OnboardingPO.btnPermitir)){
            AcoesAndroid.clicarBotao(OnboardingPO.btnPermitir);
        }

        switch (string) {
            case "Escolha pelo menos 3 artistas que você goste":
                AcoesAndroid.aguardaElementoClicavel(OnboardingPO.campoBusca);
                PDF.escreveStep("Validar o texto '" + string + "' e escolher o primeiro artista");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtSelecao);
                break;
            case "Escolha pelo menos mais 2 artistas que você goste":
                PDF.escreveStep("Validar o texto '" + string + "' e escolher o segundo artista");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtSelecao);
                break;
            case "Escolha pelo menos mais 1 artista":
                PDF.escreveStep("Validar o texto '" + string + "' e escolher o terceiro artista");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtSelecao);
                break;
            case "Fique à vontade para escolher até 10 artistas":
                PDF.escreveStep("Validar o texto '" + string + "' e escolher mais 7 artistas ");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtSelecao);
                break;
            case "Você já escolheu seus 10 artistas":
                PDF.escreveStep("Validar o texto '" + string + "' e clicar no botão Continuar ");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtSelecao);
                break;
        }
    }

    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "Campo de busca":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.campoBusca);
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.campoBusca)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string);
                    }
                    break;
                case "Botão Pular":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.btnPular);
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnPular)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string);
                    }
                    break;
                case "Botão Continuar":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.btnContinuar);
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnContinuar)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string);
                    }
                    break;
            }
        }catch (Exception e){
            escreveErroException(e.getMessage());
        }
    }

    public static void selecionarArtistas(Integer artistas) {
        if(artistas <= 4){
            AcoesAndroid.clicarBotao(OnboardingPO.listaArtistas + "[" + artistas + "]");
        }else{
            for(int i = 5; i<= artistas; i++){
                AcoesAndroid.clicarBotao(OnboardingPO.listaArtistas + "[" + i + "]");
            }
        }
    }

    public static void clicarBotao(String string) {
        switch (string){
            case "Continuar":
                //AcoesAndroid.clicarBotao(OnboardingPO.btnContinuar);
                break;
        }
    }
}
