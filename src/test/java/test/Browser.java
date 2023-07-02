package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver(); //Get Web Browser as Chrome Driver

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); // Sets the amount of time to wait for an asynchronous script to finish execution before throwing an error.
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Sets the amount of time to wait for a page load to complete before throwing an error.

    String url = "https://google.com";
    String seleniumUrl = "https://www.selenium.dev/selenium/web/web-form.html";

    String driverWindowHandle = driver.getWindowHandle(); // Get a unique ID of the current window which will identify it within this driver instance
    String navigateTo = "https://youtube.com";

    driver.get(url); // Allows for the browser to move forward(as per browser history) ,Back (as per browser history), Refresh or to open any link
/*
    driver.navigate().to(navigateTo); // Navigates to a URL

    driver.navigate().back(); // Enables the web browser to click on the back button in the existing browser window
    Thread.sleep(2000); // Add Sleep to show changes (Not recommended, it's just a quick way)
    driver.navigate().forward(); // Enables the web browser to click on the back button in the existing browser window
    Thread.sleep(2000);    // Add Sleep to show changes (Not recommended, it's just a quick way)
    driver.navigate().refresh(); // Enables the web browser to click on the refresh button in the existing browser window


    driver.switchTo().newWindow(WindowType.WINDOW); // Sends a command to open a new window page
    driver.switchTo().newWindow(WindowType.TAB); // Sends a command to open a new tab

    driver.switchTo().window(driverWindowHandle); // Switched to saved window in driver instance


    Thread.sleep(2000); // Add Sleep to show changes (Not recommended, it's just a quick way)

    Dimension size = driver.manage().window().getSize(); // Get dimensions of browser including width and height
    int width = size.getWidth(); // Get width of browser
    int height = size.getHeight(); // Get height of browser

    driver.manage().window().setSize(new Dimension(800,600)); // Set dimensions of browser with width and height

    Point position = driver.manage().window().getPosition(); // Get Position of browser including X and Y
    int xPosition = position.getX(); // Get X point of browser
    int yPosition = position.getY(); // Get Y point of browser

    driver.manage().window().setPosition(new Point(500,100)); // Set dimensions of browser with width and height

    driver.manage().window().maximize(); // To maximize browser
    driver.manage().window().minimize(); // To minimize browser
    driver.manage().window().fullscreen(); // To full screen browser

    // Take screenshot of browser
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      FileUtils.copyFile(srcFile,new File("./src/main/resources/images/sample.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }


    // Take screenshot of web element
    WebElement webElement = driver.findElement(By.cssSelector(".external-icon"));
    File srcFileWebElement = webElement.getScreenshotAs(OutputType.FILE);  // Take screenshot of browser
    try {
      FileUtils.copyFile(srcFileWebElement,new File("./src/main/resources/images/sample.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }


    //Execute Javascript
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
    WebElement signInButton = driver.findElement(By.className("RNmpXc"));
    javascriptExecutor.executeAsyncScript("arguments[0].click();", signInButton);

    Thread.sleep(2000); // Add Sleep to show changes (Not recommended, it's just a quick way)
*/
    driver.close(); // Close the opened tab
    driver.quit(); // Close the entire browser session
  }
}
