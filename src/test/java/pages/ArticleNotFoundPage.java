package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticleNotFoundPage extends SearchPage{

    @FindBy(css = "#main > section > div > p")
    private WebElement notFoundPainel;

    @FindBy(xpath = "//*[@id='main']/section/div/p/text()")
    private WebElement notFoundDescription;

    public void waitNotFoundPage() {
        waitForElement(notFoundDescription);
        isVisibility(notFoundDescription);
        System.out.println("Acessando página Principal");
    }
}
