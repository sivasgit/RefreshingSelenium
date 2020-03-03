/*

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileUploadRobotClass {


package Webdrivercommands;
    public static void main(String[] args) throws AWTException {

        Robot  robot = new Robot();
        System.setProperty("webdriver.chrome.driver","\"F:/Drivers/chromedriver.exe\"");

        WebDriver driver = new ChromeDriver();

        driver.get();
        driver.findElement()
        robot.setAutoDelay(3);
        StringSelection stringSelection=new StringSelection();//file path
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        robot.setAutoDelay(2000);

        // ctrl+v function

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        //Release function

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //Press Enter button

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }



}
*/
