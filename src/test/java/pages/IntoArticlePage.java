package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntoArticlePage extends SearchPage{


    @FindBy(id = "post-3622")
    private WebElement articleContent;

    @FindBy(xpath = "//*[@id='post-3622']/div/header/h1")
    private WebElement articleTitleName;

    @FindBy(css = ".share-jetpack-whatsapp sd-button share-icon")
    private WebElement whatsAppButton;


    public void waitArticleDescriptions() {
        waitForElement(articleContent);
    }

    public void scrollTotalPage() {
        scroll(articleTitleName);
        scroll(whatsAppButton);
    }

}
