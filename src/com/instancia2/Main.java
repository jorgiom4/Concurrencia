package com.instancia2;

import com.instancia2.hilos.HiloPropio;

public class Main {

    /**
     * Ejerccio con Concurrencia
     * @param args
     */
    public static void main(String[] args) {

        HiloPropio hiloPropio = new HiloPropio();

        hiloPropio.start();

        for(int i=0; i<=100; i++){
            System.out.println("Contador de main: " + i);
        }


    }
}
