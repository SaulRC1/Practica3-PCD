/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class consumidor implements Runnable{
    
    private PilaLenta lapila;

    public consumidor(PilaLenta P) {
        this.lapila = P;
    }
    
    public void consumir()
    {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Desapilo: " + lapila.Desapila());
            } catch (Exception ex) {
                Logger.getLogger(consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run(){
        this.consumir();
    }
    
    
    
}
