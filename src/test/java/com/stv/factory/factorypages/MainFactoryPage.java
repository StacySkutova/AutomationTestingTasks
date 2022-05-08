package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

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
