package v1ch11swing.p16menu;

import java.awt.*;
import javax.swing.*;

public class MenuTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new MenuFrame();
         frame.setTitle("MenuTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
