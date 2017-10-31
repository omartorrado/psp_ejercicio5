/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio5;

/**
 *
 * @author otorradomiguez
 */
public class Hilo extends Thread{

    public Hilo(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println("El hilo "+this.getName()+" tiene prioridad "+this.getPriority());
        for(int i=0;i<10;i++){
            System.out.println("Hola, soy el hilo numero "+this.getName());
        }
    }
    
}
