/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class productor extends Thread {
    
    private PilaLenta lapila;
    
    public void producir()
    {
        Random numAleatorio = new Random();

        numAleatorio.setSeed(System.currentTimeMillis());
        
        int aleatorio; 
        
        for (int i = 0; i < 10; i++) {
            aleatorio = numAleatorio.nextInt(100);
            try {
                lapila.Apila(aleatorio);
                System.out.println("Apilo: " + aleatorio);
            } catch (Exception ex) {
                Logger.getLogger(productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public productor(PilaLenta lapila) {
        this.lapila = lapila;
    }
    
    @Override
    public void run(){
        this.producir();
    }
    
}
