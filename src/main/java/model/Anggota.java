/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Blob;

/**
 *
 * @author Rad
 */
public class Anggota {
    String id;
    String namaAnggota;
    String jenisKelamin;
    String tanggalLahir;
    String agama;
    Petugas petugas;
    Blob fotoAnggota;

    public Anggota(String string, String string0, String string1, String string2, String string3, String string4, String string5, Blob blob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public Blob getFotoAnggota() {
        return fotoAnggota;
    }

    public void setFotoAnggota(Blob fotoAnggota) {
        this.fotoAnggota = fotoAnggota;
    }

    public Anggota() {
    }

    public Anggota(String id, String namaAnggota, String jenisKelamin, String tanggalLahir, String agama, Petugas petugas, Blob fotoAnggota) {
        this.id = id;
        this.namaAnggota = namaAnggota;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.petugas = petugas;
        this.fotoAnggota = fotoAnggota;
    }
    
    
}


