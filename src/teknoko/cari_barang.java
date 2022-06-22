/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknoko;

/**
 *
 * @author Brahmasta Bagus A
 */
public class cari_barang {
    private String kd_nama;
    private String nama;
    private String harga;
    
    public cari_barang() {
        
    }
    
    void caribarang(String kd_nama, String nama, String harga) {
        this.kd_nama = kd_nama;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKd_nama() {
        return kd_nama;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }
    
    
}
