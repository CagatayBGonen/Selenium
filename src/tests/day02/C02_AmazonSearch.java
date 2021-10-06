package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonSearch {
    //Amazon web syafsina git
    // Java icin arama
    // ve bulunan sonuc sayısını yazdirin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("java" + Keys.ENTER);

        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());

        //webelementler obje oldugu icin direk yazdiralamazlar
        // webelememtin sahip oldugu yaziyi string olarak yazdirmak icin
        // getText() method'u kullaniriz.

    }
}
