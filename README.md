# Curso Selenium WebDriver — TargetTrust

Projeto de exemplos e testes automatizados com Selenium WebDriver como parte do curso da TargetTrust.

## Visão Geral
- Linguagem: Java
- Build/gestão de dependências: Maven
- Estrutura padrão de testes em `src/test/java`
- Exemplos de testes: `com.test.WebElementsTest`

## Requisitos
- Java 11+ (ou versão utilizada no curso)
- Maven 3.8+
- Navegador (ex.: Google Chrome) e WebDriver correspondente
- macOS com `zsh` (comandos abaixo prontos para este ambiente)

## Clonar o projeto
```bash
# Via HTTPS
git clone <URL_DO_REPOSITORIO>
cd curso-webdriver-T1606335

# Via SSH
# git clone git@github.com:<org>/<repo>.git
# cd curso-webdriver-T1606335
```

## Configuração do WebDriver
- Caso use Chrome:
  - Baixe o ChromeDriver compatível com a versão do seu navegador
  - Coloque o binário em um diretório do `PATH` (ex.: `/usr/local/bin`) ou configure no código o caminho do driver.
- Alternativamente, use bibliotecas de gestão automática de drivers (ex.: `webdrivermanager`), se o curso permitir.

## Executar os testes
```bash
# Na raiz do projeto
mvn clean test
```

- O Maven irá baixar dependências e executar os testes em `src/test/java`.
- Resultados e relatórios ficam em `target/surefire-reports`.

## Estrutura do Projeto
```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com/test/WebElementsTest.java
│       └── resources
└── target
```

## Dicas
- Use um ambiente virtual de desenvolvimento (IntelliJ/Eclipse/VS Code) com suporte a Maven.
- Verifique variáveis de ambiente como `JAVA_HOME` e `PATH`.
- Mantenha o navegador e o driver sempre compatíveis.

## Créditos
Este projeto faz parte do curso de Selenium WebDriver da TargetTrust.
