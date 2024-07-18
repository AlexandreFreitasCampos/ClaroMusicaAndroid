package br.com.claro.pages.pageActions;

import br.com.claro.pages.pageObjects.MenuPerfilPO;
import br.com.claro.utils.AcoesAndroid;

import static br.com.claro.utils.PDF.*;

public class MenuPerfilPA {
    public static void clicarBotao(String string) {
        escreveStep("Clicar no ícone de perfil e em Planos e assinatura");
        AcoesAndroid.aguardaElementoPresente(MenuPerfilPO.iconePerfil);
        AcoesAndroid.clicarBotao(MenuPerfilPO.iconePerfil);
        inserePrint();
    }
}
