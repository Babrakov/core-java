package ch11swing.p08mouse;

import javax.swing.*;

public class MouseFrame extends JFrame
{
   public MouseFrame()
   {
      add(new MouseComponent());
      pack();
   }
}
