/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author MYPCDESU
 */
public class JFMainForm extends javax.swing.JFrame {

    /**
     * Creates new form JFAdminForm
     */
    public JFMainForm() {
        initComponents();
        this.setTitle("Application main form");
        this.setSize(1280, 720);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        managePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pointListPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Myriad Pro", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1280, 720));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homePanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        homePanel.setVerifyInputWhenFocusTarget(false);
        homePanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 55)); // NOI18N
        jLabel3.setText("Trang chủ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("User name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("dsadawd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("User name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        homePanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng nhập lại");
        jButton1.setToolTipText("thoát ra trang đăng nhập");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thoát");
        jButton2.setToolTipText("thoát khỏi chương trình");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        homePanel.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Trang chủ", homePanel);

        managePanel.setBackground(new java.awt.Color(255, 255, 255));
        managePanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managePanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        managePanel.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel5.setText("Quanly");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 104, 0, 0);
        managePanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel6.setText("quan ly");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 208, 173, 224);
        managePanel.add(jLabel6, gridBagConstraints);

        jTabbedPane1.addTab("Quản lý", managePanel);

        pointListPanel.setBackground(new java.awt.Color(255, 255, 255));
        pointListPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pointListPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        pointListPanel.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel7.setText("xem diem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 104, 0, 0);
        pointListPanel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel8.setText("xem diem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 99, 173, 224);
        pointListPanel.add(jLabel8, gridBagConstraints);

        jTabbedPane1.addTab("Xem điểm", pointListPanel);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        searchPanel.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel9.setText("tim kiem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 104, 0, 0);
        searchPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel10.setText("search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 193, 173, 224);
        searchPanel.add(jLabel10, gridBagConstraints);

        jTabbedPane1.addTab("Tìm kiếm", searchPanel);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new JFLogIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel managePanel;
    private javax.swing.JPanel pointListPanel;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}
