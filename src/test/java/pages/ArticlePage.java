package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends SearchPage {

    @FindBy(css = ".post-content ast-width-md-6")
    private WebElement firtArticle;

    @FindBy(css = ".entry-title ast-blog-single-element")
    private WebElement h2TitleName;

    @FindBy(xpath = "//*[@id='post-3622']/div/div[2]/h2/a")
    private WebElement linkTitleArticle;

    public void verifyFistArticle() {
        waitForElement(firtArticle);
        System.out.println("Acessando página de pesquisa de artigos");
    }

    public void intoArticleLink() {
        waitForElement(h2TitleName);
        click(linkTitleArticle);
    }
}
