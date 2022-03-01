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
public class Ellissi extends figuraGeometrica {
    final public int semiasseM;
    final public int semiassem;
    
    public Ellissi (int M, int m, String D) {
        super(D);
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
    @Override public int getPerimetro(){
        return (int) Math.sqrt((Math.pow(semiasseM,2)+Math.pow(semiassem, 2))/2);
    }
    
    @Override public int getArea(){
        return (int) (semiasseM*semiassem*Math.PI);
    }

    @Override
    public String toString() {
        return "Ellissi{" + "semiasseM=" + semiasseM + ", semiassem=" + semiassem + '}';
    }
    
}
