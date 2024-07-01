package br.com.claro.steps;


import br.com.claro.pages.pageActions.TelaPermissoesPA;
import br.com.claro.utils.DriverFactory;
import br.com.claro.utils.PDF;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinition {
    public StepsDefinition() {
        DriverFactory.getDriver();
    }
    @Dado("que criei o arquivo {string}")
    public void queCrieiOArquivo(String string) {
        switch (string){
            case "validar_textos_tela_de_permissoes":
                TelaPermissoesPA.criaArquivoPDF(string);
                break;
        }

    }
    @Quando("valido a imagem {string} {string}")
    public void validoAImagem(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.validarImagem(string);
        }
    }
    @Quando("valido o texto {string} {string}")
    public void validoOTexto(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.validarTexto(string);
        }
    }
    @E("clico no botao {string} {string}")
    public void clicoNoBotao(String string, String string2) {
        if(string2.equals("Tela de permissões")){
            TelaPermissoesPA.clicarBotao(string);
        }
    }
    @Entao("salvo o documento")
    public void salvoODocumento() {
        PDF.salvaDocumento();
    }

}
