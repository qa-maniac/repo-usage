package example;

import environment.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;
import org.testng.annotations.Test;
import ui.BasePage;

import static org.testng.Assert.assertEquals;


public class Tests {

    @Test
    public void doTest() {
        BasePage basePage = new Environment().getBasePage();
        basePage.getDriver().manage().window().maximize();
        basePage.getDriver().get("https://google.com");
        WebElement element = basePage.getDriver().findElement(By.xpath("//div[2]/div[1]/div/a"));
        element.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.getDriver().quit();
    }

    @Test
    public void doTest1() {
        int a = 2;
        int b = 3;
        assertEquals(a + b, 5);
    }
}