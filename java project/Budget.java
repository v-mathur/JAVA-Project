import javax.swing.*;
import java.awt.event.*;

class Budget
{
 Budget()
 {
 JFrame f=new JFrame("Budget");
 JLabel l=new JLabel("budget class");
 l.setBounds(60,110,110,40);
 f.add(l);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 
 }
}