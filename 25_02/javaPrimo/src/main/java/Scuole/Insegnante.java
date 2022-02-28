/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuole;

/**
 *
 * @author Jacopo Minò
 */
public class Insegnante {
    public String Nome;
    public String Cognome;
    public String annoVincita;
    public String Scuola;
    
    public Insegnante (String N, String C, String aV, String S) {
    Nome = N;
    Cognome = C;
    annoVincita = aV;
    Scuola = S;
}
    public String getNomeI() {
        return Nome;
    }
    public String getCognomeI() {
        return Cognome;
    }
    public String getAnnoVincita() {
        return annoVincita;
    }
    public String getScuola() {
        return Scuola;
    }
    public void setScuola(String nuovaScuola) {
        Scuola = nuovaScuola;
    }
    public static void main (String [] args) {
        Insegnante I1;
        I1 = new Insegnante ("Antonio","Rossi","1994","Newton");
        Insegnante I2;
        I2 = new Insegnante ("Matteo","Fedeli","2001","Machiavelli");
        Insegnante I3;
        I3 = new Insegnante ("Damiano","Bianchi","1991", "Einstein");
        Insegnante[] Maestri;
        Maestri = new Insegnante[3];
        Maestri [0] = I1;
        Maestri [1] = I2;
        Maestri [2] = I3;
        System.out.println();
    }    
}
