package swing.s11checkBox;

import java.awt.*;
import javax.swing.*;

public class CheckBoxTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new CheckBoxFrame();
         frame.setTitle("CheckBoxTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // set JFrame in center of the screen
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
      });
   }
}
