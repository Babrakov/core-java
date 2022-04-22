package v1ch11swing.p18gridbag;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class GridBagLayoutTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->           {
               var frame = new FontFrame();
               frame.setTitle("GridBagLayoutTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
         });
   }
}
