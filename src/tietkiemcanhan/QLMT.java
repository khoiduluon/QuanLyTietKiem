/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietkiemcanhan;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0ldbl
 */
public class QLMT extends javax.swing.JFrame {
    int index=0;
    String username="sa";
    String password="";
    String url="jdbc:sqlserver://localhost:1433;databaseName=QLTK;integratedSecurity=true";
    /**
     * Creates new form QLMT
     */
    CardLayout cardLayout;
    public QLMT() {
        initComponents();
        this.setLocationRelativeTo(null);
        cardLayout = (CardLayout) Cards.getLayout();
        DataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Fix = new javax.swing.JMenuItem();
        Del = new javax.swing.JMenuItem();
        Pause = new javax.swing.JMenuItem();
        Cancel = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblMain = new javax.swing.JLabel();
        lblLichSu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cards = new javax.swing.JPanel();
        Card1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        lblGiaTri = new javax.swing.JLabel();
        lblTenMucTieu = new javax.swing.JLabel();
        lblTienDaTK = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblThemMT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTienTk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTietKiem = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        txtTimKiem = new javax.swing.JTextField();
        lblTienDo = new javax.swing.JLabel();
        lblTktheongay = new javax.swing.JLabel();
        lblTimKiem = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Card2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        Fix.setText("Sửa");
        jPopupMenu1.add(Fix);

        Del.setText("Delete");
        jPopupMenu1.add(Del);

        Pause.setText("Pause");
        jPopupMenu1.add(Pause);

        Cancel.setText("Cancel");
        jPopupMenu1.add(Cancel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, -1));

        lblMain.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMain.setText("Main");
        lblMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMouseClicked(evt);
            }
        });
        getContentPane().add(lblMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        lblLichSu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLichSu.setText("Lịch Sử");
        lblLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLichSuMouseClicked(evt);
            }
        });
        getContentPane().add(lblLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Left.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 640));

        Cards.setLayout(new java.awt.CardLayout());

        Card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên mục tiêu", "Giá trị", "Thời hạn", "Số tiền đã tiết kiệm được", "Số tiền phải tiêt kiệm hằng ngày"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblList);

        Card1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 750, 240));

        lblGiaTri.setText("5 tỏi");
        Card1.add(lblGiaTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        lblTenMucTieu.setText("Penhouse trên đà lạt");
        Card1.add(lblTenMucTieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 30));

        lblTienDaTK.setText("dm, chưa được đồng nào");
        Card1.add(lblTienDaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF1.png"))); // NOI18N
        Card1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF3.png"))); // NOI18N
        Card1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF2.png"))); // NOI18N
        Card1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 210, 100));

        lblThemMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/createMT.png"))); // NOI18N
        lblThemMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThemMTMouseClicked(evt);
            }
        });
        Card1.add(lblThemMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 140, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tiết kiệm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Số tiền muốn tiết kiệm:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tiết kiệm vào mục...(gettable, set label)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Chọn ngày:");

        btnTietKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTietKiem.setText("Tiết kiệm lào");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtTienTk)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnTietKiem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTienTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTietKiem)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Card1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 250, 260));
        Card1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 130, -1));

        lblTienDo.setText("99%");
        Card1.add(lblTienDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        lblTktheongay.setText("2000");
        Card1.add(lblTktheongay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/find_and_replace_32px.png"))); // NOI18N
        Card1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF4.png"))); // NOI18N
        Card1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF5.png"))); // NOI18N
        Card1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF6.png"))); // NOI18N
        Card1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        Cards.add(Card1, "card3");

        jLabel3.setText("Helo");

        javax.swing.GroupLayout Card2Layout = new javax.swing.GroupLayout(Card2);
        Card2.setLayout(Card2Layout);
        Card2Layout.setHorizontalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel3)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        Card2Layout.setVerticalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel3)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        Cards.add(Card2, "card2");

        getContentPane().add(Cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 770, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMouseClicked
       cardLayout.show(Cards, "card1");
    }//GEN-LAST:event_lblMainMouseClicked

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {                                     
        index=tblList.getSelectedRow();
    }
    
    private void lblLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLichSuMouseClicked
        cardLayout.show(Cards, "card2");
    }//GEN-LAST:event_lblLichSuMouseClicked

    private void lblThemMTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMTMouseClicked
        ThemMucTieu tmt = new ThemMucTieu();
        tmt.setVisible(true);
    }//GEN-LAST:event_lblThemMTMouseClicked

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
            java.util.logging.Logger.getLogger(QLMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLMT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cancel;
    private javax.swing.JPanel Card1;
    private javax.swing.JPanel Card2;
    private javax.swing.JPanel Cards;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JMenuItem Del;
    private javax.swing.JMenuItem Fix;
    private javax.swing.JMenuItem Pause;
    private javax.swing.JButton btnTietKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblGiaTri;
    private javax.swing.JLabel lblLichSu;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblTenMucTieu;
    private javax.swing.JLabel lblThemMT;
    private javax.swing.JLabel lblTienDaTK;
    private javax.swing.JLabel lblTienDo;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTktheongay;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtTienTk;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

void DataToTable(){
        try {
            DefaultTableModel bang= (DefaultTableModel) tblList.getModel();
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTK;integratedSecurity=true","","");
            Statement st = con.createStatement();
            String sql = "select * from muctieutietkiem";//con đĩ ngân
            ResultSet rs = st.executeQuery(sql);
            bang.setRowCount(0);
            if(rs.isBeforeFirst()==false){
                JOptionPane.showMessageDialog(this,"Chưa có mt");
            }
            while (rs.next()) {
                Vector vt= new Vector();
                vt.add(rs.getString("tenmuctieu"));
                vt.add(rs.getString("giatri"));
                vt.add(rs.getString("thoihan"));
                bang.addRow(vt);
            }
            tblList.setModel(bang);
            con.close();
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
}
void xoaMT(){
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "delete from muctieutietkiem where idMT = ?";
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1,"");
            st.execute();
            tblList.remove(index);
            JOptionPane.showMessageDialog(this,"Delete thành công");
            con.close();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
}
}
