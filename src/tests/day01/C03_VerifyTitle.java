package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyTitle {
    /*
    1. Yeni bir class olsuturalim ( Verify Title)
    2. Amazon Ana sayfasina gidelim. (https://www.amazon.com/)
    3. Sayfa basliginin (Title) "amazon" oldugunu dogrulayın (verify).
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://amazon.com/");

        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASS");
        } else{
            System.out.println("title beklenen degerden farkli, test FAILED");
            System.out.println("actual title : " + actualTitle);
        }
        driver.close();

    }
}
