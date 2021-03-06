/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author DJ FB
 */
public class SubtractionEasy extends javax.swing.JFrame {

    private int Random1;
    private int Random2;

    /**
     * Creates new form SubtractionEasy
     */
    public SubtractionEasy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quesbtn = new javax.swing.JButton();
        answerBtn = new javax.swing.JButton();
        answerTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subNum1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        subNum2 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        checkBTn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 14, 86));

        quesbtn.setBackground(new java.awt.Color(21, 14, 86));
        quesbtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        quesbtn.setForeground(new java.awt.Color(40, 255, 191));
        quesbtn.setText("Next Question");
        quesbtn.setBorder(null);
        quesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesbtnActionPerformed(evt);
            }
        });

        answerBtn.setBackground(new java.awt.Color(21, 14, 86));
        answerBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        answerBtn.setForeground(new java.awt.Color(40, 255, 191));
        answerBtn.setText("Answer");
        answerBtn.setBorder(null);
        answerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBtnActionPerformed(evt);
            }
        });

        answerTF.setBackground(new java.awt.Color(21, 14, 86));
        answerTF.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        answerTF.setForeground(new java.awt.Color(255, 255, 255));
        answerTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 255, 191), 3));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 255, 191));
        jLabel2.setText("Minus");

        subNum1.setEditable(false);
        subNum1.setBackground(new java.awt.Color(21, 14, 86));
        subNum1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        subNum1.setForeground(new java.awt.Color(255, 255, 255));
        subNum1.setBorder(null);
        subNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subNum1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 255, 191));
        jLabel1.setText("What is");

        subNum2.setEditable(false);
        subNum2.setBackground(new java.awt.Color(21, 14, 86));
        subNum2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        subNum2.setForeground(new java.awt.Color(255, 255, 255));
        subNum2.setBorder(null);
        subNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subNum2ActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(21, 14, 86));
        backBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(40, 255, 191));
        backBtn.setText("Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        checkBTn.setEditable(false);
        checkBTn.setBackground(new java.awt.Color(21, 14, 86));
        checkBTn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkBTn.setForeground(new java.awt.Color(255, 5, 9));
        checkBTn.setBorder(null);
        checkBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(quesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(subNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(subNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(checkBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(subNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(checkBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesbtnActionPerformed
        SecureRandom rand = new SecureRandom();
        Random1 = 10 + rand.nextInt(20);
        Random2 = 1 + rand.nextInt(10);
        subNum2.setText(Random1+"");
        subNum1.setText(Random2+"");
        checkBTn.setBackground(Color.BLUE);
    }//GEN-LAST:event_quesbtnActionPerformed

    private void answerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBtnActionPerformed
        String num = answerTF.getText();
          if (num.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a number", "FeedBackMessage", JOptionPane.WARNING_MESSAGE);
            return;
            
        }
          
        if (!num.matches("\\d+")) {
             JOptionPane.showMessageDialog(this,"Please input number", "FeedBackMessage", JOptionPane.WARNING_MESSAGE);
             return;
            
        }
        int  answer = Integer.parseInt(num);
        int  ans = Random1 - Random2;
      
        if(answer==ans){
            checkBTn.setBackground(Color.GREEN);
        }

        else{
            checkBTn.setBackground(Color.red);
        }
    }//GEN-LAST:event_answerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        QuizOption qO = new QuizOption();
        qO.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void subNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subNum2ActionPerformed

    private void subNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subNum1ActionPerformed

    private void checkBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBTnActionPerformed

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
            java.util.logging.Logger.getLogger(SubtractionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubtractionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubtractionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubtractionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubtractionEasy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerBtn;
    private javax.swing.JTextField answerTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField checkBTn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quesbtn;
    private javax.swing.JTextField subNum1;
    private javax.swing.JTextField subNum2;
    // End of variables declaration//GEN-END:variables
}
