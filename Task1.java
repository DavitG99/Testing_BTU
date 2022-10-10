import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void Task_1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement button=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a"));
        button.click();
        WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));

        driver.navigate().to("http://the-internet.herokuapp.com/");
        WebElement button_dropdown=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a"));
        button_dropdown.click();

        WebElement option2=driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        option2.click();

    }
}
