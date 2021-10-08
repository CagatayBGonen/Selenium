package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_AddRemoveElements {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin.
    2- Add Element buttonuna basin.
    3- Delete butonu'nun gurunur oldugunu test edin.
    4- Delete tusuna basin.
    5- Delete butonunun gorunur olmadıgını test edin
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //text ile bulma yolu: //button[text()='Add Element']

        if (driver.findElement(By.xpath("//button[@class='added-manually']")).isDisplayed()){
            System.out.println("Delete Button Display Test, PASS");
        } else {
            System.out.println("Delete Button Display Test FAILED");
        }

        driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        Thread.sleep(1000);
        //delete buttonun gorunurlugunu test edemegiz cunku o elementin varlıgı silinmistir.
        // Eger button'a bastiginizda HTML kodundaki satirda siliniyorsa driverin o elemente
        // ulasmasi mumkun olmayacaktir.
        // locate etmeye calisirsak hata verir.
        driver.close();
    }
}
