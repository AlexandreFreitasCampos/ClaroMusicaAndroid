package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.TelaPermissoesPO;
import br.com.claro.utils.AcoesAndroid;

import static br.com.claro.utils.PDF.*;

public class TelaPermissoesPA {
    public TelaPermissoesPA() {

    }

    private boolean existe;

    public static void criaArquivoPDF(String string) {
        try {
            criaDocumento(string);
            insereCaBecalho();
            escreveTitulo("Tela de permissões");
            escreveSubTitulo("Precondição:\nPossuir o aplicativo Claro música instalado");
            escreveStep("Validar os dados da tela de permissões e clicar em Aceitar e continuar");
        } catch (Exception e) {
            escreveErroException(e.getMessage());
        }
    }

    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "logo claro musica1":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.btnRoot)) {
                        AcoesAndroid.clicarBotao(TelaPermissoesPO.btnRoot);
                    }
                    AcoesAndroid.aguardaElementoPresente(TelaPermissoesPO.logoPermissoes1);
                    inserePrint();
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.logoPermissoes1)) {
                        escreveDocumento("Ícone Claro Música");
                    } else {
                        escreveErroException("Ícone Claro Música");
                    }
                    break;
                case "logo claro musica2":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.logoPermissoes2)) {
                        escreveDocumento("Logo Claro Música");
                    } else {
                        escreveErroException("Logo Claro Música");
                    }
                    break;
                case "Ícone de telefone":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.iconeTelefone)) {
                        escreveDocumento(string);
                    } else {
                        escreveErroException(string);
                    }
                    break;
                case "Ícone de email":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.iconeEmail)) {
                        escreveDocumento(string);
                    } else {
                        escreveErroException(string);
                    }
                    break;
                case "Ícone de informações":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.iconeInformacoes)) {
                        escreveDocumento(string);
                    } else {
                        escreveErroException(string);
                    }
                    break;
                case "Ícone dados demograficos":
                    if (AcoesAndroid.validarElementoPresente(TelaPermissoesPO.iconeDadosDemoraficos)) {
                        escreveDocumento(string);
                    } else {
                        escreveErroException(string);
                    }
                    break;
            }
        } catch (Exception e) {
            escreveErroException(e.getMessage());
        }
    }

    public static void validarTexto(String string) {
        switch (string) {
            case "Bem-vindo ao novo Claro música!":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoBemVindo);
                break;
            case "Para melhorar sua experiência, usamos as seguintes funções do seu celular:":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoParaMelhorar);
                break;
            case "Número de telefone:":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoNumeroTelefone);
                break;
            case "Para fazer login, registrar-se de forma manual ou automaticamente, também para fazer compras usando seu número como meio de pagamento.":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoParaFazerLogin);
                break;
            case "E-mail:":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoEmail);
                break;
            case "Para fazer login ou registrar-se.":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoParaFazerLogin2);
                break;
            case "Informações do dispositivo:":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoInformacoesDispositivo);
                break;
            case "Para melhorar sua experiência analisando dados de uso, erros etc.":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoParaMelhorarSuaExperiencia);
                break;
            case "Dados Demográficos:":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoDadosDemograficos);
                break;
            case "Para realizar compras e personalizar sua conta.":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.textoParaRealizar);
                break;
            case "Aceitar e continuar":
                AcoesAndroid.validarBotao(string, TelaPermissoesPO.btnAceitarContinuar);
                break;
            case "Recusar permissões e sair":
                AcoesAndroid.validarTexto(string, TelaPermissoesPO.linkRecusar);
                break;
        }
    }

    public static void clicarBotao(String string) {
        AcoesAndroid.clicarBotao(TelaPermissoesPO.btnAceitarContinuar);
    }

    public static void salvarDocumento() {
        salvaDocumento();
    }
}
