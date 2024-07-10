package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.LandingPagePO;
import br.com.claro.utils.AcoesAndroid;
import static br.com.claro.utils.PDF.*;

public class LandingPagePA {
    public static void criarArquivoPDF(String string) {
        try {
            criaDocumento(string);
            insereCaBecalho();
            escreveTitulo("Tela Landing Page");
            escreveSubTitulo("Precondição:\nPossuir o aplicativo Claro música instalado");
            escreveStep("Validar os dados da tela Landing Page e clicar em Escute Grátis");
        } catch (Exception e) {
            escreveErroException(e.getMessage());
        }
    }
    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "Logo Claro Musica superior":
                    AcoesAndroid.aguardaElementoPresente(LandingPagePO.logoCalroMusica);
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(LandingPagePO.logoCalroMusica)) {
                        escreveDocumento("Logo Claro Música");
                    } else{
                        escreveErroException("Logo Claro Música não encontrado!!!");
                    }
                    break;
                case "Ícone de idiomas":
                    if (AcoesAndroid.validarElementoPresente(LandingPagePO.iconePais)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Logo Claro Musica central":
                    if (AcoesAndroid.validarElementoPresente(LandingPagePO.logoCalroMusicaCentral)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
            }
        }catch (Exception e){
            escreveErroException(e.getMessage());
        }
    }
    public static void validarTexto(String string) {
        switch (string) {
            case "Ouça tudo o que você ama, em um só lugar.":
                AcoesAndroid.validarTexto(string, LandingPagePO.textoOucaTudo);
                break;
            case "Mais de 100 milhões de músicas, playlists e recomendações personalizadas.":
                AcoesAndroid.validarTexto(string, LandingPagePO.textoMaisDe100);
                break;
            case "Escute grátis":
                AcoesAndroid.validarTexto(string, LandingPagePO.btnEscuteGratis);
                break;
            case "Entrar":
                AcoesAndroid.validarTexto(string, LandingPagePO.btnEntrar);
                break;
        }
    }
    public static void clicarBotao() {
        AcoesAndroid.clicarBotao(LandingPagePO.btnEntrar);
    }
}
