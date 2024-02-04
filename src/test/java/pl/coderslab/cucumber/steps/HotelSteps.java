//package pl.coderslab.Cucumber.Steps;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.Assert.*;
//
//public class HotelSteps {
//
//    private WebDriver webDriver;
//
//    @Given("otworzenie strony hotelu")
//    public void openBrowserWithHotelRegistration(){
//        this.webDriver = new ChromeDriver();
//        this.webDriver.get("https://hotel-testlab.coderslab.pl/en/");
//    }
//
//    @When("użytkownik się rejestruje {word} {word} {word}")
//    public void RejestracjaUzytkownika(String imie, String nazwisko, String email) throws InterruptedException {
//
//        this.webDriver.findElement(By.className("user_login")).click();
//        this.webDriver.findElement(By.className("validate")).sendKeys(email);
//        this.webDriver.findElement(By.id("SubmitCreate")).click();
//        Thread.sleep(3000);
//        this.webDriver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(imie);
//        this.webDriver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(nazwisko);
//        this.webDriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Kursik");
//        this.webDriver.findElement(By.xpath("//button[@id='submitAccount']")).click();
//    }
//
//    @Then("Utworzenie konta użytkownika")
//    public void UtworzenieKonta() {
//
//        try {
//            WebElement successAlert = this.webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
//            assertEquals("Your account has been created.", successAlert.getText()); // Sprawdzamy czy rzeczywiscie utworzylo nowego uzytkownika
//        } catch (NoSuchElementException ex) {
//            fail("Alert o sukcesie sie nie pojawil"); // Sami ustalamy, ze test nie przeszedl w tym wypadku
//        }
//    }
//
//
//    @And("zamkniecie hotelu")
//    public void ZamkniecieHotelu(){
//        this.webDriver.quit();
//    }
//
//    @Given("uzytkownik jest zalogowany")
//    public void LogowanieSieNaStroneHotelu(){
//        this.webDriver = new ChromeDriver();
//        this.webDriver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
//        this.webDriver.findElement(By.id("email")).sendKeys("ola123@wp.pl");
//        this.webDriver.findElement(By.id("passwd")).sendKeys("Kursik");
//        this.webDriver.findElement(By.id("SubmitLogin")).click();
//    }
//
//    @When("uzytkownik dodaje adres do swojego konta")
//    public void DodanieAdresu() {
//        this.webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span")).click();
//
//    }
//
//
//    @Then("adres zostaje dodany")
//    public void AdresZostajeDodany(){
//        this.webDriver.findElement(By.id("address1")).sendKeys("Kolejowa 78");
//        this.webDriver.findElement(By.id("city")).sendKeys("Krakow");
//        this.webDriver.findElement(By.id("postcode")).sendKeys("25864");
//        this.webDriver.findElement(By.id("phone_mobile")).sendKeys("546321789");
//        this.webDriver.findElement(By.id("alias")).sendKeys("Domek");
//        this.webDriver.findElement(By.id("submitAddress")).click();
//
//    }
//}

