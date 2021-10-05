package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {
    /*
    1. Yeni bir Class olusturalim. (NavigationMethods)
    2. Techrpoeducation ana sayfasına gidelim. https://www.techproeducation.com/
    3. Amazon saydasına gidelim. https://www.amazon.com/
    4. Tekrar Techpro'ya dönelim.
    5. Yeniden Amazon'a dönelim.
    6. Sayfayı yenile
    7. sayfayı tam ekran yap.
    8. tum sayfayları kapatalim.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.techproeducation.com/");
        driver.navigate().to("https:www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
