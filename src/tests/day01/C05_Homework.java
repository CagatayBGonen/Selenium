package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Homework {
    /*
    1.Yeni bir class olusturalim (Homework)
    2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
    4.https://www.walmart.com/ sayfasina gidin.
    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    6. Tekrar “facebook” sayfasina donun
    7. Sayfayi yenileyin
    8. Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://facebook.com/");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title test PASS");
        } else {
            System.out.println("Title test FAILED");
            System.out.println("actual title : " + actualTitle);
        }
        String expectedURL = "facebook";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL Test PASS");
        } else {
            System.out.println("URL Test FAILED");
            System.out.println("Actual URL : " + actualURL);
        }
        driver.navigate().to("https://www.walmart.com/");

        String expectedTitleWalmart = "Walmart.com";
        String actualTitleWalmart = driver.getTitle();

        if (actualTitleWalmart.contains(expectedTitleWalmart)) {
            System.out.println("Title test PASS");
        } else {
            System.out.println("Title test FAILED");
            System.out.println("actual title : " + actualTitleWalmart);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.close();

    }
}
