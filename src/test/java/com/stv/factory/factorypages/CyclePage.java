package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CyclePage extends FactoryPage {
    @FindBy(xpath = "//p[contains(text(),'SHOP NOW')]")
    private WebElement linkShopNow;

    @FindBy(xpath = "/html/body/div[8]/div/div/div[1]/div/div[3]/a/div[1]/div/div/div/div[1]/div/p")
    private WebElement clickableLink;

    public void checkLinkShopNow() {
        linkShopNow.isDisplayed();
    }

    public void clickLinkShopNow() {
        clickableLink.click();
    }
}
