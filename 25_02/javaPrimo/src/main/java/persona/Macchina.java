/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Jacopo Minò
 */
public class Macchina {
    private String Targa;
    private String Modello;
    public String Colore;
    public Persona Proprietario;
    
    public Macchina(String t, String m, String c, Persona p) {
       Targa = t;
       Modello = m;
       Colore = c;
       Proprietario = p;
    }
    
    public String getTarga () {
        return "La Targa e': " + Targa;
    }
    
    public String getModello() {
        return "La macchina e' un/una: " + Modello;
    }
    
    public String getColore() {
        return "di colore: " + Colore;
    }
    
    public Persona getProprietario() {
        return Proprietario;
    }
    
    public void setColore (String nuovoColore) {
        Colore = nuovoColore;
    }
    
    public void setProprietario (Persona nuovoProprietario) {
        Proprietario = nuovoProprietario;
    }

    @Override
    public String toString() {
        return "Macchina{" + "Targa=" + Targa + ", Modello=" + Modello + ", Colore=" + Colore + ", Proprietario=" + Proprietario + '}';
    }
    
}