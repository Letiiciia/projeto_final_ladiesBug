#language: pt
Funcionalidade: Acessar a lista de carreiras da accenture
  Criando uma rotina de teste para validar lista de carreiras
	
  Cenario: Acessar o item de vagas de tecnologia
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no menu carreiras
    E clico no item do menu vagas em tecnologia
    Entao devo ver o destaque em "Carreiras em Tecnologia"