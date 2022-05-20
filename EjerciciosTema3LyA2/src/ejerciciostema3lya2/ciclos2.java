/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema3lya2;

import java.util.Scanner;

/**
 *
 * @author lourd
 */
public class ciclos2 {
     public void ciclosOriginal() {
    
         {
        
     Scanner teclado = new Scanner(System.in);        
     int Numero;
     System.out.println("Introduce Numero por consola");
     Numero = teclado.nextInt();
     System.out.println(Numero);

     while(Numero < 10){
     System.out.println("Introduce Numero por consola");
     Numero = teclado.nextInt();
     System.out.println(Numero);
     
}
    }
         
    }
    public void ciclosOptimizado()  {
        
        Scanner teclado = new Scanner(System.in);        
        int Numero;

        do {
        System.out.println("Introduce Numero por consola");
        Numero = teclado.nextInt();
        System.out.println(Numero);
        } while (Numero < 10);
        
    }
    
}
