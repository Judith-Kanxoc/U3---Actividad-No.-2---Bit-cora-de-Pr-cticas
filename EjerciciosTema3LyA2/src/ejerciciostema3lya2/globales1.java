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
public class globales1 {
    
    public void globalesOriginal() {
        
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.println("Radio del circulo");
        radio=teclado.nextInt();
        System.out.println(Area(radio));
        System.out.println(Perimetro(radio));
        }
        public static double Area(double radio){
            double pi = 3.1415;
            double area;
            area = pi*(radio*radio);
            return area;
        }
        public static double Perimetro(double radio){
            double pi = 3.1415;
            double perimetro;
            perimetro = (2*pi*radio);
            return perimetro;
        }
    
    public void globalesOptimizado() {
       
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.println("Radio del circulo");
        radio= teclado.nextInt();
        
        System.out.println(Area());
        System.out.println(Perimetro());

    }
      public static double Area(){
            double area;
            area = pi*(radio*radio);
            return area;
        }
         public static double Perimetro(){
            double perimetro;
            perimetro = (2*pi*radio);
            return perimetro;
        }
         
        static double radio;
        static double pi=3.1416;    
}

