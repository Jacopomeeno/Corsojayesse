/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author Jacopo Minò
 */
public class Rettangoli extends figuraGeometrica {
    final public int base;
    final public int altezza;
    
    public Rettangoli (int b, int a, String D) {
        super (D);
        base=b;
        altezza=a;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setDescrizione(String Descrizione) {
        this.Descrizione = Descrizione;
    }
    @Override
    public int getPerimetro(){
        return base+altezza;
    }
    @Override public int getArea(){
        return base*altezza;
    }

    @Override
    public String toString() {
        return "Rettangoli{" + "base=" + base + ", altezza=" + altezza + '}';
    }
    
}
