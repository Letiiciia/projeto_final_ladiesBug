package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;


public class sobreAccentureSteps {

	@Dado("clico no menu sobre a Accenture")
	public void clico_no_menu_sobre_a_Accenture() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("div[data-target='#primaryLink5_SobreaAccenture'"));
		input.click();
	}

	@Dado("clico no item do menu sobre a Accenture")
	public void clico_no_item_do_menu_sobre_a_Accenture() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/*@Entao("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/
}
