



package tubes;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jon
 */
public class Transaksi extends javax.swing.JFrame {

    koneksi k;

    DefaultTableModel model = new DefaultTableModel();
    String tgl;
    
    public Transaksi() {
        initComponents();
        k = new koneksi();

        model.addColumn("kode makanan");
        model.addColumn("nama paket makanan");
        model.addColumn("keterangan");
        model.addColumn("harga");
        model.addColumn("jumlah beli");
        model.addColumn("subtotal");
    }

    int kembalian, total, tunai , jumlah_beli , stok;
    String hasil;
    String kodemk;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtkodetrans = new javax.swing.JTextField();
        cmbmakanan = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtnamapaket = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtjumlahbeli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnamakasir = new javax.swing.JTextField();
        txtkodekasir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtketerangan = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Btnsimpan = new javax.swing.JButton();
        Btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabtransaksi = new javax.swing.JTable();
        txttunai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JLabel();
        btnbeli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/2leftarrow.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kode Transaksi");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtkodetrans.setEditable(false);
        getContentPane().add(txtkodetrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 120, -1));

        cmbmakanan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbmakananPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbmakananPopupMenuWillBecomeVisible(evt);
            }
        });
        cmbmakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbmakananMouseClicked(evt);
            }
        });
        cmbmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmakananActionPerformed(evt);
            }
        });
        getContentPane().add(cmbmakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("kode makanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("nama paket makanan");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        txtnamapaket.setEditable(false);
        getContentPane().add(txtnamapaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("harga");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        txtharga.setEditable(false);
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 108, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jumlah beli");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 108, -1, -1));

        txtjumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbeliActionPerformed(evt);
            }
        });
        txtjumlahbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahbeliKeyTyped(evt);
            }
        });
        getContentPane().add(txtjumlahbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 131, 94, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Stock");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        txtstok.setEditable(false);
        getContentPane().add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 96, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subtotal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });
        txtsubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsubtotalKeyTyped(evt);
            }
        });
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("kode kasir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nama Kasir");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        txtnamakasir.setEditable(false);
        getContentPane().add(txtnamakasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 100, -1));

        txtkodekasir.setEditable(false);
        getContentPane().add(txtkodekasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 100, -1));

        jtketerangan.setEditable(false);
        jtketerangan.setColumns(20);
        jtketerangan.setRows(5);
        jScrollPane1.setViewportView(jtketerangan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 191, 242, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keterangan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 171, -1, 20));

        Btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/save.PNG"))); // NOI18N
        Btnsimpan.setText("SIMPAN");
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 260, 160, -1));

        Btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/hapus.png"))); // NOI18N
        Btnhapus.setText("HAPUS");
        Btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 160, 30));

        tabtransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode makanan", "nama paket makanan", "keterangan", "harga", "jumlah beli", "subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabtransaksi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, 800, 170));

        txttunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttunaiActionPerformed(evt);
            }
        });
        txttunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttunaiKeyTyped(evt);
            }
        });
        getContentPane().add(txttunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 120, -1));

        jLabel11.setBackground(new java.awt.Color(51, 255, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tunai");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("kembalian");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RP.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        txtkembalian.setForeground(new java.awt.Color(255, 255, 255));
        txtkembalian.setText("----------------------------");
        getContentPane().add(txtkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        btnbeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Money-32x32.png"))); // NOI18N
        btnbeli.setText("Beli");
        btnbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeliActionPerformed(evt);
            }
        });
        getContentPane().add(btnbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/restaurant-06.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Formutama().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbmakananPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbmakananPopupMenuWillBecomeInvisible
        try {
            kodemk = (String) cmbmakanan.getSelectedItem();

            k.bahasaSQL = "Select * from tmakanan where kode_makanan ='" + kodemk + "'";
            k.ambil();
            while (k.hasilset.next()) {
                txtnamapaket.setText(k.hasilset.getString(2));
                txtharga.setText(k.hasilset.getString(4));
                txtstok.setText(k.hasilset.getString(5));
                jtketerangan.setText(k.hasilset.getString(3));

            }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_cmbmakananPopupMenuWillBecomeInvisible

    private void cmbmakananPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbmakananPopupMenuWillBecomeVisible
        k.bahasaSQL = "select * from tmakanan where stok >= 1";
        try {
            cmbmakanan.removeAllItems();
            k.ambil();
            while (k.hasilset.next()) {
                cmbmakanan.addItem(k.hasilset.getString(1));
            }
            cmbmakanan.setSelectedIndex(-1);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_cmbmakananPopupMenuWillBecomeVisible

    private void cmbmakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbmakananMouseClicked

    }//GEN-LAST:event_cmbmakananMouseClicked

    private void cmbmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmakananActionPerformed

    }//GEN-LAST:event_cmbmakananActionPerformed

    private void txtjumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbeliActionPerformed
        int jumlah_beli = Integer.valueOf(txtjumlahbeli.getText());
        int stok = Integer.valueOf(txtstok.getText());

        if (jumlah_beli > stok) {
            JOptionPane.showMessageDialog(null,"Stok Tidak Cukup","Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else {

            txtsubtotal.requestFocus();
            subtotal();
        }
    }//GEN-LAST:event_txtjumlahbeliActionPerformed

    private void txtjumlahbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahbeliKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtjumlahbeliKeyTyped

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        String kode_makanan = cmbmakanan.getSelectedItem().toString();
        String nama_paket_makanan = txtnamapaket.getText();
        String keterangan = jtketerangan.getText();
        String harga = txtharga.getText();
        String jumlah_beli = txtjumlahbeli.getText();
        String subtotal = txtsubtotal.getText();

        if (kode_makanan.equals("") || nama_paket_makanan.equals("") || keterangan.equals("") || harga.equals("") || jumlah_beli.equals("") || subtotal.equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi Data !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            tabtransaksi.setModel(model);

            Object[] data = {kode_makanan, nama_paket_makanan, keterangan, harga, jumlah_beli, subtotal};
            model.addRow(data);

            totalku();
            txttunai.requestFocus();
            bersih();
        }
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtsubtotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubtotalKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtsubtotalKeyTyped

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed
        txtsubtotalActionPerformed(evt);
    }//GEN-LAST:event_BtnsimpanActionPerformed

    private void BtnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnhapusActionPerformed

        int row = tabtransaksi.getSelectedRow();
        try {

            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                k.bahasaSQL = "DELETE FROM ttransaksi WHERE kode_transaksi = '" + txtkodetrans.getText()+"'";
                k.crud();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");

                tampil_table();
                bersih();
                txttotal.setText("");
                Btnsimpan.setText("Simpan");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnhapusActionPerformed

    private void txttunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttunaiActionPerformed

        txtkembalian.requestFocus();
        kembalian();
        btnbeliActionPerformed(evt);
    }//GEN-LAST:event_txttunaiActionPerformed

    private void txttunaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttunaiKeyTyped
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter)|| karakter== KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttunaiKeyTyped

    private void btnbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeliActionPerformed

        if (tunai < total)  {
            JOptionPane.showMessageDialog(null, "Maaf uang anda kurang");
            txttunai.setText("");
            txttunai.requestFocus();
        } else {
            txtkembalian.setText(hasil);
            try {

                SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy-MM-dd");
                Date tanggal = new Date();
                k.bahasaSQL = "INSERT INTO ttransaksi VALUES('" + txtkodetrans.getText() + "', '" + txtkodekasir.getText() + "','" + txttunai.getText() + "','" + txtkembalian.getText() + "','" + txttotal.getText() + "','" + sdfdate.format(tanggal) + "')";
                k.crud();

                int baris = 0;
                for (int i = 0; i < tabtransaksi.getRowCount(); i++) {
                    

                    k.bahasaSQL = "UPDATE tmakanan set stok = stok - " +tabtransaksi.getValueAt(baris, 4) + " WHERE kode_makanan = '" +tabtransaksi.getValueAt(baris, 0) + "' ";
                    k.crud();

                    baris = baris + 1;
                }
                JOptionPane.showMessageDialog(this, "Transaksi Berhasil");
                bersih();
                txttunai.setText("");
                txttotal.setText("");
                txtkembalian.setText("");
                autonumber3();
                tampil_table();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
        }   
        
        
        
        

    }//GEN-LAST:event_btnbeliActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        autonumber();
        autonumber2();
        autonumber3();
    }//GEN-LAST:event_formWindowOpened
    
    public void autonumber() {

        k.bahasaSQL = "select * from tkasir";

        try {
            k.ambil();
            k.hasilset.last();
            int baris = k.hasilset.getRow();
            String baru;
            if (baris == 0) {
                baru = "KK-001";
            } else {
                int tambah = Integer.valueOf(k.hasilset.getString(1).split("-")[1]) + 1;
                // int tambah = Integer.valueOf(k.hasilset.getString(1).substring(2,(k.hasilset.getString(1).length())))+ 1;
                if (tambah < 10) {
                    baru = "KK-001";
                } else if (tambah < 100) {
                    baru = "KK-0";
                } else {
                    baru = "KK-";
                }
            }
            txtkodekasir.setText(baru);

        } catch (Exception e) {
        }
    }
    
    public void autonumber2() {

        k.bahasaSQL = "select * from tkasir";

        try {
            k.ambil();
            k.hasilset.last();
            int baris = k.hasilset.getRow();
            String baru;
            if (baris == 0) {
                baru = "Azieabdul";
            } else {
                int tambah = Integer.valueOf(k.hasilset.getString(1).split("-")[1]) + 1;
                // int tambah = Integer.valueOf(k.hasilset.getString(1).substring(2,(k.hasilset.getString(1).length())))+ 1;
                if (tambah < 10) {
                    baru = "Azieabdul";
                } else if (tambah < 100) {
                    baru = "Azieabd";
                } else {
                    baru = "Azieab";
                }
            }
            txtnamakasir.setText(baru);

        } catch (Exception e) {
        }
    }
    
    public void bersih() {
        
        txtnamapaket.setText("");
        jtketerangan.setText("");
        txtharga.setText("");
        txtstok.setText("");
        txtsubtotal.setText("");
        txtjumlahbeli.setText("");
       
        
    }
    
     private void subtotal() {
        int harga, jumbel, subto;
        String hasil;
        harga = Integer.valueOf(txtharga.getText());
        jumbel = Integer.valueOf(txtjumlahbeli.getText());
        subto = harga * jumbel;
        hasil = String.valueOf(subto);
        txtsubtotal.setText(hasil);
    }
     
    private void kembalian() {
        
        
        total = Integer.valueOf(txttotal.getText());
        tunai = Integer.valueOf(txttunai.getText());
        
            kembalian = tunai - total;
            hasil = String.valueOf(kembalian);
            
        

    }
    
    private void totalku() {
        int total = 0;
        int baris = 0;

        for (int i = 0; i < tabtransaksi.getRowCount(); i++) {
            total = total + Integer.valueOf(tabtransaksi.getValueAt(baris, 5).toString());
            baris = baris + 1;
        }

        txttotal.setText(String.valueOf(total));
    }
    
    public void autonumber3(){
         k.bahasaSQL="select * from ttransaksi";
                       
            try{
            k.ambil();
            k.hasilset.last();
            int baris = k.hasilset.getRow();
            String baru;
            if(baris==0){
             baru = "TR-001";                     
      }else{
     int tambah = Integer.valueOf(k.hasilset.getString(1).split("-")[1]) + 1;
     // int tambah = Integer.valueOf(k.hasilset.getString(1).substring(2,(k.hasilset.getString(1).length())))+ 1;
               if(tambah < 10){
                baru = "TR-00"+ tambah;
               }else if(tambah < 100){
                baru = "TR-0"+ tambah;
               }else{
                baru = "TR"+ tambah;
               }               
            }            
           txtkodetrans.setText(baru);
           
        }catch(Exception e){
        }    
    }
    
    public void tampil_table(){
     String kode_makanan = cmbmakanan.getSelectedItem().toString();
        String nama_paket_makanan = txtnamapaket.getText();
        String keterangan = jtketerangan.getText();
        String harga = txtharga.getText();
        String jumlah_beli = txtjumlahbeli.getText();
        String subtotal = txtsubtotal.getText();

      
            tabtransaksi.setModel(model);

            Object[] data = {kode_makanan, nama_paket_makanan, keterangan, harga, jumlah_beli, subtotal};
            model.setRowCount(0);
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnhapus;
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnbeli;
    private javax.swing.JComboBox<String> cmbmakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtketerangan;
    private javax.swing.JTable tabtransaksi;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlahbeli;
    private javax.swing.JLabel txtkembalian;
    private javax.swing.JTextField txtkodekasir;
    private javax.swing.JTextField txtkodetrans;
    private javax.swing.JTextField txtnamakasir;
    private javax.swing.JTextField txtnamapaket;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttunai;
    // End of variables declaration//GEN-END:variables
}