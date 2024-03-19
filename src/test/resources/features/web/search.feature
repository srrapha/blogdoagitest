#language: pt

@GlobalExecution @Web @SmokeTest
Funcionalidade: Search home

  Contexto:
    Dado que estou na pagina de inicio

  @CenarioComum
  Cenario: Fazer pesquisa de artigo com sucesso
    Quando preencher o campo de pesquisa
    E verificar se a pagina de pesquisa foi carregada com sucesso
    Entao visualizar o conteudo do artigo do blog

  @CenarioFalhaEsperada
  Cenario: Fazer pesquisa de artigo que não existe
    Quando preencher o campo de pesquisa com dados aleatorios
    Entao verificar se a pagina de pesquisa informa que nao encontrou o artigo