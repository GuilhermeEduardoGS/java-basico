package edu.guilherme.exercicios.smarttv;

public class Usuario {
    
    public static void main(String [] args) throws Exception{
         
        SmartTV smarttv = new SmartTV();
        
        // Status
        smarttv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smarttv.ligada);
        
        smarttv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smarttv.ligada);
        
        // Volume
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();
        System.out.println("Volume Atual: " + smarttv.volume);

        // Canal
        smarttv.mudarCanal(28);
        System.out.println("Canal Atual: " + smarttv.canal);

        smarttv.aumentarCanal();
        System.out.println("Canal Atual: " + smarttv.canal);

        smarttv.diminuirCanal();
        System.out.println("Canal Atual: " + smarttv.canal);

    }

}
