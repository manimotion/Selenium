package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();

        //LIst of WEbElements - FInding number of sliders on the web page
        List<WebElement> sliders = driver.findElements(By.className("homerslider-container"));
        System.out.println("Number of sliders: " + sliders.size());

        //Find Total number of images in home page
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());


    }
}
