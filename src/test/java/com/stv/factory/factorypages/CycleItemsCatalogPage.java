package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CycleItemsCatalogPage extends FactoryPage {
    @FindBy(xpath = "//h1[contains(text(),'First Look Cycle Clothing')]")
    private WebElement cycleClothing;

    @FindBy(className = "bem-header__basket--empty")
    private WebElement checkBasketEmpty;

    public boolean isCycleClothingDisplayed() {
        return cycleClothing.isDisplayed();
    }

    public boolean isBasketEmpty() {
        return checkBasketEmpty.isDisplayed();
    }

    public void clickOnBasket() {
        checkBasketEmpty.click();
    }
}
