package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CycleItemsCatalogPage extends FactoryPage {
    Actions hoverEmptyBasketElement = new Actions(getDriver());
    Actions moveFromEmptyBasketElement = new Actions(getDriver());

    @FindBy(xpath = "//h1[contains(text(),'First Look Cycle Clothing')]")
    private WebElement cycleClothing;

    @FindBy(className = "bem-header__basket--empty")
    private WebElement checkBasketEmpty;

    @FindBy(className = "bem-header__list")
    private WebElement otherElement;

    public boolean isCycleClothingDisplayed() {
        return cycleClothing.isDisplayed();
    }

    public boolean isBasketEmpty() {
        return checkBasketEmpty.isDisplayed();
    }

    public void setHoverEmptyBasketElement() {
        hoverEmptyBasketElement.moveToElement(checkBasketEmpty).build().perform();
    }

    public void setHoverOtherElement() {
        moveFromEmptyBasketElement.moveToElement(otherElement).build().perform();
    }

    public void clickOnBasket() {
        checkBasketEmpty.click();
    }
}
