import javax.swing.*;  
import java.awt.event.*;

public class BudgetMain 
{  
 public static void main(String[] args) {  
 JFrame f=new JFrame("Wallet Eagle-The Budget Tracker");    //creating instance of JFrame 
 
 JLabel l1,l2;
 l1=new JLabel("Already have an account? Login.");
 l1.setBounds(100,40,200,50);
 l2=new JLabel("New to Wallet Eagle..? Create Account.");
 l2.setBounds(100,120,250,100); 
 

 //Button for login
          
 JButton b1=new JButton(new ImageIcon("D:\\login.jpg")); //creating instance of JButton  
 b1.setSize(100,100);
 b1.setBounds(120,90,150,50);//x axis, y axis, width, height  
 b1.addActionListener(new ActionListener(){
 
 public void actionPerformed(ActionEvent e){
  new NewLogin();
  f.dispose();
 }
 });

 //Button for register

 JButton b2=new JButton(new ImageIcon("D:\\register.jpg"));
 b2.setSize(150,150);
 b2.setBounds(120,185,150,50);
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e1){
 new RegisterClass();
 f.dispose();
 }
 });
 
          
 f.add(b1);
 f.add(b2);//adding button in JFrame 
 f.add(l1);  
 f.add(l2);        
 f.setSize(400,325);//400 width and 350 height  
 f.setLayout(null);//using no layout managers  
 f.setVisible(true);//making the frame visible 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
}  
}  