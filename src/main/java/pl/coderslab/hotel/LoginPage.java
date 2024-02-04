package pl.coderslab.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement registerEmailInput;

    @FindBy(id = "email")
    private WebElement signInEmailInput;

    @FindBy(id = "passwd")
    private WebElement signInPasswordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void goToCreateAnAccountPageWith(String email) {
        registerEmailInput.clear();
        registerEmailInput.sendKeys(email);
        registerEmailInput.submit();
    }

    public void signInAs(String email, String password) {
        signInEmailInput.clear();
        signInEmailInput.sendKeys(email);

        signInPasswordInput.clear();
        signInPasswordInput.sendKeys(password);
        signInButton.click();
    }

}
