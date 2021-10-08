package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Locators_css {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //a. verilen web sayfasina gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //b. Locate email textbox
        WebElement emailBox = driver.findElement(By.cssSelector("#session_email"));
        //c. Locate password textbox ve
        WebElement passwordBox = driver.findElement(By.cssSelector("#session_password"));
        //d. Locate signin button
        WebElement signButton = driver.findElement(By.cssSelector("input[name='commit']"));
        //e. Kullanici adini ve sifreyi girin ve sign in buttonuna basin
        //i. username: testtechproed@gmail.com
        //ii.password: Test1234!
        Thread.sleep(2000);
        emailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
        signButton.click();
        driver.close();

        //Not: cssSelector kullanarak elementleri locate ediniz.
    }
}
