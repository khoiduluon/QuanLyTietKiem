
package tietkiemcanhan;

import java.awt.CardLayout;
import java.awt.Color;
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


public class QLMT extends javax.swing.JFrame {
    int index=0;
    String username="sa";
    String password="";
    String url="jdbc:sqlserver://localhost:1433;databaseName=QLTK;integratedSecurity=true";

    CardLayout cardLayout;
    public QLMT() {
        initComponents();
        this.setLocationRelativeTo(null);
        cardLayout = (CardLayout) Cards.getLayout();
        DataToTable();
    }


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
        jSeparator3 = new javax.swing.JSeparator();
        lblMain = new javax.swing.JLabel();
        lblLichSu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cards = new javax.swing.JPanel();
        Card2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Card3 = new javax.swing.JPanel();
        Card1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        lblTenMucTieu = new javax.swing.JLabel();
        lblTienDaTK = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblThemMT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTienTk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTietKiem = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        lblGiaTri = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lblTienDo = new javax.swing.JLabel();
        lblTktheongay = new javax.swing.JLabel();
        lblTimKiem = new javax.swing.JLabel();
        lblThoihan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 170, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, -1));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Thống Kê");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Left.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 640));

        Cards.setLayout(new java.awt.CardLayout());

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

        javax.swing.GroupLayout Card3Layout = new javax.swing.GroupLayout(Card3);
        Card3.setLayout(Card3Layout);
        Card3Layout.setHorizontalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        Card3Layout.setVerticalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        Cards.add(Card3, "card3");

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

        Card1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 750, 210));

        lblTenMucTieu.setText("Penhouse trên đà lạt");
        Card1.add(lblTenMucTieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 30));

        lblTienDaTK.setText("dm, chưa được đồng nào");
        Card1.add(lblTienDaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF1.png"))); // NOI18N
        Card1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF3.png"))); // NOI18N
        Card1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 120));

        lblThemMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/createMT.png"))); // NOI18N
        lblThemMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThemMTMouseClicked(evt);
            }
        });
        Card1.add(lblThemMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 140, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tiết kiệm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtTienTk))
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTietKiem)
                .addGap(72, 72, 72))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Card1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, 270));

        lblGiaTri.setText("6 tỏi");
        Card1.add(lblGiaTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        Card1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, -1));

        lblTienDo.setText("99%");
        Card1.add(lblTienDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        lblTktheongay.setText("2000");
        Card1.add(lblTktheongay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/find_and_replace_32px.png"))); // NOI18N
        lblTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTimKiemMouseClicked(evt);
            }
        });
        Card1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblThoihan.setText("3 thang");
        Card1.add(lblThoihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF4.png"))); // NOI18N
        Card1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF5.png"))); // NOI18N
        Card1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF6.png"))); // NOI18N
        Card1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 220, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/Del.png"))); // NOI18N
        Card1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF2.png"))); // NOI18N
        Card1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, 120));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tietkiemcanhan/Button/IF7.png"))); // NOI18N
        Card1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 100));

        Cards.add(Card1, "card1");

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        cardLayout.show(Cards, "card3");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void lblTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimKiemMouseClicked
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_lblTimKiemMouseClicked

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
    private javax.swing.JPanel Card3;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblGiaTri;
    private javax.swing.JLabel lblLichSu;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblTenMucTieu;
    private javax.swing.JLabel lblThemMT;
    private javax.swing.JLabel lblThoihan;
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
            ThemMucTieu tmt=new ThemMucTieu();
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
                double sttk=Math.round(Double.parseDouble(rs.getString("giatri"))/tmt.ham());
                Vector vt= new Vector();
                vt.add(rs.getString("tenmuctieu"));
                vt.add(rs.getString("giatri"));
                vt.add(rs.getString("thoihan"));
                vt.add(rs.getString("sotiendatietkiemduoc"));
                vt.add(sttk);
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
void timkiem(){
        try {
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTK;integratedSecurity=true","sa","");
            PreparedStatement st=con.prepareStatement("select tenmuctieu,giatri,thoihan,sotiendatietkiemduoc from muctieutietkiem where tenmuctieu like'%"+txtTimKiem.getText()+"%'");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                lblTenMucTieu.setText(rs.getString("tenmuctieu"));
                lblThoihan.setText(rs.getString("thoihan"));
                lblTienDaTK.setText(rs.getString("sotiendatietkiemduoc"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    
}
}
