package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.LandingPagePO;
import br.com.claro.pages.pageObjects.OnboardingPO;
import br.com.claro.utils.AcoesAndroid;
import br.com.claro.utils.PDF;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.BeforeClass;

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
//        if(AcoesAndroid.validarElementoPresente(OnboardingPO.btnPermitir)){
//            AcoesAndroid.clicarBotao(OnboardingPO.btnPermitir);
//        }

        switch (string) {
            case "Quais artistas você mais gosta?":
                AcoesAndroid.aguardaElementoClicavel(OnboardingPO.txtQuaisArtistas);
                PDF.escreveStep("Validar o texto '" + string + "' e clicar em + para voltar para o Onboarding");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtQuaisArtistas);
                break;
            case "Vamos começar!":
                AcoesAndroid.aguardaElementoClicavel(OnboardingPO.txtVamosComecar);
                PDF.escreveStep("Validar a tela de início e clicar em Tocar agora");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtVamosComecar);
                break;
            case "Aproveite essas músicas enquanto descobrimos mais sobre você":
                AcoesAndroid.validarTexto(string, OnboardingPO.txtAproveiteEssasMusicas);
                break;
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
            case "Bem-vindo! Aproveite grátis":
                AcoesAndroid.aguardaElementoPresente(OnboardingPO.txtBemVindo);
                PDF.escreveStep("Validar o texto '" + string + "' e clicar no botão Entendido ");
                inserePrint();
                AcoesAndroid.validarTexto(string, OnboardingPO.txtBemVindo);
                break;
            case "Cliente Claro, temos uma promoção pra você escutar música ilimitada!":
                AcoesAndroid.validarTexto(string, OnboardingPO.txtClienteClaro);
                break;
            case "Boa escolha!":
                AcoesAndroid.validarTexto(string, OnboardingPO.txtBoaEscolha);
                break;
            case "Radio, DJ’s, shows exclusivos e muito mais":
                AcoesAndroid.validarTexto(string, OnboardingPO.txtRadioDJs);
                break;
        }
    }

    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "Campo de busca":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.campoBusca);
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.campoBusca)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão Pular":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.btnPular);
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnPular)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão Continuar":
                    AcoesAndroid.aguardaElementoPresente(OnboardingPO.btnContinuar);
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnContinuar)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão Tocar agora":
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnTocarAgora)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão Agora não":
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.btnAgoraNao)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Artistas selecionados":
                    AcoesAndroid.aguardaElementoClicavel(OnboardingPO.btnTocarAgora);
                    if (AcoesAndroid.validarElementoPresente(OnboardingPO.listaArtistasRecomendados)) {
                        escreveStep("Validar a tela de " + string + " e clicar no botão Agora não");
                        inserePrint();
                    } else{
                        escreveErroException(string + " não encontrado!!!");
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
            case "Pular":
//                AcoesAndroid.limparMsisdnSac("5521966124127", "alexandre.campos", "@Gg190504");
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                AcoesAndroid.aguardaElementoClicavel(OnboardingPO.campoBusca);
                escreveStep("Clicar no botão pular para saltar o Onboarding");
                inserePrint();
                AcoesAndroid.clicarBotao(OnboardingPO.btnPular);
                break;
            case "Permitir":
                    try {
                        Thread.sleep(5000);
                        if(AcoesAndroid.validarElementoPresente(OnboardingPO.btnPermitir)){
                            AcoesAndroid.clicarBotao(OnboardingPO.btnPermitir);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case "Continuar":
                AcoesAndroid.clicarBotao(OnboardingPO.btnContinuar);
                break;
            case "Realizar Onboarding":
                AcoesAndroid.clicarBotao(OnboardingPO.btnRealizarOnboarding);
                break;
            case "Entendido":
                AcoesAndroid.clicarBotao(OnboardingPO.btnEntendido);
                break;
            case "Tocar agora":
                AcoesAndroid.clicarBotao(OnboardingPO.btnTocarAgora);
                break;
            case "Fechar oferta grátis":
                AcoesAndroid.clicarBotao(OnboardingPO.btnFecharOfertaGratis);
                break;
            case "Pausar a música":
                AcoesAndroid.clicarBotao(OnboardingPO.btnPlayPause);
                break;
            case "Agora não":
                AcoesAndroid.clicarBotao(OnboardingPO.btnAgoraNao);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
}
