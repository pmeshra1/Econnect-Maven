package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
	
	@FindBy(id="email")
	private WebElement usernameTxtBOx;
	
	@FindBy(id="pass")
	private WebElement passwordTxtBox;
	
	@FindBy(name="login")
	private WebElement LoginButton;
	
public RegPage(WebDriver driver ) {
	PageFactory.initElements(driver, this );	
	
}

public boolean isButtonPresent() {
	
	boolean button = LoginButton.isDisplayed();
	
	return button;
	
	
}
public void login(String user, String pass) {
	usernameTxtBOx.sendKeys(user);
	passwordTxtBox.sendKeys(pass);
	LoginButton.click();
	
}

}
