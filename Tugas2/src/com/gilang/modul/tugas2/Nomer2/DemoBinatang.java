package com.gilang.modul.tugas2.Nomer2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Inisiasi Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Kolibri";
        burung.makan = "Serbuk bunga";
        burung.tidur = "Burung Kolibri Tidur Pada Saat Ngantuk";
        burung.terbang = "Burung Kolibri Terbang Menggunakan Sayap";

        // Memanggil Method
        System.out.println("\t\t\t=== BURUNG ===");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Inisiasi Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Hiu";
        ikan.makan = "Ikan Hiu Makan Tomat";
        ikan.tidur = "Ikan Hiu Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Hiu Berenang Atas Izin Tuhan";

        System.out.println();

        // Memanggil Method
        System.out.println("\t\t\t=== IKAN ===");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Inisiasi Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Garong";
        kucing.makan = "Kucing Garong Makan Harta Benda";
        kucing.tidur = "Kucing Garong Tidur Pada Siang Hari";
        kucing.meong = "Kucing Garong Meong Saat Musim Hujan";

        // Memanggil Method
        System.out.println("\t\t\t=== KUCING ===");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}
