package swing.s14comboBox;

import java.awt.*;
import javax.swing.*;

public class ComboBoxTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new ComboBoxFrame();
         frame.setTitle("ComboBoxTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
      });
   }
}
