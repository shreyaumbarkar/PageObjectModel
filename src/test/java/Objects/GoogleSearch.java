package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
    WebDriver driver;

    // create constructor
    public GoogleSearch(WebDriver driver){
        this.driver=driver;
    }
        By searchbox = By.xpath(" //textarea[@class='gLFyf']");
        public void searchgoogle(String searchinput)
        {
            driver.findElement(searchbox).sendKeys(searchinput);
        }
    }

 
