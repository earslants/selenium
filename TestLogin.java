package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Emirhan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("eeac_e48@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456aabbcc");
        driver.findElement(By.name("login")).click();

    }
}
