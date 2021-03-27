package io.cucumber.danilo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;


public class SobreAccentureSteps {

	@Dado("clico no menu sobre a accenture")
	public void clico_no_menu_sobre_a_accenture() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#navigation-menu>div:nth-child(5)>div.gh-item.nav-submenu-label"));
		input.click();
	}

	@Dado("clico no item do menu sobre a accenture")
	public void clico_no_item_do_menu_sobre_a_accenture() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#primaryLink5_SobreaAccenture>div>div>ul>li:nth-child(1)>ul>li:nth-child(1)>a"));
		input.click();
	}
	
	@Entao("devo ver o topico {string}")
	public void devo_ver_o_topico(String string)throws InterruptedException {
		Thread.sleep(2000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#block-section-1>div>div>div>div>div>div.scrollmagic-pin-spacer>div>div.panel.panel-1>div>div>h3"));
		assertTrue(string.equals((input.getText()).replace("ó", "o")));
		Configuracoes.fechar(); 
	}
}
