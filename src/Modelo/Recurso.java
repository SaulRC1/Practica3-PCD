/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.MiCanvas;

/**
 *
 * @author usuario
 */
public class Recurso {
    
    private int[] contadores = {0,0};
    private MiCanvas cv;
    
    
    public Recurso(MiCanvas cv){
        this.cv = cv;
    }
    
    /**
     * 
     * @param contador
     * @throws IndexOutOfBoundsException 
     */
    public synchronized void incrementa(int contador) throws IndexOutOfBoundsException {
        contadores[contador]++;
        System.out.println("Contador 0: " + contadores[0] + "Contador 1: " + contadores[1]);
        cv.actualiza(contadores);
    }
    
}
