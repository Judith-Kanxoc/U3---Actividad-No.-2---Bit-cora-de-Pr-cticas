/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema3lya2;

/**
 *
 * @author lourd
 */
public class ciclos3 {
    public void ciclosOriginal() {
       
     for(int i=0; i<5; i++){
         int numeros[]= {15,22,49,68};
         System.out.println("Número en la posicion "+i+": "+numeros[i]);
     }  
       

    }
    public void ciclosOptimizado() {
      
        int numeros[]={15,22,49,68};
         for(int i=0; i<numeros.length; i++){
         System.out.println("Número en la posicion "+i+": "+numeros[i]);
     }  
       
    } 
}
