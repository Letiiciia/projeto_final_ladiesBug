package io.cucumber.danilo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;

public class ServicosSteps {
	@Dado("clico no menu servicos")
	public void clico_no_menu_servicos() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#navigation-menu>div.nav-submenu.panel.layout-column.short>div.gh-item.nav-submenu-label>span"));
		input.click();
	}

	@Dado("clico no item do menu cloud")
	public void clico_no_item_do_menu_cloud() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#primaryLink2_Servios>div>div>ul>li:nth-child(7)>a"));
		input.click();
	}

	@Entao("devo encontrar o titulo {string}")
	public void devo_encontrar_o_titulo(String string) throws InterruptedException {
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#full-width-text-container>div>article>div>h1"));
		assertTrue(string.equals((input.getText()).replace("ç", "c")));
		Configuracoes.fechar(); 
	}
}
