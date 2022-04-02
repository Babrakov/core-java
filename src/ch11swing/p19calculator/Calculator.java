package ch11swing.p19calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new CalculatorFrame();
         frame.setTitle("Calculator");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
