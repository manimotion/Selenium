package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //CSS with tag and id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
        Thread.sleep(5000);
        driver.quit();
    }
}
