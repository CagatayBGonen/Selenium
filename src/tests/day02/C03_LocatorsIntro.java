package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_LocatorsIntro {
    /*
    1.Main method olusuturun ve asagidaki gorevi tamamlayin
        a.http://a.testaddressbook.com adresine gidiniz
        b.sign in buttonuna basiniz
        c.email textbox,password textbox, and signin button  elementlerini locate ediniz
        d.kullanici adini ve sifreyi asagiya girin ve oturum ac(sign in) buttonuna tiklayin:
            i.Username:testtechproed@gmail.com
            ii.password:Test1234!
        e.Expected user id nin testtechproed@gmail.com oldgunu dogrulayin(verify).
        f."Addresses" ve "Sing Out" textlerinin görüntülendiğini (displayed) dogrulayin(verify).
    2.Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/");
        WebElement signInButton = driver.findElement(By.id("sign-in"));
        signInButton.click();
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        Thread.sleep(2000);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordBox = driver.findElement(By.id("session_password"));
        WebElement signInButtonID = driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!" + Keys.ENTER);

        String expectedUserID = "testtechproed@gmail.com";

        if (driver.findElement(By.className("navbar-text")).getText().equals(expectedUserID) ){
            System.out.println("User ID Test PASS");
        }else {
            System.out.println("User ID Test FAILED");
        }
       if (driver.findElement(By.linkText("Addresses")).isDisplayed()){
           System.out.println("Addresses Verify: PASS");
       } else {
           System.out.println("Addresses verify: FAILED");
       }
       if (driver.findElement(By.linkText("Sign out")).isDisplayed()){
           System.out.println("Sign Out verify: PASS");
       } else System.out.println("Sign Out verify: FAILED");
        List<WebElement> linkNumber = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links in the page : "+linkNumber.size());

        //linklerin yazilarini yazdiralim
        // elimizdeki listedeki tum webelementlerin yazilarini for loop ve for each ile yazdirabiliriz.
        // tum elementler yazdiralacaksa bu durumda for each loop daha kullanişli olacaktir.
        int count = 1;
        for(WebElement each: linkNumber){
            System.out.println(count+"-"+each.getText());
            count++;
        }

        driver.close();


    }
}
