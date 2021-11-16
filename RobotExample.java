// Java program to demonstrate working of Robot 
// class. This program is for Windoes. It opens 
// notepad and types a message. 
//code from geeksforgeeks.com
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 
  
public class RobotExample 
{ 
    public static void main(String[] args) throws IOException, 
                           AWTException, InterruptedException 
    { 
        String command = "notepad.exe"; 
        Runtime run = Runtime.getRuntime(); 
        run.exec(command); 
        try { 
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) 
        { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
  
        // Create an instance of Robot class 
        Robot robot = new Robot(); 
  
        // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
        robot.keyPress(KeyEvent.VK_H); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_W); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_R); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
   robot.keyPress(KeyEvent.VK_D); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_T); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_D); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_Y); 
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_I); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_S); 
        Thread.sleep(500); 
   robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(500); 
   robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_G); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_R); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_T);
     Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500);
   robot.keyPress(KeyEvent.VK_D); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_Y); 
        Thread.sleep(500);
    } 
}
