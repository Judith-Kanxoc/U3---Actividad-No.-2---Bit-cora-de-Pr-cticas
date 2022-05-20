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
public class Locales3 {
    public void localOriginal() {
        int i;
        i = 3 + 2;
        System.out.println(i);
    }
    
    

    public void localOptimizado() {
        int i = 3;
        int j = i + 2;
        System.out.println(j);
    }
}
