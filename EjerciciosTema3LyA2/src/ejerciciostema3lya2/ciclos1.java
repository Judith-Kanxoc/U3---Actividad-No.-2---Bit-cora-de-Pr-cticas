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
public class ciclos1 {
    
    public void ciclosOriginal() {
        
        int x =0;
        while(x<=10){
            System.out.println("El número es " + x);
            x++;
        }
             
        
    }
    public void ciclosOptimizado() {
        for(int x=0; x<=10; x++){
        System.out.println("El número es " + x);
        }
}
}
