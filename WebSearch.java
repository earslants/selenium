import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSearch extends Thread{

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Emirhan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://n11.com");

        WebElement username = driver.findElement(By.id("searchData"));
        username.sendKeys("bilgisayar");
        driver.findElement(By.className("searchBtn")).click();

        WebElement checkbox = driver.findElement(By.id("brand-m-Lenovo"));
        if(!checkbox.isSelected())
            checkbox.click();
        Thread.sleep(3);
        checkbox = driver.findElement(By.id("brand-bellekkapasitesi-16-GB"));
        if(!checkbox.isSelected())
            checkbox.click();
        String sonuc = driver.findElement(By.className("resultText")).getText();
        System.out.println(sonuc);
    }
}
