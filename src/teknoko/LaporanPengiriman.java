/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknoko;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Brahmasta Bagus A
 */
public class LaporanPengiriman extends javax.swing.JInternalFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksi();
    public StringTokenizer token;
    public String ganti = "";
    String id, tanggal, total, bayar, kembalian;
    String[] jumlah;

    /**
     * Creates new form LaporanPengiriman
     */
    
    private void table1() {
        DefaultTableModel model1 = (DefaultTableModel)table.getModel();
        model1.addColumn("ID Transaksi");
        model1.addColumn("Nama Pelanggan");
        model1.addColumn("Alamat");
        model1.addColumn("Biaya");
        
        table.setModel(model1);
    }
    
    public void data_table() {
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
        model.addColumn("ID Transaksi");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Harga Total");
        model.addColumn("Kembalian");
        model.addColumn("Pembayaran");
        
        try {
            st = cn.createStatement();

            String sql = "SELECT * FROM transaksi";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString(1);
                tanggal = rs.getString(2);
                
                total = rs.getString(3);
                int total1 = Integer.parseInt(total);
                ganti = NumberFormat.getNumberInstance(Locale.US).format(total1);
                token = new StringTokenizer(ganti, ".");
                ganti = token.nextToken();
                ganti = ganti.replace(',', '.');
                total = String.format(ganti);
                
                bayar = rs.getString(4);
                int bayar1 = Integer.parseInt(bayar);
                ganti = NumberFormat.getNumberInstance(Locale.US).format(bayar1);
                token = new StringTokenizer(ganti, ".");
                ganti = token.nextToken();
                ganti = ganti.replace(',', '.');
                bayar = String.format(ganti);
                
                kembalian = rs.getString(5);
                int kembalian1 = Integer.parseInt(kembalian);
                ganti = NumberFormat.getNumberInstance(Locale.US).format(kembalian1);
                token = new StringTokenizer(ganti, ".");
                ganti = token.nextToken();
                ganti = ganti.replace(',', '.');
                kembalian = String.format(ganti);
                
                model.addRow(new Object[] {
                    id,
                    tanggal,
                    total,
                    bayar,
                    kembalian});
                tabel.setModel(model);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
        model = (DefaultTableModel) tabel.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tabel.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    public LaporanPengiriman() {
        initComponents();
        data_table();
        table1();
        btnPrintPengiriman.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneld = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnPrintPengiriman = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel.setRowHeight(25);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCari.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCari.setMinimumSize(new java.awt.Dimension(6, 30));
        txtCari.setPreferredSize(new java.awt.Dimension(59, 30));
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cari Transaksi");
        jLabel6.setPreferredSize(new java.awt.Dimension(91, 30));

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        btnPrintPengiriman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrintPengiriman.setText("Print");
        btnPrintPengiriman.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnPrintPengiriman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrintPengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintPengirimanMouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtPrint.setColumns(20);
        txtPrint.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtPrint.setRows(5);
        jScrollPane2.setViewportView(txtPrint);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setRowHeight(25);
        jScrollPane3.setViewportView(table);

        javax.swing.GroupLayout paneldLayout = new javax.swing.GroupLayout(paneld);
        paneld.setLayout(paneldLayout);
        paneldLayout.setHorizontalGroup(
            paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldLayout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrintPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneldLayout.createSequentialGroup()
                        .addGroup(paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        paneldLayout.setVerticalGroup(
            paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneldLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnPrintPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        try {
            btnPrintPengiriman.setEnabled(true);
            DefaultTableModel model = (DefaultTableModel)tabel.getModel();
            String id = model.getValueAt(tabel.getSelectedRow(), 0).toString();
            DefaultTableModel model1 = (DefaultTableModel)table.getModel();
            model1.setRowCount(0);

            st = cn.createStatement();
            String sql = "SELECT "
            + "* "
            + "FROM laporan_pengiriman "
            + "WHERE id_transaksi = '"+ id +"'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String biaya = rs.getString("biaya");
                int biaya1 = Integer.parseInt(biaya);
                ganti = NumberFormat.getNumberInstance(Locale.US).format(biaya1);
                token = new StringTokenizer(ganti, ".");
                ganti = token.nextToken();
                ganti = ganti.replace(',', '.');
                biaya = String.format(ganti);
                
                model1.addRow(new Object[] {
                    rs.getString("id_transaksi"),
                    rs.getString("nama"),
                    rs.getString("alamat"),
                    biaya
                });
            table.setModel(model1);
        }

        } catch (SQLException ex) {
            Logger.getLogger(LaporanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        String searchString = txtCari.getText();
        search(searchString);
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        txtCari.setText("");
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnPrintPengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintPengirimanMouseClicked
        int jawab = JOptionPane.showOptionDialog(this, "Yakin ingin di print?", "Print Barang", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (jawab == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel)tabel.getModel();
            DefaultTableModel model1 = (DefaultTableModel)table.getModel();

            String id = model.getValueAt(tabel.getSelectedRow(), 0).toString();
            String tanggal = model.getValueAt(tabel.getSelectedRow(), 1).toString();
            String harga_total = model.getValueAt(tabel.getSelectedRow(), 2).toString();
            String pembayaran = model.getValueAt(tabel.getSelectedRow(), 3).toString();
            String kembalian = model.getValueAt(tabel.getSelectedRow(), 4).toString();

            String nama_pelanggan = model1.getValueAt(0, 1).toString();
            String alamat = model1.getValueAt(0, 2).toString();
            String biaya = model1.getValueAt(0, 3).toString();

            txtPrint.setText(
                    "/--------------------------------------/\n" +
                    "\t         Tekonoko\n" +
                    "/--------------------------------------/\n\n"
            );

            txtPrint.append("ID Transaksi\t\t: " + id + "\n");
            txtPrint.append("Tanggal Transaksi\t: " + tanggal + "\n");
            txtPrint.append("/--------------------------------------/\n\n");

            txtPrint.append("Nama Pelanggan : " + nama_pelanggan + "\n");
            txtPrint.append("Alamat\t       : " + alamat + "\n");
            txtPrint.append("Biaya\t       : " + biaya + "\n");

            txtPrint.append("/--------------------------------------/\n");

            txtPrint.append("\nTerima Kasih sudah membeli di Toko Kami.");

            try {
                txtPrint.print();
            } catch (PrinterException ex) {
                Logger.getLogger(LaporanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPrintPengirimanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPrintPengiriman;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel paneld;
    private javax.swing.JTable tabel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextArea txtPrint;
    // End of variables declaration//GEN-END:variables
}
