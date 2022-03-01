/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;
import java.lang.*;

/**
 *
 * @author Jacopo Minò
 */
public class Operazione {
    Quadrati Q;
    figuraGeometrica[] f= {}
    
        
    }
    
    public static int sommaAree(figuraGeometrica[] f) {
        int a=0;
        for (int i = 0; i < f.length; i++) {
            a+=f[i].getArea();
        }
        return a;
    }
}
