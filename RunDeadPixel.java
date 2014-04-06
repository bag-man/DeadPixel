import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Toolkit;

public class RunDeadPixel {

  private static int width, height;

  public static void main(String[] args) {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    width = (int) Math.round(screenSize.getWidth());
    height = (int) Math.round(screenSize.getHeight());

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
	DeadPixel pixel = new DeadPixel(width, height);
	pixel.setVisible(true);
      }
    });

  }
}
