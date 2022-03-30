package swing.s20circleLayout;

import java.awt.*;
import javax.swing.*;

public class CircleLayoutTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new CircleLayoutFrame();
         frame.setTitle("CircleLayoutTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
