/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;
import java.lang.Math.*;

/**
 *
 * @author Jacopo Minò
 */
public class Cerchi extends figuraGeometrica {
    final public int semiasseM;
    final public int semiassem;
    
    public Cerchi (int M, int m, String D) {
        super (D);
        semiasseM=M;
        semiassem=m;
    }

    public int getSemiasseM() {
        return semiasseM;
    }

    public int getSemiassem() {
        return semiassem;
    }

    public void setDescrizione(String Descrizione) {
        this.Descrizione = Descrizione;
    }
    
    @Override public int getPerimetro() {
        return (int) (Math.PI*2)*semiasseM;
    }
    
    @Override public int getArea() {
        return (int) (Math.PI)*semiasseM*semiassem;
    }
    
}
