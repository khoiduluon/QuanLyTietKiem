/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietkiemcanhan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author 0ldbl
 */
public class DangKy extends javax.swing.JFrame {
    String username="sa";
    String password="";
    String url="jdbc:sqlserver://localhost:1433;databaseName=QLTK;integratedSecurity=true";
    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        txtConfirm.setBackground(new Color(0, 0, 0, 0));
        txtEmail.setBackground(new Color(0, 0, 0, 0));
        txtFullName.setBackground(new Color(0, 0, 0, 0));
        txtPassWord.setBackground(new Color(0, 0, 0, 0));
        txtPhone.setBackground(new Color(0, 0, 0, 0));
        txtUserName.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblDangKy = new javax.swing.JLabel();
        lblCancel = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        txtFullName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtPhone = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        rdoMale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel7.setText("FullName:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        lblDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Artboard – 3.png"))); // NOI18N
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangKyMouseClicked(evt);
            }
        });
        jPanel1.add(lblDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Artboard – 5.png"))); // NOI18N
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        jPanel1.add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        txtPassWord.setBorder(null);
        txtPassWord.setOpaque(false);
        jPanel1.add(txtPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 240, 30));

        txtFullName.setBorder(null);
        txtFullName.setOpaque(false);
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 240, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 240, 10));

        txtPhone.setBorder(null);
        txtPhone.setOpaque(false);
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 240, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 240, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 240, 10));

        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 240, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel4.setText("UserName:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 10));

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");
        jPanel1.add(rdoFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel5.setText("PassWord:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 240, 10));

        buttonGroup1.add(rdoMale);
        rdoMale.setText("Male");
        jPanel1.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel6.setText("Confirm PassWord:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        txtUserName.setBorder(null);
        txtUserName.setOpaque(false);
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 240, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel9.setText("Phone Number:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Đăng ký");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 40));

        txtConfirm.setBorder(null);
        jPanel1.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 212, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Artboard – 2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 460, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseClicked
        // TODO add your handling code here:
        if(KT()==true){
            Filldatabase();
        }
    }//GEN-LAST:event_lblDangKyMouseClicked

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblCancelMouseClicked

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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
    boolean  KT(){
        if(txtUserName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Username không được để trống!");
            txtUserName.requestFocus();
            return false; 
        }
        if(txtPassWord.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Password không được để trống!");
            txtPassWord.requestFocus();
            return false; 
        }
        if(txtConfirm.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Confim Password không được để trống!");
            txtConfirm.requestFocus();
            return false; 
        }
        if(txtFullName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Fullname không được để trống!");
            txtFullName.requestFocus();
            return false; 
        }
        if(rdoFemale.isSelected()){
        }else{
            if(rdoMale.isSelected()){
            }else{
                JOptionPane.showMessageDialog(this,"Bạn chưa chọn giới tính!");
                return false;
            }
        }
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Email không được để trống!");
            txtEmail.requestFocus();
            return false; 
        }
        if(txtPhone.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Phone number không được để trống!");
            txtPhone.requestFocus();
            return false; 
        }
        if(txtConfirm.getText().equals(txtPassWord.getText())){
        }else{
            JOptionPane.showMessageDialog(this,"Confim Password không khớp vs Password!");
            txtConfirm.requestFocus();
            return false;
        }
        return true;
    }
    void Filldatabase(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con =DriverManager.getConnection(url,username,password);
            String sql="insert into thongtinnguoidung values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,txtUserName.getText());
            st.setString(2,txtPassWord.getText());
            st.setString(3,txtFullName.getText());
            String gt;
            if(rdoMale.isSelected()){
                gt="0";
            }else{
                gt="1";
            }
            st.setString(4,gt.toString());
            st.setString(5,txtEmail.getText());
            st.setString(6,txtPhone.getText());
            st.execute();
            con.close();
            st.close();
            JOptionPane.showMessageDialog(this,"Đăng kí thành công!");
            New();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    void New(){
        txtUserName.setText("");
        txtPassWord.setText("");
        txtConfirm.setText("");
        txtFullName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        buttonGroup1.clearSelection();
        txtUserName.requestFocus();
    }
}
