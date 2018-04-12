import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;
  
class NewLogin extends JFrame {  
  
 NewLogin()
{
 JFrame f=new JFrame("LOGIN");
 JLabel l1,l2;
 JTextField tf1;
 JPasswordField pf=new JPasswordField();
 //Container c=JFrame.getContentPane();
 //c.setBackgroung(Color.red);

 l1=new JLabel("Enter Username");
 l1.setFont(new Font("Times New Roman", Font.BOLD,  16));
 l1.setBounds(125,40,150,40);
 tf1=new JTextField();
 tf1.setBounds(100,80,150,30);
 l2=new JLabel("Enter Password");
 l2.setFont(new Font("Times New Roman", Font.BOLD ,  16));
 l2.setBounds(125,120,150,40);
 pf.setBounds(100,160,150,30);
 
 JButton b1=new JButton("LOGIN");
 JButton b2=new JButton("RESET");
 JButton b3=new JButton("EXIT");
 
 
 b1.setBounds(30,220,100,35);
 b2.setBounds(140,220,100,35);
 b3.setBounds(250,220,100,35);

 //EXIT BUTTON FUNCTION

 b3.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent evt)
 {
 System.exit(0);
 f.dispose();
 }});

 //LOGIN BUTTON FUNCTION

 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e1){
 if(tf1.getText().equals(""))
 {
 JOptionPane.showMessageDialog(f,"Email id can't  be  blank!!.","Alert",JOptionPane.WARNING_MESSAGE);
        
 }
 
 if(pf.getPassword().length==0)
 {
 JOptionPane.showMessageDialog (f,"Please enter your   password!!.","Alert",JOptionPane.WARNING_MESSAGE);  
     
 }
 if((!tf1.getText().equals(""))&&(pf.getPassword().length!=0))
 {new AfterRegister();
 f.dispose();}
 }
 });

 //RESET BUTTON FUNCTION

 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent evt1)
 {
  tf1.setText(null);
  pf.setText(null);
 }});

 f.add(l1);
 f.add(l2);
 f.add(tf1);
 f.add(pf);
 f.add(b1);
 f.add(b2);
 f.add(b3);
 
 f.setSize(400,360);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }     
   }  