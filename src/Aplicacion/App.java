/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.Recurso;
import Modelo.Sumador;
import Vista.CanvasPila;
import Vista.ContadoresApp;
import Vista.MiCanvas;
import Vista.PilaFrame;
import java.awt.Color;

/**
 *
 * @author usuario
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Thread h[] = new Thread[3];
        
        for (int i = 0; i < 3; i++) {
            
            h[i] = new Sumador(r,i);
            
        }*/
        
        /*int alto = 400; int ancho = 600;
        
        ContadoresApp MiContador = new ContadoresApp();
        
        
        
        MiCanvas cv = new MiCanvas(ancho, alto);
        Recurso r = new Recurso(cv);
        
        MiContador.setTitle("Mi App");
        
        MiContador.add(cv);
        
        MiContador.setSize(ancho, alto);
        MiContador.setBackground(Color.DARK_GRAY);
        MiContador.setVisible(true);
        
        
        
        Sumador h1 = new Sumador(r,0);
        Sumador h2 = new Sumador(r,1);
        Sumador h3 = new Sumador(r,1);
        
        h1.start();
        h2.start();
        h3.start();*/
        
        CanvasPila cv = new CanvasPila(4);
        
        PilaFrame Ventana = new PilaFrame();
        
        Ventana.setSize(1024,768);
        
        
        //cv.paint(g);
        //cv.avisa("Pila Llena");
        Ventana.add(cv);
        Ventana.setVisible(true);
        cv.avisa("Pila Llena");
        
        
        
        
        
    }
    
}
