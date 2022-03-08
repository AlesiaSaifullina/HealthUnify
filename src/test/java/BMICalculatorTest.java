import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMICalculatorTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void categoryShouldBeStarvation() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("35");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
    }
    @Test
    public void categoryShouldBeStarvation2() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("38.3");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
    }

    @Test
    public void categoryShouldBeUnderweight() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("38.42");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
    }

    @Test
    public void categoryShouldBeUnderweight2() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("47.37");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
    }

    @Test
    public void categoryShouldBeNormal() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("47.38");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }
    @Test
    public void categoryShouldBeNormal2() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("64");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }

    @Test
    public void categoryShouldBeOverweight() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("64.1");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }
    @Test
    public void categoryShouldBeOverweight2() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("76.8");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }
    @Test
    public void categoryShouldBeObese() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("76.9");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

