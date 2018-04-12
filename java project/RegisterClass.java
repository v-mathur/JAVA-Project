import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
  
public class RegisterClass  {  
  
 RegisterClass()
{
 JFrame f=new JFrame("REGISTRATION");
 JLabel name,id,gender,password;
 
 JRadioButton m;
 JRadioButton fe;
 
 JTextField tf1,tf2;
 JPasswordField pf=new JPasswordField();
 
 JButton register=new JButton("REGISTER");
 register.setBounds(150,390,150,40);
 
 name=new JLabel("Enter Name");
 name.setFont(new Font("Times New Roman", Font.BOLD,14));
 name.setBounds(80,40,100,40);

 tf1=new JTextField();
 tf1.setBounds(80,80,200,35);

 id=new JLabel("Enter Email ID");
 id.setFont(new Font("Times New Roman", Font.BOLD,14));
 id.setBounds(80,120,100,40);

 tf2=new JTextField();
 tf2.setBounds(80,160,200,35);

 gender=new JLabel("Select you gender");
 gender.setFont(new Font("Times New Roman", Font.BOLD,14));
 gender.setBounds(80,200,200,35);

 m = new JRadioButton("MALE"); //MALE RADIOBUTTON
 m.setOpaque(false);
 m.setMnemonic('m');
 m.setFont(new Font("Times New Roman", Font.ITALIC, 13));
 m.setForeground(Color.BLACK);
 m.setBounds(85, 240, 63, 23);
 
		
 fe = new JRadioButton("FEMALE");
 fe.setOpaque(false);
 fe.setMnemonic('f');
 fe.setFont(new Font("Times New Roman", Font.ITALIC, 12));
 fe.setBounds(85, 280, 109, 23);
 
 
 password=new JLabel("Create password for your account");
 password.setFont(new Font("Times New Roman",Font.BOLD,14));
 password.setBounds(80,290,250,30);
 pf.setBounds(80,330,200,35);

 register.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e1){
  
 if(tf1.getText().equals(""))
 {
 JOptionPane.showMessageDialog(f,"Please enter  your   name!!.","Alert",JOptionPane.WARNING_MESSAGE);
        
 }
 
 if(tf2.getText().equals(""))
 {
 JOptionPane.showMessageDialog(f,"Please enter a valid email-   id!!.","Alert",JOptionPane.WARNING_MESSAGE);
        
 }
 
 if(pf.getPassword().length==0)
 {
 JOptionPane.showMessageDialog (f,"Please enter your   password!!.","Alert",JOptionPane.WARNING_MESSAGE);  
     
 }
 
 if((!tf1.getText().equals(""))&&(!tf2.getText().equals(""))&& (pf.getPassword().length!=0))
 {new SalaryInput();
 f.dispose();}
 
}
 });
 

 
 f.add(name);
 f.add(id);
 f.add(password);
 f.add(gender);
 f.add(tf1);
 f.add(tf2);
 f.add(pf);
 f.add(register);
 f.add(m);
 f.add(fe);
 
 f.setSize(450,480);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }     
   }  