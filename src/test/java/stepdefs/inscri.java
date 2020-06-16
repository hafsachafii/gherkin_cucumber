package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class inscri {
    public static WebDriver driver;
    @Given("user on homepage")
    public void userOnHomepage() throws Throwable  {
        System.setProperty("webdriver.chrome.driver","src/test/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
    }

    @Given("select username and password")
    public void selectUsernameAndPassword() throws Throwable  {
        driver.findElement(By.id("login_field")).click();
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys("hafsa.13chafii@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("samantaguapita3");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }

    @Then("conncted")
    public void conncted() throws Throwable  {
        String exp_message = "Learn Git and GitHub without any code!";
        String actual = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/h2[1]")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();
    }
}
