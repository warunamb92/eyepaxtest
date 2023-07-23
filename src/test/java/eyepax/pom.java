package eyepax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom {

    


   WebElement element=null;

    public static WebElement userName(WebDriver driver)
    {
       
        WebElement element=driver.findElement(By.name("email"));
        return element;
    }

     public static WebElement password(WebDriver driver)
    {
       
        WebElement element=driver.findElement(By.name("pass"));
        return element;
    }

    
     public static WebElement btn_login(WebDriver driver)
    {
       
        WebElement element=driver.findElement(By.name("login"));
        return element;
    }



    

 

    
}
