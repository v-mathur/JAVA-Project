import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AfterLogin
{
 JFrame f;
  
 
 AfterLogin()
 {
  f=new JFrame("WALLET EAGLE");
 
  JButton b1=new JButton(new ImageIcon("D:\\INCOME.png"));
  JButton b2=new JButton(new ImageIcon("D:\\budget.jpg"));
  JButton b3=new JButton(new ImageIcon("D:\\expenses21.jpg"));
  JButton b4=new JButton(new ImageIcon("D:\\summary.jpg"));
 
  b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e1){
  new Income();
  f.dispose();
  }
  });

  b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e2){
  new Budget();
  f.dispose();
  }
  });

  b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e3){
  new Expense();
  f.dispose();
  }
  });

  b4.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e4){
  new Summary();
  f.dispose();
  }
  });

  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  
  f.setLayout(new GridLayout(2,2,1,1));
  f.setSize(400,400);
  f.setVisible(true);
  
 }
 
  
  
 }