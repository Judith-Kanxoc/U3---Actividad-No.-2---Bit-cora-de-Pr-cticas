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
public class globales2 {
    
    public void globalesOriginal() {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.println("primer número");
        n1=teclado.nextInt();
        System.out.println("segundo número");
        n2=teclado.nextInt();
        
        System.out.println(Suma(n1,n2));
        System.out.println(Resta(n1,n2));
        System.out.println(Multiplicacion(n1,n2));
        System.out.println(Division(n1,n2));
        }
        public static int Suma(int n1, int n2){
            int suma = n1+n2;
            return suma;
            }
        public static int Resta(int n1, int n2){
            int resta = n1-n2;
            return resta;
            }
        public static int Multiplicacion(int n1, int n2){
            int multiplicacion = n1*n2;
            return multiplicacion;
            }
        public static int Division(int n1, int n2){
            int division = n1/n2;
            return division;
            }
        
        
    public void globalesOptimizado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("primer número");
        n1=teclado.nextInt();
        System.out.println("segundo número");
        n2=teclado.nextInt();
        
        System.out.println(Suma());
        System.out.println(Resta());
        System.out.println(Multiplicacion());
        System.out.println(Division());  
    }
       public static int Suma(){
            int suma = n1+n2;
            return suma;
            }
        public static int Resta(){
            int resta = n1-n2;
            return resta;
            }
        public static int Multiplicacion(){
            int multiplicacion = n1*n2;
            return multiplicacion;
            }
        public static int Division(){
            int division = n1/n2;
            return division;
            } 
       static int n1;
       static int n2;
}
