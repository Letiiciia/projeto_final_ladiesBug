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
		Thread.sleep(2000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#primaryLink4_Carreiras>div>div>ul>li:nth-child(3)>ul>li:nth-child(6)>a"));
		input.click();	
	}
	
	@Entao("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) throws InterruptedException {
		Thread.sleep(2000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("h1[class='area-of-interest-title page-title-long']") );
		assertEquals(string, input.getText());
		Configuracoes.fechar();
	}
}