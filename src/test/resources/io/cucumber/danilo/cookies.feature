#language: pt
Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
  Criando uma rotina de teste para validar os cookies no site da Accenture

  Cenario: Aceitar o cookie LGPD
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E aceito os termos LGPD
    Entao deve fechar a caixa de informacao
    
	@ignore
  Cenario: Configuracoes do cookie
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E aceito os termos LGPD
    E clico em configuracoes de cookie
    Entao devo ver o item de "sua privacidade"
    E devo ver "Cookies estritamente necessários"
    E devo ver "Cookies Analíticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"
