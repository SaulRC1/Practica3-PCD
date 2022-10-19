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
public class Sumador extends Thread {
    
    private Recurso r;
    private int contador;

    public Sumador(Recurso r, int i) {
        
        this.r = r;
        this.contador = i;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 1000; i++) {
            
            r.incrementa(this.contador);
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sumador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
