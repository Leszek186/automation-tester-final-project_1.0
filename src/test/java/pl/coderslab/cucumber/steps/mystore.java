package pl.coderslab.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class mystore {
    private WebDriver webDriver;
    private WebDriver driver;

    @Given("jestem na stronie mystore")
    public void openBrowserWithHotelRegistration() {
        this.webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        this.webDriver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @When("logowanie uzytkownika")
    public void logowanieUzytkownika() {
        WebElement loginField = webDriver.findElement(By.id("field-email"));
        loginField.sendKeys("10minute@mail.com");

        WebElement passwordField = webDriver.findElement(By.id("field-password"));
        passwordField.sendKeys("leszek1984");

        WebElement signInButton = webDriver.findElement(By.id("submit-login"));

        signInButton.click();
    }

    @And("wejdzie klikając w kafelek Addresses po zalogowaniu")
    public void wejdzie_klikając_w_kafelek_addresses_po_zalogowaniu() {
        WebElement addressesTile = webDriver.findElement(By.xpath("//*[@id=\"addresses-link\"]"));
        addressesTile.click();
    }

    @And("wypelnienie formularza New address")
    public void wypelnienie_formularza_new_address() {
    }

    @And("wypelnienie formularza New address Leszek mainstreet Warsaw {int}-{int} Poland {int}")
    public void wypelnienie_formularza_new_address_leszek_mainstreet_warsaw_poland(Integer int1, Integer int2, Integer int3) {
        WebElement aliasInput = webDriver.findElement(By.id("field-alias"));
        WebElement addressInput = webDriver.findElement(By.id("field-address1"));
        WebElement cityInput = webDriver.findElement(By.id("field-city"));
        WebElement zipInput = webDriver.findElement(By.id("field-postcode"));
        WebElement countrySelect = webDriver.findElement(By.id("field-id_country"));
        WebElement phoneInput = webDriver.findElement(By.id("field-phone"));

        aliasInput.sendKeys("Leszek");
        addressInput.sendKeys("mainstreet");
        cityInput.sendKeys("Warsaw");
        zipInput.sendKeys("21-311");

        countrySelect.sendKeys("Poland");

        phoneInput.sendKeys("731834556");

        WebElement saveButton = webDriver.findElement(By.name("submitAddress")); // tutaj miałem problem z selektorem
        saveButton.click();
    }

    @Then("sprawdzenie poprawnosci danych w adresie")
    public void nowy_adres_wyświetlony_na_liście_adresów() {

        try {
            WebElement successAlert = this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
            assertEquals("alert o sukcesie", successAlert.getText()); // Sprawdzam czy się zgadza adres
        } catch (NoSuchElementException ex) {
            fail("adrse się nie zgadza"); // ustalam czy adres się zgadza
        }
    }
}










