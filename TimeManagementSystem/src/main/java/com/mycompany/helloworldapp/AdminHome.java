/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author Harsh Chandel
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     * @param x
     */
    public AdminHome(String x) {
        id=x;
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
        logOut = new javax.swing.JButton();
        viewStatistics = new javax.swing.JButton();
        enterNewExecutive = new javax.swing.JButton();
        welCome = new javax.swing.JLabel();
        controlAccessRights = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        logOut.setBackground(new java.awt.Color(255, 0, 0));
        logOut.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        viewStatistics.setBackground(new java.awt.Color(153, 153, 255));
        viewStatistics.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        viewStatistics.setText("View Statistics");
        viewStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatisticsActionPerformed(evt);
            }
        });

        enterNewExecutive.setBackground(new java.awt.Color(153, 153, 255));
        enterNewExecutive.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        enterNewExecutive.setText("Enter New Executive");
        enterNewExecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNewExecutiveActionPerformed(evt);
            }
        });

        welCome.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        welCome.setText("Welcome");

        controlAccessRights.setBackground(new java.awt.Color(153, 153, 255));
        controlAccessRights.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        controlAccessRights.setText("Control Access Rights");
        controlAccessRights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlAccessRightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(welCome)
                        .addGap(122, 122, 122)
                        .addComponent(logOut))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(controlAccessRights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterNewExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(welCome)))
                .addGap(30, 30, 30)
                .addComponent(viewStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlAccessRights, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterNewExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatisticsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new viewStatistics(id).setVisible(true);
    }//GEN-LAST:event_viewStatisticsActionPerformed

    private void controlAccessRightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlAccessRightsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new controlAccessRights(id).setVisible(true);
    }//GEN-LAST:event_controlAccessRightsActionPerformed

    private void enterNewExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNewExecutiveActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new enterNewExecutive(id).setVisible(true);
        
    }//GEN-LAST:event_enterNewExecutiveActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new login2().setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    /**
     * @param args the command line arguments
     */

    String id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton controlAccessRights;
    private javax.swing.JButton enterNewExecutive;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton viewStatistics;
    private javax.swing.JLabel welCome;
    // End of variables declaration//GEN-END:variables
}
