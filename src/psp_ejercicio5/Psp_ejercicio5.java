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
        //Java hace lo que le da la gana con las prioridades, con lo que el resultado
        //cambia en cada ejecucion
        h1.setPriority(MIN_PRIORITY);
        h2.setPriority(MAX_PRIORITY);        
        h2.start();
        try {
            //Si usamos el join() si sale siempre el resultado esperado, aunque cambiemos las prioridades
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Psp_ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        h1.start();
    }
    
}
