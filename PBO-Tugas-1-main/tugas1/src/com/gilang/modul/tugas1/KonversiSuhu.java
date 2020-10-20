package com.gilang.modul.tugas1;

public class KonversiSuhu {

    // konversi suhu dari Celcius ke Fahrenheit
    public float Celcius_Fahrenheit(float suhu){
        float hasil = (suhu * 9/5) + 32;
        return hasil;
    }
    // konversi suhu dari Fahrenheit ke Kelvin
    public float Fahrenheit_Kelvin(float suhu) {
        float hasil = (suhu - 32) * 5/9 + 273;
        return hasil;
    }
    // konversi suhu dari Kelvin ke Reamur
    public float Kelvin_Reamur(float suhu) {
        float hasil = (suhu - 273) * 4/5;
        return hasil;
    }
    // konversi suhu dari Reamur ke Celcius
    public float CelciusFahrenheit(float suhu) {
        float hasil = suhu * 5/4;
        return hasil;
    }
}
