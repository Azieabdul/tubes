/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.awt.Color; 
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jon
 */
public class Makanan extends javax.swing.JFrame {

    koneksi k;
    public Makanan() {
        initComponents();
        k = new koneksi();
        tampil_tabel();
        autonumber();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtkodemakanan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpaketmakanan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtketerangan = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txthargamakanan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        Btnsimpan = new javax.swing.JButton();
        Btnubah = new javax.swing.JButton();
        Btnhapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_makanan = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kode Makanan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 24));

        txtkodemakanan.setEditable(false);
        txtkodemakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodemakananActionPerformed(evt);
            }
        });
        getContentPane().add(txtkodemakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 104, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Paket Makanan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 24));

        txtpaketmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaketmakananActionPerformed(evt);
            }
        });
        txtpaketmakanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaketmakananKeyTyped(evt);
            }
        });
        getContentPane().add(txtpaketmakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 104, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keterangan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 24));

        jtketerangan.setColumns(20);
        jtketerangan.setRows(5);
        jtketerangan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtketeranganKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(jtketerangan);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 245, 122));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Makanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 24));

        txthargamakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargamakananActionPerformed(evt);
            }
        });
        txthargamakanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargamakananKeyTyped(evt);
            }
        });
        getContentPane().add(txthargamakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 104, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stok");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, 24));

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });
        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });
        getContentPane().add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 104, -1));

        Btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/save.PNG"))); // NOI18N
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, 30));

        Btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/edit.PNG"))); // NOI18N
        Btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnubahActionPerformed(evt);
            }
        });
        getContentPane().add(Btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 90, 30));

        Btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/hapus.png"))); // NOI18N
        Btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cari.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 40, 40));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 104, -1));

        table_makanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "kode makanan      ", "nama paket makanan     ", "keterangan ", "harga makanan  ", "Stok"
            }
        ));
        table_makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_makananMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_makanan);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 740, 110));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/2leftarrow.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/paket.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodemakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodemakananActionPerformed

    }//GEN-LAST:event_txtkodemakananActionPerformed

    private void txtpaketmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaketmakananActionPerformed
        jtketerangan.requestFocus();
    }//GEN-LAST:event_txtpaketmakananActionPerformed

    private void txtpaketmakananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaketmakananKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isAlphabetic(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtpaketmakananKeyTyped

    private void jtketeranganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtketeranganKeyTyped

    }//GEN-LAST:event_jtketeranganKeyTyped

    private void txthargamakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargamakananActionPerformed

        String harga = txthargamakanan.getText();

        if (harga.equals("0")) {
            JOptionPane.showMessageDialog(null,"Tidak Boleh Nol...!!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else {
            txtstok.requestFocus();
        }

    }//GEN-LAST:event_txthargamakananActionPerformed

    private void txthargamakananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargamakananKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txthargamakananKeyTyped

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        String Stok = txtstok.getText();

        if (Stok.equals("0")) {
            JOptionPane.showMessageDialog(null,"Tidak Boleh Nol...!!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else {
          BtnsimpanActionPerformed(evt);

        }

    }//GEN-LAST:event_txtstokActionPerformed

    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtstokKeyTyped

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed

        try {
            if(Btnsimpan.getText().equals("Batal")){
                bersih();
                Btnsimpan.setText("Simpan");
            }
            else{
                if(txtkodemakanan.getText().equals("")||txtpaketmakanan.getText().equals("")||jtketerangan.getText().equals("")||txthargamakanan.getText().equals("")||txtstok.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Mohon diisi data yang kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
                }
                else{

                    k.bahasaSQL ="SELECT * FROM `tmakanan` WHERE nama_paket_makanan = '" + txtpaketmakanan.getText() + "' AND keterangan = '" + jtketerangan.getText()  + "' ";
                    k.ambil();
                    k.hasilset.last();
                    int cek = k.hasilset.getRow();
                    if (cek == 0) {

                        k.bahasaSQL = "INSERT INTO tmakanan VALUES('" + txtkodemakanan.getText() + "', '" + txtpaketmakanan.getText() + "','" + jtketerangan.getText() + "','" + txthargamakanan.getText() + "','" + txtstok.getText() + "')";
                        k.crud();
                        JOptionPane.showMessageDialog(rootPane, "Berhasil Masuk");

                        bersih();
                        tampil_tabel();
                        autonumber();

                    } else {
                        JOptionPane.showMessageDialog(this, "Data Sudah Ada");
                    }

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
    }//GEN-LAST:event_BtnsimpanActionPerformed

    private void BtnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnubahActionPerformed

        int row = table_makanan.getSelectedRow();
        try {

            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                k.bahasaSQL = "UPDATE tmakanan SET nama_paket_makanan = '" + txtpaketmakanan.getText()+"'"
                + ", keterangan = '"+jtketerangan.getText()+"', harga = '"+ txthargamakanan.getText()+"', stok='"+ txtstok.getText()+"' WHERE kode_makanan = '"+ txtkodemakanan.getText()+"'";
                k.crud();
                JOptionPane.showMessageDialog(null, "Berhasil Diubah");

                tampil_tabel();
                bersih();
                Btnsimpan.setText("Simpan");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnubahActionPerformed

    private void BtnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnhapusActionPerformed

        int row = table_makanan.getSelectedRow();
        try {

            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                k.bahasaSQL = "DELETE FROM tmakanan WHERE kode_makanan = '" + txtkodemakanan.getText()+"'";
                k.crud();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");

                tampil_tabel();
                bersih();
                Btnsimpan.setText("Simpan");
            }
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnhapusActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed

    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        pencarian();
    }//GEN-LAST:event_txtcariKeyReleased

    private void table_makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_makananMouseClicked
        int baris = table_makanan.getSelectedRow();
        int kolom = table_makanan.getSelectedColumn();
        String data = table_makanan.getValueAt(baris, kolom).toString();
        String kolom1 = table_makanan.getValueAt(baris, 0).toString();
        String kolom2 = table_makanan.getValueAt(baris, 1).toString();
        String kolom3 = table_makanan.getValueAt(baris, 2).toString();
        String kolom4 = table_makanan.getValueAt(baris, 3).toString();
        String kolom5 = table_makanan.getValueAt(baris, 4).toString();
        Btnsimpan.setText("Batal");

        txtkodemakanan.setText(kolom1);
        txtpaketmakanan.setText(kolom2);
        jtketerangan.setText(kolom3);
        txthargamakanan.setText(kolom4);
        txtstok.setText(kolom5);
    }//GEN-LAST:event_table_makananMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Formutama().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tampil_tabel(){
        try{
           DefaultTableModel tb = (DefaultTableModel)table_makanan.getModel();
           tb.setRowCount(0);
           k.bahasaSQL = "SELECT * FROM tmakanan";
            k.ambil();
             while(k.hasilset.next()){
               Object[] o;
               
               String cek1  = k.hasilset.getString(1);
               String cek2 = k.hasilset.getString(2);
               String cek3 = k.hasilset.getString(3);
               String cek4 = k.hasilset.getString(4);
               String cek5 = k.hasilset.getString(5);
               tb.addRow(new Object[]{cek1,cek2,cek3,cek4,cek5});
        }
    } catch (Exception e){
        Logger.getLogger(Makanan.class.getName()).log(Level.SEVERE,null,e);
        }
  
    }
    
    public void autonumber()  {
        
            
            k.bahasaSQL="select * from tmakanan";
                       
            try{
            k.ambil();
            k.hasilset.last();
            int baris = k.hasilset.getRow();
            String baru;
            if(baris==0){
             baru = "KM-001";                     
      }else{
     int tambah = Integer.valueOf(k.hasilset.getString(1).split("-")[1]) + 1;
     // int tambah = Integer.valueOf(k.hasilset.getString(1).substring(2,(k.hasilset.getString(1).length())))+ 1;
               if(tambah < 10){
                baru = "KM-00"+ tambah;
               }else if(tambah < 100){
                baru = "KM-"+ tambah;
               }else{
                baru = "KM"+ tambah;
               }               
            }            
           txtkodemakanan.setText(baru);
           
        }catch(Exception e){
        }    
    }
    
    public void pencarian(){
        String cari = txtcari.getText();
        
        try{
            DefaultTableModel tb = (DefaultTableModel)table_makanan.getModel();
            tb.setRowCount(0);
            k.bahasaSQL = "SELECT * FROM tmakanan where kode_makanan like '%" + cari + "%' or nama_paket_makanan like '%" + cari + "%' or keterangan like '%" + cari + "%' or harga like '%" + cari + "%' or stok like '%" + cari + "%'";
            k.ambil();
            
            while (k.hasilset.next()){
                 String cek1  = k.hasilset.getString(1);
               String cek2 = k.hasilset.getString(2);
               String cek3 = k.hasilset.getString(3);
               String cek4 = k.hasilset.getString(4);
               String cek5 = k.hasilset.getString(5);
               tb.addRow(new Object[]{cek1,cek2,cek3,cek4,cek5});
                
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void bersih(){
        txtkodemakanan.setText("");
        txtpaketmakanan.setText("");
        jtketerangan.setText("");
        txthargamakanan.setText("");
        txtstok.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnhapus;
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JButton Btnubah;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jtketerangan;
    private javax.swing.JTable table_makanan;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthargamakanan;
    private javax.swing.JTextField txtkodemakanan;
    private javax.swing.JTextField txtpaketmakanan;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
