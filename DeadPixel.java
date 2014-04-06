import javax.swing.JDialog;
import java.awt.Color;
import java.util.Random;

public class DeadPixel extends JDialog {

  public DeadPixel(int x, int y) {
    x = 0 + (int)(Math.random() * ((x - 0) + 1));
    y = 0 + (int)(Math.random() * ((y - 0) + 1));
    setType(Type.UTILITY);
    setSize(1, 1);
    setLocation(x,y);
    setResizable(false); 
    setUndecorated(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    setAlwaysOnTop(true);
    getContentPane().setBackground(Color.BLACK);
  }


}
