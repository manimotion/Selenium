package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
1. Launch browser
2. open url "https://opensource-demo.orangehrmlive.com/"
3. Provide Username - Admin
4. Provide Password - admin123
5. Click on Login button
6. Verify the titlle of dashboard page
    exp title: OrangeHRM
7. close browser
 */
public class OrangeHRMloginTest {
    public static void main(String[] args) throws InterruptedException {
        //1. Launch browser
        WebDriver driver = new ChromeDriver();
        //2. open url "https://opensource-demo.orangehrmlive.com/"
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //3. Provide Username - Admin
        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("Admin");
        //4. Provide Password - admin123
        driver.findElement(By.name("password")).sendKeys("admin");
        //5. Click on Login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(7000);
        //6. Verify the titlle of dashboard page
        //    exp title: OrangeHRM
        // TITLE VALIDATION
        /*
        String act_title =driver.getTitle();
        String exp_title = "OrangeHRM";

        if(act_title.equals(exp_title)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("failed");
        }
        */

        //label validation after valid login
        String act_label = null;
        try {
            act_label = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
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

        //7. close browser
        //driver.close();
        driver.quit();

    }
}
