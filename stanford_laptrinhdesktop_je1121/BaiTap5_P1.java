/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stanford_laptrinhdesktop_je1121;

import javax.swing.JOptionPane;

/**
 *
 * @author MrT
 */
public class BaiTap5_P1 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTap5_P1
     */
    public BaiTap5_P1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        cboKieu = new javax.swing.JComboBox<>();
        txtKetQua = new javax.swing.JTextField();
        btnXem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sử dụng vòng lặp while"));

        jLabel1.setText("Giá trị");

        jLabel2.setText("Kiểu");

        jLabel3.setText("Kết quả");

        cboKieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chẵn", "Lẻ" }));
        cboKieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKieuActionPerformed(evt);
            }
        });

        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaTri)
                    .addComponent(cboKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        // TODO add your handling code here:
        
        //khai báo biến
        
        //cách 1
//        String GiaTri = "", strKieu = "", strKetQua = "";
//
//        int giaTri1 = 0, i = 0, j = 1;       
//        GiaTri = txtGiaTri.getText();
//        strKieu = "" + cboKieu.getSelectedItem();
//        giaTri1 = Integer.parseInt(GiaTri);
//
//        if (strKieu.equals("Chẵn")) {
//            do {
//                strKetQua += i + "-";
//                i += 2;
//            } while (i <= giaTri1);
//
//        }
//        if (strKieu.equals("Lẻ")) {
//            while (j <= giaTri1) {
//                strKetQua += j + "-";
//                j += 2;
//            }
//        }
//        strKetQua = strKetQua.substring(0, strKetQua.length() -1);
        
        //cách 2
        //Khai báo biến
        String strGiaTri = "", strKieu = "", strKetQua = "";
        int giaTri = 0;
        //Lấy thông tin từ trên giao diện
        strGiaTri = txtGiaTri.getText();
        strKieu = "" + cboKieu.getSelectedItem();
        //Chuyển về dạng số
        try {
            giaTri = Integer.parseInt(strGiaTri);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập giá trị là kiểu số nguyên");
            txtGiaTri.requestFocus();
            System.err.println("Có lỗi trong quá trình chuyển đổi sang kiểu số. Chi tiết: " + e.getMessage());
             return;
        }
        //Sử dụng vòng lặp while
        int i = 0;
        while(i <= giaTri)
        {
            if(strKieu.equals("Chẵn"))
            {
                if(i%2 == 0)
                {
                    strKetQua += i + "-";
                }
            }
            else
            {
                if(strKieu.equals("Lẻ"))
                {
                    if(i%2 != 0)
                    {
                        strKetQua += i + "-";
                    }
                }
            }
            i++;
        }
        //Cắt hay loại bỏ kí tự cuối chuỗi
        strKetQua = strKetQua.substring(0, strKetQua.length()-1);
        //Hiển thị kết quả
        txtKetQua.setText(strKetQua);
            
       
        
                
        
    }//GEN-LAST:event_btnXemActionPerformed

    private void cboKieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKieuActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTap5_P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap5_P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap5_P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap5_P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap5_P1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXem;
    private javax.swing.JComboBox<String> cboKieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtKetQua;
    // End of variables declaration//GEN-END:variables
}
