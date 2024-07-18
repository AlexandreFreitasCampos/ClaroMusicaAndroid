package br.com.claro.pages.pageActions;

import br.com.claro.utils.AcoesAndroid;
import br.com.claro.utils.PDF;

import static br.com.claro.utils.PDF.*;

public class HomePA {
    public static void validarCarrossel(String string) {
        escreveStep("Validar o carrossel Últimas escutadas");
        inserePrint();
        if(AcoesAndroid.validarElementoPresente(HomePO.carrosselUltimasEscutadas) &&
                (AcoesAndroid.validarElementoPresente(HomePO.nomeCarrosselUltimasEscutadas))){
            escreveDocumento(string);
        }




    }
}
