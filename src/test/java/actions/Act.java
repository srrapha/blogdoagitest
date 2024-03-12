package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Setup;

public class Act extends Setup {


    public WebElement findElementById(String elemento) { return driver.findElement(By.id(elemento)); }
    public WebElement findElementByCss(String elemento) { return driver.findElement(By.cssSelector(elemento)); }
    public WebElement findElementByTagName(String elemento) { return driver.findElement(By.tagName(elemento)); }
    public WebElement findElementByName(String elemento) { return driver.findElement(By.name(elemento)); }
    public WebElement waitElementById(String elemento) { return  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elemento))); }
    public WebElement waitElementByCss(String elemento) { return  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elemento))); }
    public WebElement waitElementByTagName(String elemento) { return  wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(elemento))); }
    public WebElement waitElementByName(String elemento) { return  wait.until(ExpectedConditions.presenceOfElementLocated(By.name(elemento))); }

    public void clickElement (WebElement element) { element.click(); }
    public void sendKeys (WebElement element) { element.sendKeys(); }
    public void getText (WebElement element) { element.getText(); }

}
