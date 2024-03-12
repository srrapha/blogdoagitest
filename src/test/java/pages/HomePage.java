package pages;

import datafactory.SearchFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Constants.SEARCH_VALUE_SUCESS;

public class HomePage extends SearchPage {
    SearchFactory searchFactory = new SearchFactory();
    @FindBy(css = ".ast-search-icon")
    private WebElement searchIcon;

    @FindBy(id = "main")
    private WebElement homePageContent;

    @FindBy(id = "search-field")
    private WebElement inputTextSearch;

    public void waitHomePage() {
        waitForElement(homePageContent);
        isVisibility(searchIcon);
        System.out.println("Acessando página Principal");
    }


    public void setInputTextSearchSucess() {
        click(searchIcon);
        writeInField(inputTextSearch, searchFactory.buildSearchSucess().getSearchValue());
        System.out.println("Preenchendo campo de pesquisa");
    }

    public void setInputTextSearchFailed() {
        click(searchIcon);
        writeInField(inputTextSearch, searchFactory.buildSearchNotFound().getSearchValue());
        System.out.println("Preenchendo campo de pesquisa");
    }

}
