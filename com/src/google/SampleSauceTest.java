import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SampleSauceTest {

  public static final String USERNAME = "Purush_12";
  public static final String ACCESS_KEY = "3b1c6846-0b29-40e3-a87a-70d93820d78a";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("version", "48.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=SKTGV4LWNouCvAT2iYEQ");
        driver.findElement(By.id("lst-ib")).click();
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("git");
        driver.findElement(By.xpath("//div[@id='sbse0']//div[.='github']")).click();
        driver.findElement(By.linkText("How people build software Â· GitHub")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("login_field")).click();
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys("Purushoth88");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("October@12");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.xpath("//ul[@id='user-links']/li[3]/a/span")).click();
        driver.findElement(By.xpath("//ul[@id='user-links']/li[3]/a/span")).click();
        driver.findElement(By.xpath("//form[@class='logout-form']/button")).click();
        driver.quit();
  }
}
