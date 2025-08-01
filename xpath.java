import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Your-Chrome-Driver-Path");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create");

        // Locate element by XPath and enter value
        WebElement firstName = driver.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
        firstName.sendKeys("Your-Name");

        // Example with another XPath
        WebElement lastName = driver.findElement(By.xpath("//input[@id='usernamereg-lastName']"));
        lastName.sendKeys("Your-LastName");

        driver.quit();
    }
}
