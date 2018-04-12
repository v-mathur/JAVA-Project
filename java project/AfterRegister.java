import javax.swing.*;
import java.awt.event.*;

class AfterRegister
{ 
 static String str;
 
 AfterRegister(){
 JFrame f=new JFrame("WALLET EAGLE");
 JLabel l1,l2,l3;
 JTextField tf1,tf2,tf3;
 
 l3=new JLabel("Enter your income");
 l3.setBounds(50,40,200,50);

 tf3=new JTextField();
 tf3.setBounds(60,80,110,40);

 str=tf3.getText();
 
 l1=new JLabel("Enter your budget");
 l1.setBounds(50,120,200,50);
 
 
 tf1=new JTextField();
 tf1.setBounds(60,160,110,40);
 
 l2=new JLabel("Enter your expenses till now");
 l2.setBounds(50,200,200,50);

 tf2=new JTextField();
 tf2.setBounds(60,240,110,40);

 

 //button and its action
 
 JButton b=new JButton("SUBMIT");
 b.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e1){
  //new AfterLogin();
  new ExpenseTable();
  f.dispose();
  }
  });
  b.setBounds(80,290,100,40);

  f.add(b);
  f.add(l1);
  f.add(tf1);
  f.add(l2);
  f.add(tf2);
  f.add(tf3);
  f.add(l3);
  f.setSize(300,450);
  f.setLayout(null);
  f.setVisible(true);
}

public static String getStr()
 {
 return str;}
}