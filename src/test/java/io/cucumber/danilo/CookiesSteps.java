package io.cucumber.danilo;

import static org.junit.Assert.assertFalse;

import java.util.List;

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
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("button[class='save-preference-btn-handler onetrust-close-btn-handler']"));
		input.click();		
	}

	@Entao("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("div[id='onetrust-pc-sdk']")); 
	    assertFalse(input.isDisplayed());
	    Configuracoes.fechar();
	}
	
	@Dado("clico novamente no botao configuracoes dos cookies")
	public void clico_novamente_no_botao_configuracoes_dos_cookies() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("button[id='optanon-minimize-button']"));
		input.click();
	}

	@Dado("devo ver {string}")
	public void devo_ver(String string) {
		/*String items = Configuracoes.browser.findElement(By.cssSelector("ul[class='category-group']")).getText();
		
		System.out.print("vaga na accenture" + items);	*/	
	}
}
