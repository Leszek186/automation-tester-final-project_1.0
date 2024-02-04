package zadanie2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;


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

            WebElement addToCartButton6 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
            addToCartButton6.click();



            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")));


            WebElement addToCartButton7 = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
            addToCartButton7.click();

            WebElement addToCartButton8 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
            addToCartButton8.click();

            WebElement addToCartButton9 = driver.findElement(By.name("confirm-addresses"));
            addToCartButton9.click();

            WebElement addToCartButton10 = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]"));
            addToCartButton10.click();

            WebElement addToCartButton11 = driver.findElement(By.name("confirmDeliveryOption"));
            addToCartButton11.click();

            WebElement addToCartButton12 = driver.findElement(By.id("payment-option-1"));
            addToCartButton12.click();

            WebElement addToCartButton13 = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
            addToCartButton13.click();

            WebElement addToCartButton14 = driver.findElement(By.id("payment-confirmation"));
            addToCartButton14.click();


            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Path destinationPath = Paths.get("C:\\Users\\W10\\Desktop\\tutaj screen.jpg");


            screenshotFile.renameTo(destinationPath.toFile());

            System.out.println("Zrzut ekranu: " + destinationPath);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }
}