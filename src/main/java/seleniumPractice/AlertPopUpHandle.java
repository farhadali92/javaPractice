package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        wait_in_seconds(5);
        driver.quit();

    }

    public static void wait_in_seconds(int seconds){
        try {
            Thread.sleep(seconds *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
