package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        Dimension newDimension = new Dimension(1800, 1000);
        driver.manage().window().setSize(newDimension);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        String login_user = "Admin";
        String login_key = "admin123";

        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

        username.sendKeys(login_user);
        password.sendKeys(login_key);
        loginBtn.submit();

        Thread.sleep(3000);

        WebElement recruitmentOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a"));
        recruitmentOption.click();

//        WebElement jobTitleSelectBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div"));
//        WebElement jobTitleSelectBtn = driver.findElement(By.xpath("//div[@class = 'oxd-select-wrapper'][1]"));

//        WebElement qaLeadOption = jobTitleSelect.findElement(By.xpath("//div[contains(text(), 'QA Lead')]"));
//
//        action.moveToElement(jobTitleSelectBtn).click();
//        jobTitleSelectBtn.click();



        Thread.sleep(7000);

        driver.quit();
    }
}
