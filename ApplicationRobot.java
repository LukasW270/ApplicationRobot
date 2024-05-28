import java.awt.*;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 


public class ApplicationRobot{
    public static void main(String[] args) throws Exception{

        Robot lukas = new Robot();

        lukas.mouseMove(20,1060);
        lukas.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        lukas.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        lukas.delay(2000);

        lukas.mouseMove(350,750);
        lukas.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        lukas.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        lukas.delay(2000);

        lukas.keyPress(32);
        lukas.keyRelease(32);

        lukas.delay(2000);

        lukas.mouseMove(1330,920);
        lukas.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        lukas.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        lukas.delay(2000);

        lukas.mouseMove(880,100);
        lukas.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        lukas.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        lukas.delay(1000);

        lukas.mouseMove(880,210);
        lukas.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        lukas.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        lukas.delay(1000);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image = lukas.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath());

    }
}