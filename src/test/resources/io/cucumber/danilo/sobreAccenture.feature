#language: pt
Funcionalidade: Acessar o site da accenture e ver as caracteristicas da accenture
  Criando uma rotina de teste para validar as caracteristicas da accenture
	@ignore
  Cenario: Ver as caracteristicas da Accenture
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no botao configuracao dos cookies
    E aceito os termos LGPD
    E clico no menu sobre a accenture
    E clico no item do menu sobre a accenture
    Entao devo ver o destaque em "Nosso proposito"
