import javax.swing.*;
import java.awt.event.*;
class Income
{
 Income()
 {
  JFrame f=new JFrame("Income");
 
 JLabel l=new JLabel("income class");
 l.setBounds(60,110,110,40);
 
  f.add(l);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
}