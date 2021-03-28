#language: pt
Funcionalidade: Acessar o site da accenture a mostrar a lista de serviços
	Criando uma rotina de teste para validar o acesso aos serviços e ao cloud
	@ignore
  Cenario: listar serviços da Accenture
		Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no menu servicos
		Entao devo ver os servicos abaixo
      | Accenture Strategy           |
      | Application Services         |
      | Artificial Intelligence      |
      | Automation                   |
      | Business Process Services    |
      | Change Management            |
      | Cloud                        |
      | Customer Experience          |
      | Data & Analytics             |
      | Ecosystem Partners           |
      | Finance Consulting           |
      | Industry X                   |
      | Infrastructure               |
      | Marketing                    |
      | Mergers & Acquisitions (M&A) |
      | Operating Models             |
      | Security                     |
      | Supply Chain Management      |
      | Sustainability               |
      | Technology Consulting        |
      | Technology Innovation        |
      | Zero Based Budgeting (ZBB)   |
	@ignore
  Cenario: Clicar no servico cloud
    Dado que eu estou no site da accenture "https://www.accenture.com/"
    E clico no menu servicos
    E clico no item do menu cloud
    Entao devo encontrar o titulo "Servicos de Cloud"
