import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Toolkit;

public class RunDeadPixel {

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        int x =1000;
        for (int y = 0; y<x; y++){
              // I feel that this is horribly inneficient, but without making it static I can't find a way round.
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
          int width = (int) Math.round(screenSize.getWidth());
          int height = (int) Math.round(screenSize.getHeight());

          DeadPixel pixel = new DeadPixel(width, height);
          pixel.setVisible(true);
          try { 
            Thread.sleep(180000);
          } catch(Exception e) {

          }
        }
      }
    });

  }

}
