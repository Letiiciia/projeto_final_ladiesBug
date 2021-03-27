package io.cucumber.danilo;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class CarreirasSteps {
	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("div[data-target='#primaryLink4_Carreiras']"));
		input.click();
	}

	@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException {
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#primaryLink4_Carreiras>div>div>ul>li:nth-child(3)>ul>li:nth-child(6)>a"));
		input.click();	
	}
	
	@Entao("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) throws InterruptedException {
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("h1[class='area-of-interest-title page-title-long']") );
		assertEquals(string, input.getText());
		Configuracoes.fechar();
	}
	
	@Dado("clico no botao de procure por vagas")
	public void clico_no_botao_de_procure_por_vagas() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("a[data-analytics-link-name='procure por vagas']"));
		input.click();
	}

	@Dado("digito no campo de busca {string}")
	public void digito_no_campo_de_busca(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[id='job-search-hero-bar']"));
		input.sendKeys(string);
	}

	@Dado("clico no botao procurar")
	public void clico_no_botao_procurar() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("button[class='btn-primary col-xs-12']"));
		input.click();
	}

	@Entao("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() {
		int resultpesquisa = Configuracoes.browser.findElements(By.cssSelector("div[class='module job-card-wrapper col-md-4 col-xs-12 col-sm-6 corporate-regular background-white']")).size();
		assertEquals(true, resultpesquisa > 0);
		Configuracoes.fechar();
	}
}