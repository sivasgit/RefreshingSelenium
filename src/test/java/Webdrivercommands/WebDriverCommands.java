package Webdrivercommands;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class WebDriverCommands {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "F:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.practiceselenium.com/practice-form.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("url is " + driver.getCurrentUrl());

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("siva");
        driver.findElement(By.name("lastname")).sendKeys("prasad");
        System.out.println(name.getAttribute("name"));

        //radio button
        System.out.println("male is displayed" + driver.findElement(By.id("sex-1")).isDisplayed());
        System.out.println("male is enabled " + driver.findElement(By.id("sex-1")).isEnabled());
        WebElement rbe = driver.findElement(By.id("sex-1"));
        rbe.click();
        System.out.println("male is Selected : " + driver.findElement(By.id("sex-0")).isSelected());

        driver.findElement(By.cssSelector("input[value='5']")).click();
        driver.findElement(By.id("tea1")).click();
        driver.findElement(By.id("tea3")).click();

        Select drpdwn = new Select(driver.findElement(By.id("continents")));
        int count = drpdwn.getOptions().size();
        System.out.println("Total continents are :" + count);

        List <WebElement> options = drpdwn.getOptions();
        for ( WebElement e : options ) {

            System.out.println(e.getText());
        }

        //drpdwn.selectByIndex(3);
        drpdwn.selectByVisibleText("Asia");

        Select listbox = new Select(driver.findElement(By.id("selenium_commands")));
        int boxCount =listbox.getOptions().size();
        System.out.println(boxCount);

        List <WebElement>listboxOptions = listbox.getOptions();
        for (WebElement lb:listboxOptions){
            System.out.println(lb.getText());
        }

        listbox.selectByVisibleText("Wait Commands");

        driver.findElement(By.id("submit"));






        Thread.sleep(2000);

        driver.quit();

    }

}