package com.stv.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MainFactoryPage extends FactoryPage {
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    Actions hoverEmptyBasketElement = new Actions(getDriver());

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(className = "bem-footer__category")
    private WebElement shopByCategory;

    @FindBy(className = "bem-header__basket--empty")
    private WebElement checkBasketEmpty;

    @FindBy(linkText = "Cycle")
    private WebElement linkCycle;

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }

    public void isShopByCategoryScrolledDown() {
        js.executeScript("arguments[0].scrollIntoView();", shopByCategory);
    }

    public void isShopByCategoryScrolledUp() {
        js.executeScript("arguments[0].scrollIntoView();", checkBasketEmpty);
    }

    public void setHoverEmptyBasketElement() {
        hoverEmptyBasketElement.moveToElement(checkBasketEmpty).build().perform();
    }

    public boolean isShopByCategoryDisplayed() {
        return shopByCategory.isDisplayed();
    }

    public boolean isBasketEmpty() {
        return checkBasketEmpty.isDisplayed();
    }

    public void clickLinkCycle() {
        linkCycle.click();
    }
}
