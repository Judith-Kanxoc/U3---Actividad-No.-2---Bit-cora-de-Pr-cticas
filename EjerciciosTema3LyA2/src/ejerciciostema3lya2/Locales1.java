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

public class Locales1 {
    public void localOriginal() {
        int resta = 1 - 2;
        int x = 1;
        int y = 2;
        int b = 5;
        double c = ((x - y) + b) / 2;
        System.out.println(c);
    }
    
    
    public void localOptimizado() {
        int x = 1;
        int y = 2;
        int a = x - y;
        int b = 5;
        double c = (a + b) / 2;
        System.out.println(c);
    }
    
}
