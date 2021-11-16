import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
public class Browser {
public Browser(){
String url = "https://www.google.com/maps/@36.6136021,-
88.3251097,15.5z";
double longitude=36.6136021;//steps of 0.00001
double lattitude=-88.3251097;
double altitude=18.0;
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
             //for(int z=0;z<5;z++){//take screenshots at different altitudes
             for(int y=0;y<3;y++){
             for(int x=0;x<3;x++){
             url = 
"https://www.google.com/maps/@"+longitude+","+lattitude+","+altitude+"z";
             desktop.browse(new URI(url));
             TimeUnit.SECONDS.sleep(2);//delay to have 
enough time for it to load, but not enough time to load the crap
            
captureScreen(longitude+"_"+lattitude+"_"+altitude+".png",altitude);//save 
screenshot to file
             longitude+=0.1;
             }
             lattitude+=0.00001;
             }
             /* altitude--;//move up changing the altitude
            
             }*/
      
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
        }
}
    public static void main(String[] args) {
        Browser b=new Browser();
        
    }
    
    public void captureScreen(String fileName,double altitude) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        int alt=(int) altitude;
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "png", new File("Alt_"+alt+"/"+fileName));
     }
}
