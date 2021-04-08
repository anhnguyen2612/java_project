package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MYPCDESU
 */
public class JFLogIn extends javax.swing.JFrame {

    /**
     * Creates new form JFLogIn
     */
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    public JFLogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
			conn = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
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

        jPanel3 = new javax.swing.JPanel();
        btnEnter = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout2.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout2);

        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnter.setText("Xác nhận");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel3.add(btnEnter);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Đăng Nhập");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        label1.setText("Tên: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(label1, gridBagConstraints);

        label2.setText("Mật khẩu: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(label2, gridBagConstraints);

        txtUsername.setColumns(20);
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtUsername, gridBagConstraints);

        txtPassword.setColumns(20);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtPassword, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String sqlsv = "SELECT * FROM `sinhvien` WHERE hoten=? AND idsv=? ";
				try {
					stmt = conn.prepareStatement(sqlsv);
					if (txtUsername.getText().toString().length() == 0) {
						JOptionPane.showMessageDialog(null, "Username không được để trống !");
					} else if (txtPassword.getText().toString().length() == 0) {
						JOptionPane.showMessageDialog(null, "Password không được để trống !");
					} else {
						stmt.setString(1, txtUsername.getText());
						stmt.setString(2, txtPassword.getText());
						rs = stmt.executeQuery();
						if (rs.next()) {
							String a = txtUsername.getText(), b = rs.getString("hoten");
							if (a.equals(b)) {
                                                            Login login = new Login(rs.getString("hoten"), rs.getString("idsv"), "Xin chào giáo viên");
                                                            JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                                                            JFMainForm window = new JFMainForm(login);
                                                            //window.frmMarkManagerSystem.setVisible(true);
                                                            //window.tabbedPane.remove(window.quan_ly); //Xoa tab ql
                                                            this.dispose();
							}else{
								JOptionPane.showMessageDialog(null, "Username gần đúng !");
							}
						} else {
							giaovien();
						}
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Lỗi đăng nhập \n" + e2);
				}
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogIn().setVisible(true);
            }
        });
    }
    
    public void giaovien() {
		String sqlgv = "SELECT * FROM `giaovien` WHERE user=? AND pass=?";
		try {
			stmt = conn.prepareStatement(sqlgv);
			stmt.setString(1, txtUsername.getText());
			stmt.setString(2, txtPassword.getText());
			rs = stmt.executeQuery();
			if (rs.next()) {
				String a = txtUsername.getText(), b = rs.getString("hoten");
				if (a.equals(b)) {
					Login login = new Login(rs.getString("hoten"), rs.getString("idgv"), "Xin chào giáo viên ");
					JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
					JFMainForm window = new JFMainForm();
					this.dispose();
					window.setVisible(true);
//					window.btnqlgiaovien.setEnabled(false); // Tat ql gv
//					window.btnqllop.setEnabled(false); // Tat quan ly lop
//					window.btnqlkhoa.setEnabled(false); // Tat quan ly khoa
//					window.btnqlmon.setEnabled(false); // Tat quan ly mon
				} else {
					JOptionPane.showMessageDialog(null, "Username giáo viên gần đúng !");
				}
			} else {
				giaovu();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi đăng nhập \n"+e.toString());
		}

	}

	public void giaovu() {
		String sqlad = "SELECT * FROM `giaovu` WHERE user=? AND pass=?";
		try {
			stmt = conn.prepareStatement(sqlad);
			stmt.setString(1, txtUsername.getText());
			stmt.setString(2, txtPassword.getText());
			rs = stmt.executeQuery();
			if (rs.next()) {
				String a = txtUsername.getText(), b = rs.getString("user");
				if (a.equals(b)) {
				Login login = new Login(rs.getString("user"), rs.getString("idgvu"), "Xin chào Giáo Vụ");
				JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
				JFMainForm window = new JFMainForm();
				this.dispose();
//				window.frmMarkManagerSystem.setVisible(true);
//				window.btnqldiem.setEnabled(false);
				}else{
					JOptionPane.showMessageDialog(null, "Username giáo vụ gần đúng !");
				}
			} else {
				admin();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi đăng nhập\n"+e.toString());
		}
	}

	public void admin() {
		String sqlad = "SELECT * FROM `admin` WHERE user=? AND pass=?";
		try {
			stmt = conn.prepareStatement(sqlad);
			stmt.setString(1, txtUsername.getText());
			stmt.setString(2, txtPassword.getText());
			rs = stmt.executeQuery();
			if (rs.next()) {
				String a = txtUsername.getText(), b = rs.getString("user");
				if (a.equals(b)) {
				Login login = new Login(rs.getString("user"), "", "");
				JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
				AdminForm window = new AdminForm(login);
                                window.setVisible(true);
				this.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Username admin gần đúng !");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Đăng nhập không thành công!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi đăng nhập\n"+e.toString());
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
