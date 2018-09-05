package com.instancia2.hilos;

/**
 * Creacion de un hilo haciendo uso del interface Runnable
 */
public class HiloRunnable implements Runnable {

    @Override
    public void run() {

        for(int i=0; i<=20; i++){
            System.out.println("Se ejecuta el hilo: " + Thread.currentThread().getName() + " vuela numero: " + i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }

        }

    }
}
