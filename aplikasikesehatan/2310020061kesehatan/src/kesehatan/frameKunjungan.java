/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kesehatan;

import java.util.ArrayList;

public class frameKunjungan extends javax.swing.JFrame {
    
    public frameKunjungan() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNomor = new javax.swing.JTextField();
        btnTanggalKunjungan = new javax.swing.JTextField();
        btnNomorRekamMedis = new javax.swing.JTextField();
        btnNamaLengkap = new javax.swing.JTextField();
        btnJenisKelamin = new javax.swing.JTextField();
        btnNamaDokter = new javax.swing.JTextField();
        btnPeserta = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahData = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nomor");

        jLabel2.setText("Tanggal Kunjungan");

        jLabel3.setText("Nomor Rekam Medis");

        jLabel4.setText("Nama Lengkap");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Nama Dokter");

        jLabel7.setText("Peserta");

        btnNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomorActionPerformed(evt);
            }
        });

        btnTanggalKunjungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanggalKunjunganActionPerformed(evt);
            }
        });

        btnNomorRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomorRekamMedisActionPerformed(evt);
            }
        });

        btnNamaLengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamaLengkapActionPerformed(evt);
            }
        });

        btnJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJenisKelaminActionPerformed(evt);
            }
        });

        btnNamaDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamaDokterActionPerformed(evt);
            }
        });

        btnPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesertaActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahData.setText("Tambah Data");
        btnTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel4))))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNamaDokter, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNamaLengkap)
                            .addComponent(btnTanggalKunjungan)
                            .addComponent(btnNomor)
                            .addComponent(btnJenisKelamin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNomorRekamMedis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPeserta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(142, 142, 142))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kembali)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTanggalKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNomorRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeserta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambahData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Kembali)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String nomor = btnNomor.getText();
    String tanggalKunjungan = btnTanggalKunjungan.getText();
    String nomorRekamMedis = btnNomorRekamMedis.getText();
    String namaLengkap = btnNamaLengkap.getText();
    String jenisKelamin = btnJenisKelamin.getText();
    String namaDokter = btnNamaDokter.getText();
    String peserta = btnPeserta.getText();

    // Buat objek Kunjungan
    Kunjungan data = new Kunjungan(nomor, tanggalKunjungan, nomorRekamMedis,
                                    namaLengkap, jenisKelamin, namaDokter, peserta);

    // Tampilkan data ke dialog
    javax.swing.JOptionPane.showMessageDialog(this,
        "Data Kunjungan Berhasil Disimpan!\n\n" + data.getInfoKunjungan()
    );    
}
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); // Menutup frame pasien dan kembali ke menu utama
    
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void btnTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataActionPerformed
    btnNomor.setText("");
    btnTanggalKunjungan.setText("");
    btnNomorRekamMedis.setText("");
    btnNamaLengkap.setText("");
    btnJenisKelamin.setText("");
    btnNamaDokter.setText("");
    btnPeserta.setText("");
    }//GEN-LAST:event_btnTambahDataActionPerformed

    private void btnPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesertaActionPerformed

    private void btnNamaDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamaDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNamaDokterActionPerformed

    private void btnJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJenisKelaminActionPerformed

    private void btnNamaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNamaLengkapActionPerformed

    private void btnNomorRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomorRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNomorRekamMedisActionPerformed

    private void btnTanggalKunjunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanggalKunjunganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTanggalKunjunganActionPerformed

    private void btnNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNomorActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField btnJenisKelamin;
    private javax.swing.JTextField btnNamaDokter;
    private javax.swing.JTextField btnNamaLengkap;
    private javax.swing.JTextField btnNomor;
    private javax.swing.JTextField btnNomorRekamMedis;
    private javax.swing.JTextField btnPeserta;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahData;
    private javax.swing.JTextField btnTanggalKunjungan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
