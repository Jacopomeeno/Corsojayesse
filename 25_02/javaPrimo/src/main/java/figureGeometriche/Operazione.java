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
    public static void main (String[] args) {
        
    Quadrati Q;
    Q = new Quadrati (5,5,"Quadrato");
    Rettangoli R;
    R = new Rettangoli (4,8,"Rettangolo");
    Cerchi C;
    C = new Cerchi (6,5,"Cerchio");
    Ellissi E;
    E = new Ellissi(8,5,"Ellisse");
    Triangoli T;
    T = new Triangoli (5,5,3,"Triangolo");
    figuraGeometrica[] f= {Q,R,C,E,T};
    int a=0;
        for (int i = 0; i < f.length; i++) {
            a+=f[i].getArea();
            System.out.println(a);
        }
}
}
