package com.instancia2.hilos;

/**
 * Creamos una subclase de Thread
 */
public class HiloPropio extends Thread {

    @Override
    public void run() {
        for(int i=0; i<=100; i++){
            System.out.println("Contador de hilo propio: " + i);
        }
    }
}
