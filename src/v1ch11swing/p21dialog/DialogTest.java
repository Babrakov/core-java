package v1ch11swing.p21dialog;

import java.awt.*;
import javax.swing.*;

public class DialogTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new DialogFrame();
         frame.setTitle("DialogTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
