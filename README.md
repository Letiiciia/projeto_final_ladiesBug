# Projeto Final - Ladies' Bug
Projeto final de automação de testes apresentado a banca Accenture 2.0
> Status do Projeto: Em desenvolvimento. :warning: 

# Equipe: Ladies' Bug :beetle:
Integrantes: <br>
<ul>
  <li>Chayene Natany de Oliveira Cardoso</li>
  <li>Isabela Augusta de Oliveira</li>
  <li>Letícia Ferreira Lima</li>
  <li>Mayara Regina Fagundes</li>
  <li>Milene Amâncio Alves Eigenheer</li>
  <li>Stephanie Leão Floro da Silva</li>
  <li>Vanessa de Lima Ruiz</li>
</ul>

# Descrição do desafio :page_facing_up:
### Criar uma aplicação Selenium com os seguintes casos de teste
### - Caso de Teste 1
Acessar o site da Accenture e aceitar os cookies do LGPD<br>

<b>Cenário</b>: Aceitar o cookie LGPD<br>
Dado que eu estou no site da accenture<br>
E clico no botao configuracao dos cookies<br>
E aceito os termos LGPD<br>
Entao deve fechar a caixa de informacao<br>

<b>Cenário</b>: Configuracoes do cookie<br>
Dado que eu estou no site da accenture<br>
E clico no botao configuracao dos cookies<br>
E aceito os termos LGPD<br>
E clico novamente no botao configuracoes dos cookies<br>
Entao devo ver o item "Sua privacidade"<br>
E devo ver "Cookies estritamente necessarias"<br>
E devo ver "Cookies Analiticos de Primeira Parte"<br>
E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
E devo ver "Cookies de Publicidade e Redes Sociais"<br>

### - Caso de Teste 2
Acessar o site da Accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: Listar serviços da Accenture<br>
Dado que eu estou no site da accenture<br>
E clico no menu servicos<br>
Entao devo ver os servicos abaixo<br>
- [x] Accenture Strategy
- [x] Application Services
- [x] Artificial Intelligence
- [x] Automation
- [x] Business Process Services
- [x] Change Management
- [x] Cloud
- [x] Customer Experience
- [x] Data & Analytics
- [x] Ecosystem Partners
- [x] Finance Consulting
- [x] Industry X
- [x] Infrastructure
- [x] Marketing
- [x] Mergers & Acquisitions (M&A)
- [x] Operating Models
- [x] Security
- [x] Supply Chain Management
- [x] Sustainability
- [x] Technology Consulting
- [x] Technology Innovation
- [x] Zero Based Budgeting (ZBB)

<b>Cenário</b>: Clicar no servico cloud<br>
Dado que eu estou no site da accenture<br>
E clico no menu servicos<br>
E clico no item do menu cloud<br>
Entao devo encontrar o titulo "Servicos de Cloud"<br>

### - Caso de Teste 3
Acessar a lista de carreiras da Accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
Dado que eu estou no site da accenture<br>
E clico no botao configuracao dos cookies<br>
E aceito os termos LGPD<br>
E clico no menu carreiras<br>
E clico no item do menu vagas em tecnologia<br>
Entao devo ver o destaque em "Carreiras em tecnologia"<br>

<b>Cenário</b>: Procurando uma vaga<br>
Dado que eu estou no site da accenture<br>
E clico no botao configuracao dos cookies<br>
E aceito os termos LGPD<br>
E clico no menu carreiras<br>
E clico no botao de procure por vagas<br>
E digito no campo de busca "desenvolvedor"<br>
E clico no botao procurar<br>
Entao devo encontrar vagas para programadores<br>

### - Caso de Teste 4
Sobre a Accenture<br>

<b>Cenário</b>: Ver as caracteristicas da Accenture<br>
Dado que eu estou no site da accenture<br>
E clico no botao configuracao dos cookies<br>
E aceito os termos LGPD<br>
E clico no menu sobre a accenture<br>
E clico no item do menu sobre a accenture<br>
Entao devo ver o topico "Nosso proposito:"<br>

--------------------------------------------------------------------
## Dependências :gear:
- Projeto Java configurado para rodar na porta 8080<br>
Exemplo: http://localhost:8080 <br>
Link do repositório: https://github.com/Letiiciia/projeto_final_ladiesBug.git<br>

--------------------------------------------------------------------

## Tecnologias utilizadas :books:
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como rodar a aplicação :arrow_forward:
### Pré requisitos :information_source:
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/Didox/turma-accenture-java-cucumber.git
 ```

- Entrando na pasta do projeto
 ```bash
cd turma-accenture-java-cucumber
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na rapiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```
