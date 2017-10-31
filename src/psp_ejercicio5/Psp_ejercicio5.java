/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio5;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class Psp_ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo h1=new Hilo("1");
        Hilo h2=new Hilo("2");
        Hilo h3=new Hilo("3");
        //Java hace lo que le da la gana con las prioridades
        h1.setPriority(MAX_PRIORITY);
        h2.setPriority(MIN_PRIORITY);
        
        h2.start();
        
        try {
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Psp_ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        h3.start();
        h1.start();
    }
    
}
