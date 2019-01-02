package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {


    public WebDriver driver= null;


    @BeforeMethod

    public void setUP(){
        //WebDriver driver = new FirefoxDriver();

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\googleDriver\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.alibaba.com/");
        driver.get("https://www.amazon.com/");





    }

   /* @AfterMethod

    public void cleanUP(){
        driver.close();


    }*/

}
