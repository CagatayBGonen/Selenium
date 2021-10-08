package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cbgon\\OneDrive\\Belgeler\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon.com a gidin
        driver.navigate().to("https://www.amazon.com/");
        //java kelimesini aratın
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("java" + Keys.ENTER);
        Thread.sleep(2000);
        //kac sonuc geldigini ve  gelen sonuçlardan 4. ve 7. nin  isimlerini yazdirin.
        //WebElement resultNum = driver.findElement(By.xpath("//*[(text()='1-48 of over 3,000 results for')]"));
        WebElement resultNum = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        WebElement resultNo04 = driver.findElement(By.xpath("//*[(text()='Java: 3 Books in 1: Java Basics for Beginners + Java Front End Programming + Java Back End Programming')]"));
        WebElement resultNo07 = driver.findElement(By.xpath("//*[(text()='Think Java: How to Think Like a Computer Scientist')]"));
        System.out.println("Toplam sonuc : " + resultNum.getText() +"\n4. sonuc : " + resultNo04.getText() + "\n7. sonuc : " + resultNo07.getText());
        driver.close();

    }
}
