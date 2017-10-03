// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FixedDebugFifteen2 extends JFrame
{
   JButton nb = new JButton("Left    ");
   JButton sb = new JButton("Down  ");
   JButton eb = new JButton("Right ");
   JButton wb = new JButton("Center  ");
   JButton cb = new JButton("Up");
   Container con = null;

   public FixedDebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout())
      con.add(nb);
      con.add(sb);
      con.add(eb);
      con.add(wb);
      con.add(cb);
   }
   public static void main(String[] args)
   {
      FixedDebugFifteen2 f = new FixedDebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}