package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
        // <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="E-posta veya Telefon Numarası"
        // autofocus="1" aria-label="E-posta veya Telefon Numarası">
        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_h_kb">Giriş Yap</button>
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        // email testbox'a ali yazdiralim
        WebElement mailTextBox = driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliseleniumcu@gmial.com");
        Thread.sleep(2000);
        mailTextBox.clear();

        // "input" unique olmadıgı icin, birden fazla oldugu icin bulamadı, secemedi.
        //WebElement mailBoxTagName = driver.findElement(By.tagName("input"));
        //mailBoxTagName.sendKeys("veliGover@gmail.com");

        //WebElement mailTextBoxID = driver.findElement(By.id("wrongemail"));
        //mailTextBoxID.sendKeys("flasfkişasl@gmail.com");
        // nosuchelementexception hatası verir. Cunku oyle bir ID yoktur.

        // giris yap buttonuna tikla
        WebElement buttonEnterTag = driver.findElement(By.tagName("button"));
        System.out.println(buttonEnterTag.isEnabled());
        buttonEnterTag.click();

    }
}
