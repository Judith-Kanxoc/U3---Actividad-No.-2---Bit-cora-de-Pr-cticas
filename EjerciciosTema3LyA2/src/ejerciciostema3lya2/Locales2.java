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
public class Locales2 {
    public void localOriginal() {
        int a = 3;
        int b = 2;
        int c = 1;
        int d = a + c;
        double e = b / (c + a);
        double x = a + c + (b / (c + a));
        System.out.println(x);
    }
    public void localOptimizado() {
        int a = 3, b = 2, c = 1;
        int d = a + c;
        double e = b / d;
        double x = d + e;
        System.out.println(x);
    }
}
