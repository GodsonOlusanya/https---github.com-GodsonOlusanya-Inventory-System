/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;


///This class is to design the gui of the Application
//extends db makes make gui a subclass (so we can access all the instances variable
//from from class ab ie ResultSet(rs))
public final class gui extends ab {
    
      
    //Declaration of Frames, Label and Textfield
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try{ String sql = "INSERT INTO TABLE1 (Fname, Lname, Book) values (?, ?, ?)"; 
                            
              pst = con.prepareStatement(sql);
      
                          
              pst.setString(1,t.getText());
              pst.setString(2,t1.getText());
              pst.setString(3,t2.getText());
                    
              pst.execute();
           
                   JOptionPane.showMessageDialog(null, "Saved");
        }catch(Exception b){
            
        }
    } 
    
    JFrame f;
    JLabel fname;
    JLabel lname;
    JLabel book;
    JTextField t;
    JTextField t1;
    JTextField t2;
    //JButton btnBack;
    JButton btnSave ;
    
    
    
    //constructor of the class gui
    public gui (){
        frame();
        initComponents();
    //Initialization of GUI Frame, Labels and Textfield    
    }
    
    public void frame(){
        f = new JFrame();
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fname = new JLabel("First Name");
        lname = new JLabel("Last Name");
        book = new JLabel("Book");
        //btnBack = new JButton("BACK");
        btnSave = new JButton("SUBMIT");
        t = new JTextField(10);
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
        
        ///Adding Label and TextField on Frame
        //Adding all textfield and labels onto panel
        JPanel p = new JPanel();
        p.add(fname);
        p.add(t);
        p.add(lname);
        p.add(t1);
        p.add(book);
        p.add(t2);
       // p.add(btnBack);
        p.add(btnSave);

        //Adding panel onto frame
        f.add(p);
        
  
        
        
       //Display record from Dbase
       
       try {
           //the pointer to the first field in the Dbase
           rs.next();
           //connects to a particular field in dbase 
           //string name should be the same as in the Dbase
           // u can also use
           //String namef  = rs.getString("Fname");
           //t.setText(namef);
           
           
           t.setText(rs.getString("Fname"));
           t1.setText(rs.getString("Lname"));
           t2.setText(rs.getString("Book"));
           //btnSave.setActionCommand(rs.getString"Insert into Table1(Fname,Lname,Age)");
           btnSave.setText("Main Save");
           
           
       }catch(Exception ex){
           System.out.println("ERROR SQL");
       }

                    

            
      
    }
    public void initComponents(){
      btnSave.addActionListener(new java.awt.event.ActionListener() {
    
    public void actionPerformed(java.awt.event.ActionEvent evt) {
           btnSaveActionPerformed(evt);
    }
});  
    }
}
