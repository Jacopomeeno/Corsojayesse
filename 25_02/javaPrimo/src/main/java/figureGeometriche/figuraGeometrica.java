/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author Jacopo Minò
 */
abstract public class figuraGeometrica {
    public String Descrizione;
    
    public figuraGeometrica(String D) {
        Descrizione=D;
    }
    
    public String getDescrizione() {
        return Descrizione;
    }

    
    
    abstract public int getArea();
    abstract public int getPerimetro();
    public static void sommaAree(figuraGeometrica[]f) {
        
    }
    

    @Override
    public String toString() {
        return "figuraGeometrica{" + "Descrizione=" + Descrizione + '}';
    }
}
