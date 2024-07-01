package br.com.claro.pages.pageActions;

import br.com.claro.utils.PDF;

import java.io.IOException;

public class LoginEmailGratisPA {
    public static void criaArquivoPDF(String string){
        try {
            PDF.criaDocumento(string);
        } catch (Exception e) {
            PDF.escreveErroException(e.getMessage());
        }
    }
}
