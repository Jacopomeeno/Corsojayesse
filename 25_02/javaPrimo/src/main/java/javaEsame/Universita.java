/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEsame;

/**
 *
 * @author Jacopo Minò
 */
public class Universita {
    
    Docente[] lista;
    public Universita() {
        lista= new Docente[]{};
    }
    
    public int etaMinima() {
        int r = 1000;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].eta<r){
                r=lista[i].eta;
            }
        }
        return r;
        }
    
    
    
    public String trovaGiovani() {
        String cr = "";
        
        for (int i = 0; i < lista.length; i++) {
            if (etaMinima()==lista[i].eta) {
                cr += lista[i].cognome;
            }
        }
        return cr;
    }
}