import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {


    @Test

    public void test1(){

        driver.findElement(By.cssSelector("searchbar-keywor")).sendKeys("toys");
        driver.findElement(By.className("nav-input")).click();



            //nextpage and click
            //driver.findElement(By.xpath("//span[@id='pagnNextString']")).click();
        }

    }







