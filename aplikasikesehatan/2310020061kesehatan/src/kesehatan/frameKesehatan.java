/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kesehatan;

import kesehatan.*;

public class frameKesehatan extends javax.swing.JFrame {

    public frameKesehatan() {
    initComponents();
    this.setLocationRelativeTo(null); 
    this.setTitle("Menu Utama Aplikasi Kesehatan");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenuUtama = new javax.swing.JLabel();
        btnPoliklinik = new javax.swing.JButton();
        btnInputUser = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        btnPasien = new javax.swing.JButton();
        btnKunjungan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        btnMenuUtama.setText("MENU UTAMA");
        getContentPane().add(btnMenuUtama);

        btnPoliklinik.setText("Poliklinik");
        btnPoliklinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliklinikActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoliklinik);

        btnInputUser.setText("Input User");
        btnInputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnInputUser);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);

        btnDokter.setText("Dokter");
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnDokter);

        btnPasien.setText("Pasien");
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnPasien);

        btnKunjungan.setText("Kunjungan");
        btnKunjungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKunjunganActionPerformed(evt);
            }
        });
        getContentPane().add(btnKunjungan);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnPoliklinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliklinikActionPerformed
        new framePoliklinik().setVisible(true);
        dispose(); // Tutup menu utama
    }//GEN-LAST:event_btnPoliklinikActionPerformed

    private void btnInputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputUserActionPerformed
        new frameInput_User().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInputUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      new frameLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
      new frameDokter().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
         new framePasien().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnKunjunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKunjunganActionPerformed
        new frameKunjungan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKunjunganActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frameKesehatan().setVisible(true);
        });
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDokter;
    private javax.swing.JButton btnInputUser;
    private javax.swing.JButton btnKunjungan;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnMenuUtama;
    private javax.swing.JButton btnPasien;
    private javax.swing.JButton btnPoliklinik;
    // End of variables declaration//GEN-END:variables
}