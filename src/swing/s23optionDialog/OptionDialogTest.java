package swing.s23optionDialog;

import java.awt.*;
import javax.swing.*;

public class OptionDialogTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new OptionDialogFrame();
         frame.setTitle("OptionDialogTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
