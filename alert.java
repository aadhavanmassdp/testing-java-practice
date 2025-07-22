import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        // Trigger the prompt alert
        driver.findElement(By.id("promtButton")).click();

        // Switch to alert, send input, and accept
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt text: " + promptAlert.getText());
        promptAlert.sendKeys("Selenium Test");
        promptAlert.accept();

        driver.quit();
    }
}
