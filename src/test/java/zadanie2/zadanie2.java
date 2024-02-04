package zadanie2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class zadanie2 {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver webDriver = driver;
        webDriver.manage().window().maximize();


        try {

            driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");


            WebElement emailInput = driver.findElement(By.id("field-email"));
            emailInput.sendKeys("10minute@mail.com");

            WebElement passwordInput = driver.findElement(By.id("field-password"));
            passwordInput.sendKeys("leszek1984");


            WebElement loginButton = driver.findElement(By.id("submit-login"));
            loginButton.click();


            WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"category-3\"]/a"));
            addToCartButton.click();

            WebElement addToCartButton1 = driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[2]/a"));
            addToCartButton1.click();

            WebElement addToCartButton2 = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div[2]/article"));
            addToCartButton2.click();

            WebElement addToCartButton3 = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
            addToCartButton3.click();
            WebElement addToCartButton4 = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
            addToCartButton4.click();


            WebElement dropdown = driver.findElement(By.xpath("//*[@id='group_1']"));

            Select select = new Select(dropdown);

            select.selectByVisibleText("M");

            WebElement addToCartButton5 = driver.findElement(By.name("qty"));
            addToCartButton5.click();

            WebElement quantityInput = driver.findElement(By.id("quantity_wanted"));
            quantityInput.clear();
            quantityInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "5");

            WebElement addToCartButton6 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div[1]/div[2]/button"));
            addToCartButton6.click();

            WebElement addToCartButton7 = driver.findElement(By.id("#blockcart-modal"));
            addToCartButton7.click();




        } catch (Exception e) {
            e.printStackTrace();


            // Dalsze kroki po zalogowaniu...
//
//        } finally {
//            // Zamknięcie przeglądarki po zakończeniu testu
//            driver.quit();
        }
    }
}