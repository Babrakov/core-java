package v1ch11swing.p15slider;

import java.awt.*;
import javax.swing.*;

public class SliderTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new SliderFrame();
         frame.setTitle("SliderTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
