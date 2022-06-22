/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknoko;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Brahmasta Bagus A
 */
@Entity
@Table(name = "barang", catalog = "teknoko", schema = "")
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b")
    , @NamedQuery(name = "Barang.findByKdBarang", query = "SELECT b FROM Barang b WHERE b.kdBarang = :kdBarang")
    , @NamedQuery(name = "Barang.findByNamaBarang", query = "SELECT b FROM Barang b WHERE b.namaBarang = :namaBarang")
    , @NamedQuery(name = "Barang.findByKategori", query = "SELECT b FROM Barang b WHERE b.kategori = :kategori")
    , @NamedQuery(name = "Barang.findByHarga", query = "SELECT b FROM Barang b WHERE b.harga = :harga")
    , @NamedQuery(name = "Barang.findByStok", query = "SELECT b FROM Barang b WHERE b.stok = :stok")})
public class Barang implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_barang")
    private Integer kdBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "kategori")
    private String kategori;
    @Basic(optional = false)
    @Column(name = "harga")
    private float harga;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public Barang() {
    }

    public Barang(Integer kdBarang) {
        this.kdBarang = kdBarang;
    }

    public Barang(Integer kdBarang, String namaBarang, String kategori, float harga, int stok) {
        this.kdBarang = kdBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public Integer getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(Integer kdBarang) {
        Integer oldKdBarang = this.kdBarang;
        this.kdBarang = kdBarang;
        changeSupport.firePropertyChange("kdBarang", oldKdBarang, kdBarang);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        String oldNamaBarang = this.namaBarang;
        this.namaBarang = namaBarang;
        changeSupport.firePropertyChange("namaBarang", oldNamaBarang, namaBarang);
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        String oldKategori = this.kategori;
        this.kategori = kategori;
        changeSupport.firePropertyChange("kategori", oldKategori, kategori);
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        float oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdBarang != null ? kdBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.kdBarang == null && other.kdBarang != null) || (this.kdBarang != null && !this.kdBarang.equals(other.kdBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teknoko.Barang[ kdBarang=" + kdBarang + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
