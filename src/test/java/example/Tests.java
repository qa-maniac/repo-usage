package example;

import environment.Environment;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tools.zoho.ZohoApi;
import tools.zoho.ZohoDataKey;
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

    @Test
    public void doTest2() {
        int a = 2;
        int b = 3;
        assertEquals(b - a, 1);
    }

    @Test
    public void doTest3() {
        int a = 2;
        int b = 3;
        assertEquals(b * a, 6);
    }

    @Test
    public void doTest4() {
        int a = 2;
        int b = 6;
        assertEquals(b / a, 3);
    }

    @Test
    public void doTest5() {
        ZohoApi api = new ZohoApi();
        Response response = api.getUserByEmail("maksym.ivanov@elegro.eu");
        System.out.println(response.prettyPrint());
    }

    @Test
    public void doTest6() {
        String time = System.getProperty(ZohoDataKey.TIME.toString());
        System.out.println(time);
    }
}