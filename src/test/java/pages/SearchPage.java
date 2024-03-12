package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Setup;

import java.time.Duration;


import static org.junit.Assert.fail;

public class SearchPage extends Setup {


    public SearchPage(){
        PageFactory.initElements(driver, this);
    }

    public void waitForElement(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            fail("Tempo excedido para aguardar elemento: "+element);
        }
    }
    public void click(WebElement element){
        try {
            waitForElement(element);
            element.click();
        } catch (Exception e) {
            fail("Nao foi possivel encontrar o elemento para clicar: "+element +". Pagina: " + driver.getTitle()+"\n "+e.getMessage());
        }
    }

    public void writeInField(WebElement element, String keysToSend){
        try {
            waitForElement(element);
            element.clear();
            element.sendKeys(keysToSend);
        } catch (WebDriverException e) {
            fail("Nao foi possivel encontrar o elemento para preencher: "+element +". Pagina: " + driver.getTitle()+"\n "+e.getMessage());

        }
    }

    public void scroll(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0," + element.getLocation().y + ")");
    }

    public void isVisibility(WebElement element){
        try {
            element.isDisplayed();
        } catch (NoSuchElementException e){
        }
    }

    public void selectElementByVisibleText(WebElement element, String textVisible){
        try {
            new Select(element).selectByVisibleText(textVisible);
        } catch (NoSuchElementException e){
            fail("Erro ao selecionar no elemento: ["+element.getTagName()+ "] com o o valor: "+textVisible);
        }
    }

    public void selectElementByVisibleValue(WebElement element, String valueVisibel){
        try {
            new Select(element).selectByValue(valueVisibel);
        } catch (NoSuchElementException e){
            fail("Erro ao selecionar no elemento: ["+element.getTagName()+ "] com o o valor: "+valueVisibel);
        }
    }



}
