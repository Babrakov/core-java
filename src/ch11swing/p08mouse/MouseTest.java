package swing.s08mouse;

import java.awt.*;
import javax.swing.*;

public class MouseTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new MouseFrame();
         frame.setTitle("MouseTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
