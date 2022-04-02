package swing.s07action;

import java.awt.*;
import javax.swing.*;

public class ActionTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new ActionFrame();
         frame.setTitle("ActionTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
