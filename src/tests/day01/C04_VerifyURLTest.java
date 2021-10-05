package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyURLTest {
    /*
    1. Youtube ana sayfasina gidelim.
    2. sayfa url'sinin "www.youtube.com" oldugunu dogrulayın.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://youtube.com/");
        String expectedURL = "www.youtube.com";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("URL beklenen deger ile ayni, test PASS");
        } else{
            System.out.println("URL beklenen degerden farkli, test FAILED");
            System.out.println("actual url : " + actualURL);
        }
        driver.close();
    }
}
