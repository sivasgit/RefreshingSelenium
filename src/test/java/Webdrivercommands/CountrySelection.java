package Webdrivercommands;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CountrySelection {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/mercuryregister.php");

        WebElement countryCount = driver.findElement(By.name("country"));
        Select count = new Select(countryCount);
        int totalCountry =count.getOptions().size();
        System.out.println("total countries are : "+ totalCountry);

        List <WebElement>countryByName =count.getOptions();
        for(WebElement e:countryByName){
            System.out.println(e.getText());

        }
        count.selectByVisibleText("CANADA");
        //boolean testing =countryCount.isSelected();
        //System.out.println(testing);

        List <WebElement>linkList = driver.findElements(By.xpath("//a")) ;
        System.out.println("total links are :"+ linkList.size());

        for(WebElement ele : linkList){
            System.out.println("********total links ******");
            System.out.println(ele.getText());

        }



        driver.quit();





    }

}
