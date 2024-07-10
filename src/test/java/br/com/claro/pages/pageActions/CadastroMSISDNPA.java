package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.CadastroPO;
import br.com.claro.pages.pageObjects.LandingPagePO;
import br.com.claro.utils.AcoesAndroid;

import java.util.NoSuchElementException;

import static br.com.claro.utils.PDF.*;
import static br.com.claro.utils.PDF.escreveErroException;

public class CadastroMSISDNPA {
    public static void criarArquivoPDF(String string) {
        try {
            criaDocumento(string);
            insereCaBecalho();
            escreveTitulo("Realizar o cadastro com MSISDN");
            escreveSubTitulo("Precondição:\nPossuir o aplicativo Claro música instalado\nPossuir um MSISDN" +
                    " sem cadastro no Claro Música");
        } catch (Exception e) {
            escreveErroException(e.getMessage());
        }
    }
    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "Logo Claro Musica msisdn":
                    AcoesAndroid.aguardaElementoPresente(CadastroPO.logoCalroMusica);
                    escreveStep("Validar a tela de login com MSISDN");
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.logoCalroMusica)) {
                        escreveDocumento("Logo Claro Musica");
                    }else{
                        escreveErroException("Logo Claro Musica não encontrado!!!");
                    }
                    break;
                case "Ícone de idiomas":
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.iconePais)) {
                        escreveDocumento(string);
                    }else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Ícone Email":
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.iconeEmail)) {
                        escreveDocumento(string);
                    }else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Ícone Facebook":
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.iconeFacebook)) {
                        escreveDocumento(string);
                    }else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Ícone Claro TV":
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.iconeClaroTV)) {
                        escreveDocumento(string);
                    }else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão seguinte":
                    if (AcoesAndroid.validarElementoPresente(CadastroPO.btnSeguinte)) {
                        escreveDocumento(string);
                    }else{
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
            case "Entrar com seu número Claro":
                AcoesAndroid.validarTexto(string, CadastroPO.textoEntrarCom);
                break;
            case "Seu número Claro":
                AcoesAndroid.validarTexto(string, CadastroPO.textoSeuNumero);
                break;
            case "Ou entre com":
                AcoesAndroid.validarTexto(string, CadastroPO.textoOuEntreCom);
                break;
            case "Ao utilizar nossos serviços, você aceita os Termos e Condições e Política de Privacidade":
                AcoesAndroid.validarTexto(string, CadastroPO.textoAoUtilizar);
                break;
        }
    }
    public static void clicarBotao(String string) {
        AcoesAndroid.clicarBotao(CadastroPO.btnSeguinte);
    }

    public static void inserirTexto(String string) {
        try{
            escreveStep("Inserir o MSISDN e clicar no botão Segunte");
            AcoesAndroid.escreveTexto(CadastroPO.textoSeuNumero, string);
            inserePrint();
        }catch (NoSuchElementException e){
            escreveErroException(e.getMessage());
        }
    }
}
