package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminDemoLoginTest {
    /*1) Launch Browser
    2. open url: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
    3. Provide username - admin@yourstore.com
    4. provide password - admin
    5. Click on Login button
    6. Verify the title of dashboard page
     */

    public static void main(String[] args) throws InterruptedException {
        //1) Launch Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. open Url
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Thread.sleep(5000);
        //3. Provide Username - admin@yourstore.com
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        //4. Provide Password - admin
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("admin");
        //5. Click on Login button
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
        //6. Verify the title of dashboard page
        String act_label = null;
        try {
            act_label = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
        } catch (NoSuchElementException e){
            act_label = "";
        }

        String exp_label = "Dashboard";

        if(act_label.equals(exp_label)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("failed");
        }
        driver.quit();
    }
}
