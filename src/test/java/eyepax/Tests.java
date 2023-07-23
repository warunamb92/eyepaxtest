package eyepax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Tests {

    
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void YahooTest() throws InterruptedException 
    {
        
        String username="Testuser";
        String password="TestPass";
        String Hello="Hello World";

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        pom.userName(driver).sendKeys(username);
        pom.password(driver).sendKeys(password);
        pom.btn_login(driver).click();
       
        Thread.sleep(3000);


        System.out.println(Hello);


    }

    
    @AfterMethod
    public void closebrowser() {
      
        driver.quit();
    }




    
}
