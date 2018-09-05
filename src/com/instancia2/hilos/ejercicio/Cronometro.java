package com.instancia2.hilos.ejercicio;

public class Cronometro implements Runnable {
    @Override
    public void run() {

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
    }
}

