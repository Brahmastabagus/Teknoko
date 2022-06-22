/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teknoko;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Brahmasta Bagus A
 */
public class frHome extends JFrame {
    ListBarang listbarang;
    Transaksi transaksi;
    Pengiriman pengiriman;
    LaporanTransaksi laporantransaksi;
    LaporanPengiriman laporanpengiriman;

    /**
     * Creates new form frHome
     */
    public frHome() {
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
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
        dekstop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mTransaksi = new javax.swing.JMenu();
        mPengiriman = new javax.swing.JMenu();
        mListBarang = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mLaporanTransaksi = new javax.swing.JMenuItem();
        mLaporanPengiriman = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout dekstopLayout = new javax.swing.GroupLayout(dekstop);
        dekstop.setLayout(dekstopLayout);
        dekstopLayout.setHorizontalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        dekstopLayout.setVerticalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneldLayout = new javax.swing.GroupLayout(paneld);
        paneld.setLayout(paneldLayout);
        paneldLayout.setHorizontalGroup(
            paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop)
        );
        paneldLayout.setVerticalGroup(
            paneldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(75, 35));

        mTransaksi.setText("Transaksi");
        mTransaksi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mTransaksi.setMargin(new java.awt.Insets(3, 6, 3, 8));
        mTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mTransaksiMouseEntered(evt);
            }
        });
        mTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTransaksiActionPerformed(evt);
            }
        });
        jMenuBar1.add(mTransaksi);

        mPengiriman.setText("Pengiriman");
        mPengiriman.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mPengiriman.setMargin(new java.awt.Insets(3, 6, 3, 8));
        mPengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mPengirimanMouseClicked(evt);
            }
        });
        jMenuBar1.add(mPengiriman);

        mListBarang.setText("List Barang");
        mListBarang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mListBarang.setMargin(new java.awt.Insets(3, 6, 3, 8));
        mListBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mListBarangMouseClicked(evt);
            }
        });
        jMenuBar1.add(mListBarang);

        jMenu3.setText("Laporan");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(3, 6, 3, 8));

        mLaporanTransaksi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mLaporanTransaksi.setText("Laporan Transaksi");
        mLaporanTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mLaporanTransaksi.setMargin(new java.awt.Insets(5, 0, 5, 0));
        mLaporanTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mLaporanTransaksiMouseClicked(evt);
            }
        });
        mLaporanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLaporanTransaksiActionPerformed(evt);
            }
        });
        jMenu3.add(mLaporanTransaksi);

        mLaporanPengiriman.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mLaporanPengiriman.setText("Laporan Pengiriman");
        mLaporanPengiriman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mLaporanPengiriman.setMargin(new java.awt.Insets(5, 0, 5, 0));
        mLaporanPengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mLaporanPengirimanMouseClicked(evt);
            }
        });
        mLaporanPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLaporanPengirimanActionPerformed(evt);
            }
        });
        jMenu3.add(mLaporanPengiriman);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void mLaporanPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLaporanPengirimanActionPerformed
        // TODO add your handling code here:
        if ( dekstop.getAllFrames().length == 0 ) {
            laporanpengiriman = new LaporanPengiriman();
            laporanpengiriman.show();
            dekstop.add(laporanpengiriman);
        } else {
            dekstop.remove(0);
            laporanpengiriman = new LaporanPengiriman();
            laporanpengiriman.show();
            dekstop.add(laporanpengiriman);
        }
    }//GEN-LAST:event_mLaporanPengirimanActionPerformed

    private void mTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTransaksiMouseClicked
        // TODO add your handling code here:
        if ( dekstop.getAllFrames().length == 0 ) {
            transaksi = new Transaksi();
            transaksi.show();
            dekstop.add(transaksi);
        } else {
            dekstop.remove(0);
            transaksi = new Transaksi();
            transaksi.show();
            dekstop.add(transaksi);
        }
    }//GEN-LAST:event_mTransaksiMouseClicked

    private void mTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTransaksiActionPerformed

    private void mListBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mListBarangMouseClicked
        // TODO add your handling code here:
        if ( dekstop.getAllFrames().length == 0 ) {
            listbarang = new ListBarang();
            listbarang.show();
            dekstop.add(listbarang);
        } else {
            dekstop.remove(0);
            listbarang = new ListBarang();
            listbarang.show();
            dekstop.add(listbarang);
        }
    }//GEN-LAST:event_mListBarangMouseClicked

    private void mTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTransaksiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mTransaksiMouseEntered

    private void mPengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mPengirimanMouseClicked
        // TODO add your handling code here:
        if ( dekstop.getAllFrames().length == 0 ) {
            pengiriman = new Pengiriman();
            pengiriman.show();
            dekstop.add(pengiriman);
        } else {
            dekstop.remove(0);
            pengiriman = new Pengiriman();
            pengiriman.show();
            dekstop.add(pengiriman);
        }
    }//GEN-LAST:event_mPengirimanMouseClicked

    private void mLaporanTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mLaporanTransaksiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mLaporanTransaksiMouseClicked

    private void mLaporanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLaporanTransaksiActionPerformed
        // TODO add your handling code here:
        if ( dekstop.getAllFrames().length == 0 ) {
            laporantransaksi = new LaporanTransaksi();
            laporantransaksi.show();
            dekstop.add(laporantransaksi);
        } else {
            dekstop.remove(0);
            laporantransaksi = new LaporanTransaksi();
            laporantransaksi.show();
            dekstop.add(laporantransaksi);
        }
    }//GEN-LAST:event_mLaporanTransaksiActionPerformed

    private void mLaporanPengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mLaporanPengirimanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mLaporanPengirimanMouseClicked

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
            java.util.logging.Logger.getLogger(frHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dekstop;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mLaporanPengiriman;
    private javax.swing.JMenuItem mLaporanTransaksi;
    private javax.swing.JMenu mListBarang;
    private javax.swing.JMenu mPengiriman;
    private javax.swing.JMenu mTransaksi;
    private javax.swing.JPanel paneld;
    // End of variables declaration//GEN-END:variables
}
