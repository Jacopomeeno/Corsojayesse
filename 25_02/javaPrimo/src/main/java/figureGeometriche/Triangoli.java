/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author Jacopo Minò
 */
public class Triangoli extends figuraGeometrica {
    final public int latoA;
    final public int latoB;
    final public int latoC;
    
    public Triangoli (int A, int B, int C, String D) {
        super (D);
        latoA=A;
        latoB=B;
        latoC=C;
    }

    public int getLatoA() {
        return latoA;
    }

    public int getLatoB() {
        return latoB;
    }

    public int getLatoC() {
        return latoC;
    }

    public void setDescrizione(String Descrizione) {
        this.Descrizione = Descrizione;
    }
    
    @Override public int getPerimetro() {
        return latoA+latoB+latoC;
    }
    @Override
    public int getArea() {
        return (int) java.lang.Math.sqrt((latoA+latoB+latoC)/2*(latoB+latoC)/2*(latoA+latoC)/2*(latoA+latoB)*2);
    }
    
}
