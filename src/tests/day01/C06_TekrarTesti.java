package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_TekrarTesti {
    /*
    1. Yeni bir class olusturun (TekrarTesti)
    2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
    (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
    URL'yi yazdırın.
    4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    5. Youtube sayfasina geri donun
    6. RefrSayfayi yenileyin
    7. Amazon sayfasina donun
    8. Sayfayi tamsayfa yapin
    9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
    doğru başlığı(Actual Title) yazdırın.
    10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    URL'yi yazdırın
    11.Sayfayi kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");
        String expectedTitleYoutube = "youtube";
        String actualTitleYoutube = driver.getTitle();
        if (expectedTitleYoutube.equals(actualTitleYoutube)){
            System.out.println("Youtube Title Test PASS");
        } else {
            System.out.println("Youtube Title Test FAILD");
            System.out.println("actual title : " + actualTitleYoutube);
        }
        String expectedURLYoutube = "youtube";
        String actualURLYoutube = driver.getCurrentUrl();
        if (actualURLYoutube.contains(expectedURLYoutube)){
            System.out.println("Youtube URL Test PASS");
        } else {
            System.out.println("Youtube URL Test FAILD");
            System.out.println("Actual URL : " + actualURLYoutube);
        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String expectedTitleAmazon = "Amazon";
        String actualTitleAmazon = driver.getTitle();
        if (actualTitleAmazon.contains(expectedTitleAmazon)){
            System.out.println("Amazon Title Test PASS");
        } else {
            System.out.println("Amazon Title Test FAILD");
            System.out.println("actual title : " + actualTitleYoutube);
        }
        String expectedURLAmazon = "https://www.amazon.com/";
        String actualURLAmazon = driver.getCurrentUrl();
        if (actualURLAmazon.equals(expectedURLAmazon)){
            System.out.println("Amazon URL Test PASS");
        } else {
            System.out.println("Amazon URL Test FAILD");
            System.out.println("Actual URL : " + actualURLYoutube);
        }
        driver.close();

    }
}
