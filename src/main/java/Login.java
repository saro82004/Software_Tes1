//package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // 3. Maximize browser
        driver.manage().window().maximize();

        // 4. Enter username
        driver.findElement(By.name("username"))
                .sendKeys("john");

        // 5. Enter password
        driver.findElement(By.name("password"))
                .sendKeys("demo");

        // 6. Click Login button
        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        // 7. Get page title text
        String title = driver.findElement(By.className("title"))
                .getText();

        // 8. Print result
        System.out.println("Login Result: " + title);

        // 9. Close browser
        driver.quit();
    }
}