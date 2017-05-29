package com.muhardin.endy.belajar.ejb;

import java.math.BigDecimal;

public class Produk {
    private String kode;
    private String nama;
    private BigDecimal harga;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }
}
