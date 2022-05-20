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
public class deMirilla2 {
    
      public void mirillaOriginal() {
        Scanner teclado = new Scanner(System.in);
        int a,b,r,s,d,m;
          System.out.println("Ingresa el número a: ");
          a=teclado.nextInt();
          System.out.println("Ingres ael número b: ");
          b=teclado.nextInt();
          r=a-b;
          s=a+b;
          d=a/b;
          m=a*b;
          System.out.println("a - b"+r);
          System.out.println("a + b"+s);
          System.out.println("a / b"+d);
          System.out.println("a * b"+m);
          
    }
    public void mirillaOptimizado() {
        
           Scanner teclado = new Scanner(System.in);
           int a,b,o;
           System.out.println("Ingresa el número a: ");
           a=teclado.nextInt();
           System.out.println("Ingres ael número b: ");
           b=teclado.nextInt();
           System.out.println("1.Restar, 2.Sumar, 3.Dividir, 4.Multiplicar ");
           o=teclado.nextInt();
           
           switch (o){
               case 1:
                   int r=a-b;
                   System.out.println("a - b"+r);
                   break;
               case 2:
                   int s=a+b;
                   System.out.println("a + b"+s);
                   break;
               case 3:
                   int d=a/b;
                   System.out.println("a / b"+d);
                   break;
               case 4:
                   int m=a*b;
                   System.out.println("a * b"+m);
                   break;
               case 5:
                   break;
           }
    }
}
