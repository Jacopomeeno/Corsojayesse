/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ristorante;
import java.util.*;

/**
 *
 * @author Jacopo Minò
 */
public class Tavoli {
    public int id;
    public int coperti;
    public Menù consumazione;
    
    public Tavoli (int i, int c, Menù m) {
        id=i;
        coperti=c;
        consumazione=m;
    }

    public int getId() {
        return id;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }
    
    private ArrayList Sala;
    
}
