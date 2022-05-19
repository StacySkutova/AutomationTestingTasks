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

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.MAIN_PAGE_START_URL;


public class MyIndividualTaskScenarioSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    CyclePage cyclePage = new CyclePage();
    CycleItemsCatalogPage cycleItemsCatalogPage = new CycleItemsCatalogPage();
    BasketPage basketPage = new BasketPage();

    @Given("^Main page opened$")
    public void openMainPage() throws InterruptedException {
        getDriver().get(MAIN_PAGE_START_URL);
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        mainFactoryPage.clickOnTrustButton();
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("^Scrolling down to find the text Shop By Category$")
    public void findShopByCategoryScrollingDown() throws InterruptedException {
        mainFactoryPage.isShopByCategoryScrolledDown();
        mainFactoryPage.isShopByCategoryDisplayed();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Scrolling up to find the empty basket$")
    public void checkBasketEmptyScrollingUp() throws InterruptedException {
        mainFactoryPage.isShopByCategoryScrolledUp();
        mainFactoryPage.isBasketEmpty();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainFactoryPage.setHoverEmptyBasketElement();
    }

    @And("^Click link Cycle$")
    public void clickCycleLink() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainFactoryPage.clickLinkCycle();
    }

    @And("^Check and click button Shop now$")
    public void checkAndClickShopNowButton() throws InterruptedException {
        getDriver().manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
        cyclePage.checkLinkShopNow();
        cyclePage.clickLinkShopNow();
    }

    @And("^Check Cycle Items Catalog Page opened and the basket is empty$")
    public void checkNewPageOpenedAndBasketEmpty() throws InterruptedException {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        cycleItemsCatalogPage.isCycleClothingDisplayed();
        cycleItemsCatalogPage.isBasketEmpty();
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        cycleItemsCatalogPage.setHoverOtherElement();

    }

    @And("^Click on button Basket$")
    public void clickOnBasketButton() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        cycleItemsCatalogPage.clickOnBasket();
    }

    @Then("^Basket page opened and empty$")
    public void basketOpenedAndEmpty() throws InterruptedException {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        basketPage.checkBasketOpenedAndEmpty();
    }
}
