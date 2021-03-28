#language: pt
Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
  Criando uma rotina de teste para validar os cookies no site da Accenture
	@ignore
  Cenario: Aceitar o cookie LGPD
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no botao configuracao dos cookies
    E aceito os termos LGPD
    Entao deve fechar a caixa de informacao
    
  Cenario: Configuracoes do cookie
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no botao configuracao dos cookies
    E aceito os termos LGPD
    E clico novamente no botao configuracoes dos cookies
    Entao devo ver o item "Sua privacidade"
    E devo ver "Cookies estritamente necessarias"
    E devo ver "Cookies Analiticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"
    
  		