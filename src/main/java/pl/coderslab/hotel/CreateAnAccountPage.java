package pl.coderslab.hotel;

import org.openqa.selenium.WebDriver;

public class CreateAnAccountPage {

    public CreateAnAccountPage(WebDriver driver) {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);
        
        registerNewUser();
    }

    public void registerNewUser(String name, String lastName, String number, String zip, String country, String phone, String id) {
    }

    public void registerNewUser() {
    }

    public void registerNewUser(String name, String lastName, String number) {
    }
}
