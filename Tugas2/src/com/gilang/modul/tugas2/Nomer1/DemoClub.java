package com.gilang.modul.tugas2.Nomer1;

public class DemoClub {
    public static void main(String[] args) {

        // Inisiasi Objek
        Club club1 = new Club();
        Club club2 = new Club("Liverpool");
        Club club3 = new Club("Liverpool", "Liverpool Football Club adalah sebuah klub sepak bola Liga Inggris");
        Club club4 = new Club("Liverpool", 1892, "Anfield");
        Club club5 = new Club("Liverpool", 1892, "Anfield", 1, "Liverpool Football Club adalah sebuah klub sepak bola Liga Inggris");

        // Memanggil Method getTeam dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
