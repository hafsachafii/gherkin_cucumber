package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateDoc {
    public static WebDriver driver;
    @Given("user select url")
    public void userSelectUrl() throws Throwable{
        System.setProperty("webdriver.chrome.driver", "src/test/webdriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://numercity:numercity@123@dev.numercity.fr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button/span")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ben.chada@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aaa");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/nc-app-root[1]/nc-app-header[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//div[@id='main-content']/nc-formulaire-demande/div/div/div/div[2]/div[2]/div/div/select")).click();
        new Select(driver.findElement(By.xpath("//div[@id='main-content']/nc-formulaire-demande/div/div/div/div[2]/div[2]/div/div/select"))).selectByVisibleText("Consommation");
        driver.findElement(By.xpath("//div[@id='main-content']/nc-formulaire-demande/div/div/div/div[2]/div[2]/div/div/select")).click();

        WebElement quality = driver.findElement(By.xpath("/html[1]/body[1]/nc-app-root[1]/div[1]/nc-formulaire-demande[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/select[1]"));

        quality.click();

        Select qualityValue =new Select(quality);

        qualityValue.selectByVisibleText("Client(e) - YOUTUBE");

        driver.findElement(By.xpath("//textarea[@id='']")).click();
        driver.findElement(By.xpath("//textarea[@id='']")).clear();
        driver.findElement(By.xpath("//textarea[@id='']")).sendKeys("testkat");
        driver.findElement(By.xpath("(//textarea[@id=''])[2]")).click();
        driver.findElement(By.xpath("(//textarea[@id=''])[2]")).clear();
        driver.findElement(By.xpath("(//textarea[@id=''])[2]")).sendKeys("testkaaaat");
        driver.findElement(By.xpath("//div[@id='main-content']/nc-formulaire-demande/div/div/div/div[2]/div[5]/div/div[4]/div[3]/button/span[2]")).click();
        driver.findElement(By.xpath("(//div[@id='boxResetPasswordSuccess']/div/div/div[2]/div[2]/button)[2]")).click();
        driver.findElement(By.xpath("(//img[@alt='user-img'])[2]")).click();
        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
        driver.findElement(By.linkText("Accéder aux documents")).click();
        driver.quit();

    }

    @Given("user navigates to Login Page")
    public void userNavigatesToLoginPage() throws Throwable {
    }

    @And("enters username and Password")
    public void entersUsernameAndPassword() throws Throwable {


    }


    @When("user fill the form")
    public void userFillTheForm() throws Throwable{

    }

    @Then("verify the addition of the document")
    public void verifyTheAdditionOfTheDocument() throws Throwable{

    }
}
