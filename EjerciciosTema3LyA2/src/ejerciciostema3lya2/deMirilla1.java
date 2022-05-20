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
public class deMirilla1 {
    
      public void mirillaOriginal() {
        int i = 0;
        String j = "Linea 1";
        while (i < 3)
        {
            i += 1;
            System.out.println(j);
        }
    }
    public void mirillaOptimizado() {
        int i = 0;
        while (i < 3)
        {
            i += 1;
            System.out.println("Hola");
            break;
        }
    }
}
