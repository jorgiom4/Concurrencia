package com.instancia2;

import com.instancia2.hilos.HiloPropio;
import com.instancia2.hilos.HiloRunnable;
import com.instancia2.hilos.ejercicio.Cronometro;

public class Main {

    /**
     * Ejerccio con Concurrencia
     * @param args
     */
    public static void main(String[] args) {

//        HiloPropio hiloPropio = new HiloPropio();
//
//        hiloPropio.start();
//
//        for(int i=0; i<=100; i++){
//            System.out.println("Contador de main: " + i);
//        }

//        HiloRunnable hr = new HiloRunnable();
//        Thread hilo = new Thread(hr);
//
//        hilo.start();



//        Cronometro cr = new Cronometro();
//        Thread hilo = new Thread(cr);
//        hilo.start();


        //Usando sintaxis Lambda
        Runnable Cronometro = () -> {
            int nuMin=0; //Contador de minutos
            int nuSeg=0; //Contador de de segundos
            int nuHora=0; //Contador de Horas
            try {
                for (; ;){
                    if(nuSeg!=59) {
                        nuSeg++;
                    }else{
                        if(nuMin!=59){
                            nuSeg=0;
                            nuMin++;
                        }else{
                            nuHora++;
                            nuMin=0;
                            nuSeg=0;
                        }
                    }
                    System.out.println(String.format("%02d:%02d:%02d",nuHora,nuMin,nuSeg));
                    //System.out.println(nuHora+":"+nuMin+":"+nuSeg);
                    Thread.sleep(1000);
                }//Fin del for infinito
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        };

        Cronometro.run();

    }
}
