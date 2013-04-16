import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class  {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.shibumi.com/");
        wd.findElement(By.id("j_password")).click();
        wd.findElement(By.id("j_password")).clear();
        wd.findElement(By.id("j_password")).sendKeys("$hibumiFred");
        wd.findElement(By.xpath("//form[@id='credentials']/fieldset/input")).click();
        wd.findElement(By.linkText("Group")).click();
        wd.findElement(By.xpath("//nav[@class='primary-nav']/ul/li[1]/a/span")).click();
        wd.findElement(By.xpath("//ul[@id='objId_7e87b984-36d6-4935-9c0b-32ea8f38711a']//a[.='QAGrp1a']")).click();
        wd.findElement(By.xpath("//section[@class='summary-block-top']/div[1]/span[2]")).click();
        wd.findElement(By.xpath("//div[@id='optionContainer']//a[.='Edit Group']")).click();
        wd.findElement(By.cssSelector("//html/body")).click();
        wd.findElement(By.xpath("//section[@class='summary-block-top']/div[1]")).click();
        wd.findElement(By.xpath("//nav[@class='primary-nav']/ul/li[1]/a/span")).click();
        wd.findElement(By.xpath("//ul[@id='objId_7e87b984-36d6-4935-9c0b-32ea8f38711a']//a[.='QAGrp1a']")).click();
        wd.findElement(By.xpath("//section[@class='summary-block-top']/div[1]")).click();
        wd.findElement(By.xpath("//div[@id='optionContainer']//a[.='Delete Group']")).click();
        wd.findElement(By.xpath("//div[@class='button-bar']/input")).click();
        wd.findElement(By.linkText("Sign Out")).click();
        wd.close();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
