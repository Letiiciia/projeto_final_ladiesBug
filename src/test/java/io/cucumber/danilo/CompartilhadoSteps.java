package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.servicos.Configuracoes;

public class CompartilhadoSteps {

	@Dado("que eu estou no site da accenture {string}")
	public void que_eu_estou_no_site_da_accenture(String string) {
	    Configuracoes.abrir(string);
	}
}
