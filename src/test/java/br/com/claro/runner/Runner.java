
package br.com.claro.runner;

import br.com.claro.utils.AcoesAndroid;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  {"src/test/resources/features/claromusica.feature"}
		, glue =  {"br.com.claro.steps", "br.com.claro.utils"}
		, tags = "@permissoes or @landing"
		, plugin =  {"pretty",  "json:target/cucumber.json"}
		, monochrome =  false //não coloca a tela colorida
		, snippets =  SnippetType.CAMELCASE //Remove o _ no nome dos métodos
		, dryRun =  false //Valida se os steps estão corretos sem executar os testes
		)

public class Runner {
	@AfterClass
	public static void fecharBrowser() {
		//DriverFactory.killDriver();
	}
}
