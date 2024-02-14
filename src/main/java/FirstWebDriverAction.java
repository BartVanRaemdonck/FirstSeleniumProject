import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://axxes.com");
        driver.quit();
    }
}
