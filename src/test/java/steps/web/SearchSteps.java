package steps.web;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Order;
import org.testng.annotations.Test;
import pages.*;
import utils.Setup;

@Test(groups = "smokeTest")
public class SearchSteps extends Setup {

    public static SearchPage searchPage = new SearchPage();
    public static HomePage homePage = new HomePage();
    public static ArticlePage articlePage = new ArticlePage();
    public static IntoArticlePage intoArticlePage = new IntoArticlePage();
    public static ArticleNotFoundPage articleNotFoundPage = new ArticleNotFoundPage();


    @Dado("que estou na pagina de inicio")
    public void que_estou_na_pagina_de_inicio() {
        homePage.waitHomePage();
    }
    @Quando("preencher o campo de pesquisa")
    public void preencher_o_campo_de_pesquisa() {
        homePage.setInputTextSearchSucess();
    }

    @Quando("preencher o campo de pesquisa com dados aleatorios")
    public void preencher_o_campo_de_pesquisa_com_dados_aleatorios() {
       homePage.setInputTextSearchFailed();
    }
    @Quando("verificar se a pagina de pesquisa foi carregada com sucesso")
    public void verifico_se_a_pagina_foi_carregada() {
        articlePage.verifyFistArticle();
    }

    @Entao("verificar se a pagina de pesquisa informa que nao encontrou o artigo")
    public void verificar_se_a_pagina_de_pesquisa_informa_que_nao_encontrou_o_artigo() {
        articleNotFoundPage.waitNotFoundPage();
    }
    @Entao("visualizar o conteudo do artigo do blog")
    public void visualizo_o_conteudo_artigo_do_blog() {
        articlePage.intoArticleLink();
        intoArticlePage.waitArticleDescriptions();
        intoArticlePage.scrollTotalPage();
    }


    @org.junit.Test
    @Order(1)
    public void fazerPesquisaArtigoSucesso() {

        homePage.waitHomePage();
        homePage.setInputTextSearchSucess();
        articlePage.verifyFistArticle();
        articlePage.intoArticleLink();
        intoArticlePage.waitArticleDescriptions();
        intoArticlePage.scrollTotalPage();

    }

}
