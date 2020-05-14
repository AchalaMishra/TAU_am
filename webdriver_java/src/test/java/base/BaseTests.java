package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.List;
//import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);


         // Tutorial code : chapter 3
   //   List<WebElement> links = driver.findElements(By.tagName("a"));
   //   System.out.println(links.size());

   //   WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
   //   inputsLink.click();

// Test exercise - Chapter 3
      //  WebElement shifting_content = driver.findElement(By.linkText("Shifting Content"));
       // shifting_content.click();

        //WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        //example1.click();

        //List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        //System.out.println("Number of menu items: " + menuItems.size());





// ITMS website
       //  driver.get("https://www.itms-online.com/Default.aspx");
       //  WebElement sysreq =  driver.findElement(By.linkText("System Requirements"));
       //  sysreq.click();





        //browser window sizing
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375,812));

      //  System.out.println(driver.getTitle());
       driver.quit();
    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

}


