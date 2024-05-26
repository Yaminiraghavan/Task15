package Task15;


//These imports include the necessary Selenium WebDriver classes.
// By is used for locating elements, WebDriver is the main interface,
// WebElement represents elements on a webpage,
// and ChromeDriver is the specific driver for the Chrome browser.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
    public static void main(String[] args) {
        // Initialize a new instance of the Chrome driver
        //This creates an instance of ChromeDriver, which opens a new Chrome browser window.
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        //This line navigates the browser to the specified URL.
        driver.get("https://www.google.com/");

        //maximize the page
        driver.manage().window().maximize();

        // Find the search box using its attribute
        //This finds an element on the page by its attribute and it looks for an element with the attribute name.
        WebElement search =driver.findElement(By.className("gLFyf"));

        // Enter text into the search box
       // sendKeys types the text "Selenium Browser Driver" into the found element.
        search.sendKeys("Selenium Browser Driver");

        //Click the  Enter key form
        search.sendKeys(Keys.ENTER);

        // Close the browser
        //This closes the browser window and ends the WebDriver session.
        driver.quit();
    }
}

