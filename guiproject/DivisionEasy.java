/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author DJ FB
 */
public class DivisionEasy extends javax.swing.JFrame {

    private int Random1;
    private int Random2;

    /**
     * Creates new form DivisionEasy
     */
    public DivisionEasy() {
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
        DivNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DivNum1 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        checkBTnDiv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quesbtn.setBackground(new java.awt.Color(21, 14, 86));
        quesbtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        quesbtn.setForeground(new java.awt.Color(205, 17, 59));
        quesbtn.setText("Next Question");
        quesbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 230, 19), 3, true));
        quesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesbtnActionPerformed(evt);
            }
        });

        answerBtn.setBackground(new java.awt.Color(21, 14, 86));
        answerBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        answerBtn.setForeground(new java.awt.Color(205, 17, 59));
        answerBtn.setText("Answer");
        answerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 230, 19), 3, true));
        answerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBtnActionPerformed(evt);
            }
        });

        answerTF.setBackground(new java.awt.Color(21, 14, 86));
        answerTF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        answerTF.setForeground(new java.awt.Color(0, 230, 19));
        answerTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 230, 19), 3, true));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 230, 19));
        jLabel2.setText("Plus");

        DivNum2.setEditable(false);
        DivNum2.setBackground(new java.awt.Color(21, 14, 86));
        DivNum2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DivNum2.setForeground(new java.awt.Color(205, 17, 59));
        DivNum2.setBorder(null);
        DivNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivNum2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 230, 19));
        jLabel1.setText("What is");

        DivNum1.setEditable(false);
        DivNum1.setBackground(new java.awt.Color(21, 14, 86));
        DivNum1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DivNum1.setForeground(new java.awt.Color(205, 17, 59));
        DivNum1.setBorder(null);
        DivNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivNum1ActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(21, 14, 86));
        backBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(205, 17, 59));
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 230, 19), 3, true));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        checkBTnDiv.setEditable(false);
        checkBTnDiv.setBackground(new java.awt.Color(21, 14, 86));
        checkBTnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkBTnDiv.setForeground(new java.awt.Color(255, 5, 9));
        checkBTnDiv.setBorder(null);
        checkBTnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTnDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(quesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DivNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addComponent(DivNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addComponent(checkBTnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(quesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(DivNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DivNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(checkBTnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void quesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesbtnActionPerformed
        Random rand = new Random();
       Random1 = rand.nextInt();
       for(int i=1; i<40; i++){
         if(i%2==1){
           Random1 = rand.nextInt(i);
         }
       }
       
       Random2 = 2;
        DivNum1.setText(Random1+"");
        DivNum2.setText(Random2+"");
        checkBTnDiv.setText(" null ");
    }//GEN-LAST:event_quesbtnActionPerformed

    private void answerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBtnActionPerformed
        String num = answerTF.getText();
        int  answer = Integer.parseInt(num);
        int  ans = Random1 / Random2;
        if(answer==ans){
            checkBTnDiv.setText("Correct");
        }

        else{
            checkBTnDiv.setText("Wrong");
        }
    }//GEN-LAST:event_answerBtnActionPerformed

    private void DivNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DivNum2ActionPerformed

    private void DivNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DivNum1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        QuizOption qO = new QuizOption();
        qO.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void checkBTnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTnDivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBTnDivActionPerformed

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
            java.util.logging.Logger.getLogger(DivisionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DivisionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DivisionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DivisionEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DivisionEasy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DivNum1;
    private javax.swing.JTextField DivNum2;
    private javax.swing.JButton answerBtn;
    private javax.swing.JTextField answerTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField checkBTnDiv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quesbtn;
    // End of variables declaration//GEN-END:variables
}
