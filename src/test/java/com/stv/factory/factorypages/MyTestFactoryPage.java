package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTestFactoryPage extends FactoryPage {

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement dualRegisterEmailModelEmail;

    @FindBy(id = "qa-dual-register")
    private WebElement qaDualRegister;

    public void clickOnInputField(String email) {
        dualRegisterEmailModelEmail.sendKeys(email);
    }

    public void clickOnContinueButton() {
        qaDualRegister.click();
    }
}
