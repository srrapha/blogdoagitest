#language: pt

@GlobalExecution @Web @SmokeTest
Funcionalidade: Search home

  Contexto:
    Dado que estou na pagina de inicio

  @CenarioComum
  Cenario: Fazer pesquisa de artigo com sucesso
    Quando preencher o campo de pesquisa
    E verificar se a pagina de pesquisa foi carregada com sucesso
    Entao visualizar o conteúdo do artigo do blog

  @CenarioFalhaEsperada
  Cenario: Fazer pesquisa de artigo que não existe
    Quando preencher o campo de pesquisa com dados aleatórios
    Entao verificar se a pagina de pesquisa informa que não encontrou o artigo