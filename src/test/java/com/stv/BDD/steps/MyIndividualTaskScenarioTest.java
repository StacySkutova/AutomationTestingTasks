package com.stv.BDD.steps;

import com.stv.factory.factorypages.*;
import com.stv.factory.factorytests.BasicFactoryTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MyIndividualTaskScenarioTest extends BasicFactoryTest {
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    CyclePage cyclePage = new CyclePage();
    CycleItemsCatalogPage cycleItemsCatalogPage = new CycleItemsCatalogPage();
    BasketPage basketPage = new BasketPage();

    @Given("^Main page opened$")
    public void openMainPage() throws InterruptedException {
        getDriver().get("https://www.wiggle.co.uk/");
        mainFactoryPage.clickOnTrustButton();
        getDriver().manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^Scrolling down to find the text Shop By Category$")
    public void findShopByCategoryScrollingDown() throws InterruptedException {
        WebElement shopCategoryElement = getDriver().findElement(By.className("bem-footer__category"));
        js.executeScript("arguments[0].scrollIntoView();", shopCategoryElement);
        mainFactoryPage.isShopByCategoryDisplayed();
        Thread.sleep(2000L);
    }

    @And("^Scrolling up to find the empty basket$")
    public void checkBasketEmptyScrollingUp() {
        WebElement cartElement = getDriver().findElement(By.className("bem-header__basket--empty"));
        js.executeScript("arguments[0].scrollIntoView();", cartElement);
        mainFactoryPage.isBasketEmpty();
        Actions hoverEmptyBasketElement = new Actions(getDriver());
        WebElement emptyBasketElement = getDriver().findElement(By.className("bem-header__basket--empty"));
        hoverEmptyBasketElement.moveToElement(emptyBasketElement).build().perform();
    }

    @And("^Click link Cycle$")
    public void clickCycleLink() throws InterruptedException {
        Thread.sleep(3000L);
        mainFactoryPage.clickLinkCycle();
    }

    @And("^Check and click button Shop now$")
    public void checkAndClickShopNowButton() throws InterruptedException {
        Thread.sleep(3000L);
        cyclePage.checkLinkShopNow();
        cyclePage.clickLinkShopNow();
    }

    @And("^Check Cycle Items Catalog Page opened and the basket is empty$")
    public void checkNewPageOpenedAndBasketEmpty() throws InterruptedException {
        Thread.sleep(3000);
        cycleItemsCatalogPage.isCycleClothingDisplayed();
        cycleItemsCatalogPage.isBasketEmpty();
        Actions hoverEmptyBasketElement = new Actions(getDriver());
        WebElement emptyBasketElement = getDriver().findElement(By.className("bem-header__basket--empty"));
        hoverEmptyBasketElement.moveToElement(emptyBasketElement).build().perform();
        Thread.sleep(2000);
        Actions moveFromEmptyBasketElement = new Actions(getDriver());
        WebElement otherElement = getDriver().findElement(By.className("bem-header__list"));
        moveFromEmptyBasketElement.moveToElement(otherElement).build().perform();
    }

    @And("^Click on button Basket$")
    public void clickOnBasketButton() throws InterruptedException {
        Thread.sleep(2000);
        cycleItemsCatalogPage.clickOnBasket();
    }

    @Then("^Basket page opened and empty$")
    public void basketOpenedAndEmpty() throws InterruptedException {
        Thread.sleep(3000);
        basketPage.checkBasketOpenedAndEmpty();
    }
}
