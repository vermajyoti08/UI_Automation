package UIautomation;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class UIautomation {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        String actualHomepage = driver.getTitle();
        String expectedHomepage = "Automation Exercise";
        Assert.assertEquals(actualHomepage,expectedHomepage);
        driver.manage().window().maximize();
        driver.findElement(xpath("//a[@href='/login']")).click();
        //String actualSignup = driver.getTitle();
        String actualSignup = driver.findElement(xpath("//div[@class='signup-form']/h2")).getText();
        String expectedSignup = "New User Signup!";
        Assert.assertEquals(actualSignup,expectedSignup);
        driver.findElement(xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("Jyoti");
        driver.findElement(xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("jyoti024@yopmail.com");
        driver.findElement(xpath("//input[@data-qa=\"signup-email\"]")).sendKeys(Keys.ENTER);
        String actualAccinfo = driver.findElement(xpath("//h2[@class='title text-center']/b")).getText();
        String expectedAccinfo = "ENTER ACCOUNT INFORMATION";
        //System.out.print(Assert.assertEquals(actualAccinfo,expectedAccinfo));
        Assert.assertEquals(actualSignup,expectedSignup);
        driver.findElement(xpath("//input[@data-qa='password']")).sendKeys("Jyoti0108");
        driver.findElement(xpath("//*[@id=\"days\"]/option[9]")).click();
        driver.findElement(xpath("//*[@id=\"months\"]/option[8]")).click();
        driver.findElement(xpath("//*[@id=\"years\"]/option[23]")).click();
        driver.findElement(xpath("//input[@id='newsletter']")).click();
        driver.findElement(xpath("//input[@id='optin']")).click();
        driver.findElement(xpath("//input[@data-qa='first_name']")).sendKeys("Jyoti");
        driver.findElement(xpath("//input[@data-qa='last_name']")).sendKeys("Verma");
        driver.findElement(xpath("//input[@data-qa='company']")).sendKeys("ThoughtsBig");
        //address
        driver.findElement(xpath("//input[@name='address1']")).sendKeys("Mall road");
        driver.findElement(xpath("//input[@name='address2']")).sendKeys("BSNL office");
        driver.findElement(xpath("//input[@name='state']")).sendKeys("UP");
        driver.findElement(xpath("//input[@name='city']")).sendKeys("Kanpur");
        driver.findElement(xpath("//input[@name='zipcode']")).sendKeys("208001");
        driver.findElement(xpath("//input[@name='mobile_number']")).sendKeys("1234567889");
        driver.findElement(xpath("//input[@name='mobile_number']")).sendKeys(Keys.ENTER);

        String actualAccCreate = driver.findElement(xpath("//h2[@class='title text-center']/b")).getText();
        String expectedAccCreate = "ACCOUNT CREATED!";
        Assert.assertEquals(actualAccCreate,expectedAccCreate);
        driver.findElement(xpath("//a[@data-qa='continue-button']")).click();

        String actualLoggedinasusername = driver.findElement(xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).getText();
        String expectedLoggedinasusername = "Jyoti";
        Assert.assertEquals(actualLoggedinasusername,expectedLoggedinasusername);

    }
}

