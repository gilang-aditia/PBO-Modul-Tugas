package com.gilang.modul.tugas1;

public class Mahasiswa {

    String nama_lengkap, ttl, alamat, agama, kelamin, pilJurusan, email;
    int nilaiUN, handphone;

    // Constractor
    public Mahasiswa(String nama, String ttl, String alamat, String agama, String kelamin, String pilJurusan, String email, int hp, int nilaiUN) {
        this.nama_lengkap = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.agama = agama;
        this.kelamin = kelamin;
        this.pilJurusan = pilJurusan;
        this.email = email;
        this.handphone = hp;
        this.nilaiUN = nilaiUN;
    }
}
