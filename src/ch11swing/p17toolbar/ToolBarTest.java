package ch11swing.p17toolbar;

import java.awt.*;
import javax.swing.*;

public class ToolBarTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new ToolBarFrame();
         frame.setTitle("ToolBarTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
