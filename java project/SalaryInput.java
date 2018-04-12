import javax.swing.*;
import java.awt.event.*;

class SalaryInput
{
 
 SalaryInput()
 {
  JFrame f=new JFrame("SALARY INPUT");
  JLabel l1;
  l1=new JLabel("Enter your Monthly Salary");
  l1.setBounds(50,40,200,50);
  JTextField tf1;
  tf1=new JTextField();
  tf1.setBounds(60,100,80,40);
  
  
//definig button and its action...
   
  JButton b=new JButton("DONE");
  b.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e1){
  f.dispose();
  }
  });
  
  
  
  b.setBounds(80,160,100,40);
  
  f.add(l1);
  f.add(tf1);
  f.add(b);
  f.setSize(250,250);
  f.setLayout(null);
  f.setVisible(true);
  }

 
}
