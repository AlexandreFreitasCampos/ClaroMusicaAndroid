package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.MenuPerfilPO;
import br.com.claro.pages.pageObjects.PlanosPO;
import br.com.claro.utils.AcoesAndroid;
import br.com.claro.utils.PDF;

import static br.com.claro.utils.PDF.*;

public class PlanoMensalPA {
    public static void criarArquivoPDF(String string) {
        try{
            criaDocumento(string);
            insereCaBecalho();
            escreveTitulo("Contratar plano mensal");
            escreveSubTitulo("Precondição:\nPossuir o aplicativo Claro música instalado\nPossuir um MSISDN" +
                    " com cadastro no Claro Música\nEstar logado na home page");
        }catch (Exception e){
            PDF.escreveErroException(e.getMessage());
        }
    }

    public static void clicarBotao(String string) {
        try{
            switch (string){
                case "Planos e assinaturas":
                    AcoesAndroid.clicarBotao(MenuPerfilPO.btnPlanosEAssinaturas);
                    AcoesAndroid.aguardaElementoPresente(PlanosPO.btnEscolherIlimitado);
                    escreveStep("Validar os dados da tela e clicar em ESCOLHER ILIMITADO");
                    inserePrint();
                    break;
                case "ESCOLHER ILIMITADO":
                    AcoesAndroid.clicarBotao(PlanosPO.btnEscolherIlimitado);
                    escreveStep("Validar os dados da tela e clicar em  Iniciar ilimitado");
                    AcoesAndroid.aguardaElementoPresente(PlanosPO.txtMSISDN);
                    inserePrint();
                    break;
                case "Iniciar ilimitado":
                    AcoesAndroid.clicarBotao(PlanosPO.btnIniciarIlimitado);
                    break;
                case "Entendido":
                    AcoesAndroid.clicarBotao(PlanosPO.txtEntendido);
                    break;
            }
        }catch (Exception e){
            escreveErroException(e.getMessage());
        }
    }

    public static void validarTexto(String string) {
        switch (string){
            case "Nossos planos":
                AcoesAndroid.validarTexto(string, PlanosPO.txtNossosPlanos);
                break;
            case "• 1 mês gratis*":
                AcoesAndroid.validarTexto(string, PlanosPO.txtUmMesGratis);
                break;
            case "• Sem consumo de dados para clientes Claro":
                AcoesAndroid.validarTexto(string, PlanosPO.txtSemConsumo);
                break;
            case "• Escute sem anúncios":
                AcoesAndroid.validarTexto(string, PlanosPO.txtEscuteSemAnuncios);
                break;
            case "• Ouça sua música offline":
                AcoesAndroid.validarTexto(string, PlanosPO.txtOucaSuaMusica);
                break;
            case "• Cliente Claro com Claro Música ilimitado navegam sem custo":
                AcoesAndroid.validarTexto(string, PlanosPO.txtClienteClaro);
                break;
            case "R$12,90/mes*":
                String valor = AcoesAndroid.obterTexto(PlanosPO.txtValorPlano);
                String periodo = AcoesAndroid.obterTexto(PlanosPO.txtPeriodoPlano);
                if(string.equals(valor + periodo)){
                    escreveDocumento(valor + periodo);
                }else{
                    escreveErroException(valor + periodo);
                }
                break;
            case "Mais informações":
                AcoesAndroid.validarTexto(string, PlanosPO.txtMaisInformacoes);
                break;
            case "ESCOLHER ILIMITADO":
                AcoesAndroid.validarTexto(string, PlanosPO.btnEscolherIlimitado);
                break;
            case "* Promoção disponível para primeira contratação de usuários com plano Claro Pós, Pré, Controle e Flex aplica 1 mês grátis.":
                AcoesAndroid.validarTexto(string, PlanosPO.txtPromocaoDisponivel);
                break;
            case "Você está prestes a assinar":
                AcoesAndroid.validarTexto(string, PlanosPO.txtPrestesAAssinar);
                break;
            case "Preço: R$ 12,90":
                String preco = AcoesAndroid.obterTexto(PlanosPO.txtPreco);
                String valorPlano = AcoesAndroid.obterTexto(PlanosPO.txtPrecoPlano);
                if(string.equals(preco + valorPlano)){
                    escreveDocumento(preco + " " + valorPlano);
                }else{
                    escreveErroException(preco + " " + valorPlano);
                }
                break;
            case "Forma de pagamento: Claro":
                String formaPagamento = AcoesAndroid.obterTexto(PlanosPO.txtFormaPagamento);
                String claro = AcoesAndroid.obterTexto(PlanosPO.txtClaro);
                if(string.equals(formaPagamento + " " + claro)){
                    escreveDocumento(formaPagamento + " " + claro);
                }else{
                    escreveErroException(formaPagamento + claro);
                }
                break;
            case "Periodicidade: Mensal":
                String periodicidade = AcoesAndroid.obterTexto(PlanosPO.txtPeriodicidade);
                String mensal = AcoesAndroid.obterTexto(PlanosPO.txtPeriodo);
                if(string.equals(periodicidade + " " + mensal)){
                    escreveDocumento(periodicidade + " " + mensal);
                }else{
                    escreveErroException(periodicidade + " " + mensal);
                }
                break;
            case "Pague com seu número":
                AcoesAndroid.validarTexto(string, PlanosPO.txtPagueCom);
                break;
            case "21966124127":
                AcoesAndroid.validarTexto(string, PlanosPO.txtMSISDN);
                break;
            case "Iniciar ilimitado":
                AcoesAndroid.validarTexto(string, PlanosPO.btnIniciarIlimitado);
                break;
            case "ALTERAR FORMA DE PAGAMENTO":
                AcoesAndroid.validarTexto(string, PlanosPO.txtAlterarFormaPagamento);
                break;
            case "Claro música Ilimitado":
                escreveStep("Validar a tela de Bem vindo e clicar no botão Entendido");
                AcoesAndroid.aguardaElementoPresente(PlanosPO.txtClaro);
                inserePrint();
                String claroMusicaIlimitado = AcoesAndroid.obterTexto(PlanosPO.txtClaro);
                String musica = AcoesAndroid.obterTexto(PlanosPO.txtMusica);
                String ilimitado = AcoesAndroid.obterTexto(PlanosPO.txtIlimitado);
                if(string.equals(claroMusicaIlimitado + " " + musica + " " + ilimitado)){
                    escreveDocumento(claroMusicaIlimitado + " " + musica + " " + ilimitado);
                }else{
                    escreveErroException(claroMusicaIlimitado + " " + musica + " " + ilimitado);
                }
                break;
            case "Bem-vindo ao":
                AcoesAndroid.validarTexto(string, PlanosPO.txtBemVindo);
                break;
            case ":l:":
                string = "Claro";
                String musica2  = AcoesAndroid.obterTexto(PlanosPO.txtMusica2);
                if(AcoesAndroid.validarElementoPresente(PlanosPO.imgLogoClaro)){
                    escreveDocumento(string + " "  + musica2);
                }else{
                    escreveErroException(string + " "  + musica2);
                }
                break;
            case "ilimitado":
                if(AcoesAndroid.validarElementoPresente( PlanosPO.txtilimitado)){
                    AcoesAndroid.validarTexto(string, PlanosPO.txtilimitado);
                }
                break;
            case "Entendido":
                AcoesAndroid.validarTexto(string, PlanosPO.txtEntendido);
                break;
        }
    }

    public static void validarImagem(String string) {
        try {
            switch (string) {
                case "Logo Claro Música Ilimitado Mensal":
                    if (AcoesAndroid.validarElementoPresente(PlanosPO.imgLogoMensal)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão Voltar":
                    if (AcoesAndroid.validarElementoPresente(PlanosPO.btnVoltar)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Logo Claro Música Mensal":
                    if (AcoesAndroid.validarElementoPresente(PlanosPO.logoMensal)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Claro":
                    if (AcoesAndroid.validarElementoPresente(PlanosPO.logoClaro)) {
                        escreveDocumento(string);
                    } else{
                        escreveErroException(string + " não encontrado!!!");
                    }
                    break;
                case "Botão fechar":
                    if (AcoesAndroid.validarElementoPresente(PlanosPO.btnFechar)) {
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
}
