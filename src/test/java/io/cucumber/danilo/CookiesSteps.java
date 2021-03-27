package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class CookiesSteps {
	
	@Dado("clico no botao configuracao dos cookies")
	public void clico_no_botao_configuracao_dos_cookies() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector(".cookie-setting-link"));
		input.click();
	}

	@Dado("aceito os termos LGPD")
	public void aceito_os_termos_LGPD() {
	    
	}

	@Entao("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
	    
	}
}
