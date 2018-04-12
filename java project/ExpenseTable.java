import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
   
public class ExpenseTable {    
    JFrame f;    
    JButton adde=new JButton("ADD");
    ExpenseTable(){    
    f=new JFrame();    
    String data[][]={ {"","",""},    
                          {"","",""},    
                          {"","",""}};    
    String column[]={"SNo","Expense Detail","Expense Amount"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);

    adde.setBounds(150,100,100,35);
    adde.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    new AfterLogin();
    f.dispose();
  }
  });
    f.add(adde);
    f.add(sp);          
    f.setSize(400,250);    
    f.setVisible(true);    
}     
}