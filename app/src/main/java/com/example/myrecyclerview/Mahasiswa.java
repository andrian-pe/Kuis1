package com.example.myrecyclerview;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String angkatan;
    private Integer foto;

    Mahasiswa(String nama, String nim, String angkatan, Integer foto) {
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.foto = foto;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
