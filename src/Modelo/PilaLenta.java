/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.CanvasPila;

/**
 *
 * @author usuario
 */
public class PilaLenta implements IPila {

    private int cima;
    private int capacidad;
    private int numelementos;
    private Object[] datos;
    private CanvasPila canvas;

    public PilaLenta(int capacidad, CanvasPila elcanvas) {
        this.capacidad = capacidad;
        this.datos = new Object[this.capacidad];
        this.cima = 0;
        this.numelementos = 0;
        this.canvas = elcanvas;
    }

    @Override
    public int GetNum() {
        return numelementos;
    }

    /**
     *
     * @param elemento
     * @throws Exception
     */
    @Override
    public synchronized void Apila(Object elemento) throws java.lang.Exception {
        if (!this.pilallena()) {
            Thread.sleep(100);
            this.datos[this.cima] = elemento;
            Thread.sleep(100);
            this.cima++;
            Thread.sleep(100);
            this.numelementos++;
        } else {
            throw new java.lang.Exception("Pila llena");
        }

    }

    /**
     *
     * @return @throws java.lang.Exception
     */
    @Override
    public synchronized Object Desapila() throws java.lang.Exception {

        if (!this.pilavacia()) {
            Thread.sleep(100);
            this.numelementos--;
            Thread.sleep(100);
            this.cima--;
            Thread.sleep(100);
            return this.datos[this.cima];
        } else {
            throw new java.lang.Exception("La pila esta vacia");
        }

    }

    @Override
    public Object Primero() throws java.lang.Exception {
        if (!this.pilavacia()) {
            return this.datos[0];
        } else {
            throw new java.lang.Exception("La pila esta vacia");
        }
    }

    private boolean pilavacia() {
        return this.numelementos == 0;
    }

    private boolean pilallena() {
        return this.numelementos == this.capacidad;
    }

}
