import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;
  
class Login {  
  
 Login()
{
 JFrame f=new JFrame("LOGIN");
 JLabel l1,l2;
 JTextField tf1;
 JPasswordField pf=new JPasswordField();

 l1=new JLabel("Enter Username");
 l1.setBounds(50,40,100,40);
 tf1=new JTextField();
 tf1.setBounds(50,80,150,30);
 l2=new JLabel("Enter Password");
 l2.setBounds(50,120,100,40);
 pf.setBounds(50,160,150,30);
 
 JButton b=new JButton("CONTINUE");
 
 b.setBounds(60,220,150,35);
 b.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e1){
 if(tf1.getText().equals(""))
 {
 JOptionPane.showMessageDialog(f,"Email id can't  be blank!!.","Alert",JOptionPane.WARNING_MESSAGE);
 //Login();       
 }
 
 if(pf.getPassword().length==0)
 {
 JOptionPane.showMessageDialog (f,"Please enter your  password!!.","Alert",JOptionPane.WARNING_MESSAGE);  
//Login();     
 }
 if((!tf1.getText().equals(""))&&(pf.getPassword().length!=0))
 {new AfterRegister();
 f.dispose();}
 }
 });

 f.add(l1);
 f.add(l2);
 f.add(tf1);
 f.add(pf);
 f.add(b);
 
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }     
   }  