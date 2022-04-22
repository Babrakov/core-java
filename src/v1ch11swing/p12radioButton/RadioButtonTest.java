package v1ch11swing.p12radioButton;

import java.awt.*;
import javax.swing.*;

public class RadioButtonTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new RadioButtonFrame();
         frame.setTitle("RadioButtonTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // set JFrame in center of the screen
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
      });
   }
}
