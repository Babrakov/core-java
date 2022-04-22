package v1ch11swing.p24dataExchange;

import java.awt.*;
import javax.swing.*;

public class DataExchangeTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new DataExchangeFrame();
         frame.setTitle("DataExchangeTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
