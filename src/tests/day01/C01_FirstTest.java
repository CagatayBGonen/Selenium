package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("current url : " + driver.getCurrentUrl());
        System.out.println("current title : " + driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000); //bekletmek icin

        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        // driver.quit(); // tum sayfalari kapatir

        driver.close(); // sadece calisan sayfayi kapatir

    }
}
