/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packerandunpacker;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Auodumber Mande
 */
public class LoginFrame extends javax.swing.JFrame implements Runnable {

    static int i = 3;
    public void run()
    {
        while(true)
        {
            if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
            {
                chkcaps.setText("CapsLock is On");
                
                //ystem.out.println("caps on");
            }
            else
             {
               chkcaps.setText(null);
              // System.out.println("Caps OFF");
             }
             /*String str1 = uname.getText();
             String str2 = passwrd.getText();
        
                if(str1=="")
                {
                    if(str2=="")
                    {
                    System.out.println("inside IF");
                    submit.setEnabled(false);
                    }
                }
                else
                {
                    System.out.println("inside else");
                    submit.setEnabled(true);
                }*/
            try
            {
                sleep(100);
            } 
            catch (InterruptedException ex) 
            {
                 System.out.println("Error Occured");
            }
            
        }
    }
     
    public LoginFrame() 
    {
        initComponents();
        showdate();
        showtime();
    }
     public void showdate()
        {
        Date d =new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
        date_label.setText("Date : "+s.format(d));
       
        }
      public void showtime()
        {
        Date d =new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
        time_label.setText("Time : "+s.format(d));
       
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        passwrd = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chkcaps = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Packer and Unpacker");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        password.setText("Password");

        username.setText("Username");

        passwrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwrdMouseClicked(evt);
            }
        });
        passwrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwrdActionPerformed(evt);
            }
        });
        passwrd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwrdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwrdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwrdKeyTyped(evt);
            }
        });

        submit.setText("Submit");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        chkcaps.setForeground(new java.awt.Color(255, 0, 0));
        chkcaps.setText(" ");

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(uname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(passwrd, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chkcaps, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwrd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkcaps, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwrdActionPerformed
        // TODO add your handling code here
         
       
    }//GEN-LAST:event_passwrdActionPerformed

    private void passwrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwrdMouseClicked
        // TODO add your handling code here:
         //Thread th = new Thread(this);
         //th.start();   /* updated in passwrdKeyPressed() */
    }//GEN-LAST:event_passwrdMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String str1 = uname.getText();
        String str2 = new String(passwrd.getPassword());
         
         
        
        if(str1.isEmpty()&& str2.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"please enter details");
        }
        else if(str1.equals("admin") && str2.equals("admin"))
        {
           new Menu().setVisible(true);
           this.dispose();
           
        }
        else
        {
            i--;
            JOptionPane.showMessageDialog(rootPane,"reamins"+i);
            
            if(i==0)
            {
                JOptionPane.showMessageDialog(rootPane,"limit Exceed");
                this.dispose();
            }
            
        }
          
    }//GEN-LAST:event_submitActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        
    }//GEN-LAST:event_unameActionPerformed

    private void passwrdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwrdKeyPressed
        // TODO add your handling code here:
         Thread th = new Thread(this);
         th.start();
  

    }//GEN-LAST:event_passwrdKeyPressed

    private void passwrdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwrdKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_passwrdKeyTyped

    private void passwrdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwrdKeyReleased
        // TODO add your handling code here:
        
              if(passwrd.getText().isEmpty())
              {
                   submit.setEnabled(false);
              }
              else
              {
                   submit.setEnabled(true);
              }
              if(uname.getText().isEmpty())
              {
                  submit.setEnabled(false);
              }
              else
              {
                  submit.setEnabled(true);
              }

    }//GEN-LAST:event_passwrdKeyReleased

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
        // TODO add your handling code here:
        
              if(uname.getText().isEmpty())
              {
                   submit.setEnabled(false);
              }
              else
              {
                  submit.setEnabled(true);
              }
              if(passwrd.getText().isEmpty())
              {
                  submit.setEnabled(false);
              }
              else
              {
                  submit.setEnabled(true);
              }

    }//GEN-LAST:event_unameKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chkcaps;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwrd;
    private javax.swing.JButton submit;
    private javax.swing.JLabel time_label;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
   static DateFormat df,ts;
   Date dateobj = new Date();
}
