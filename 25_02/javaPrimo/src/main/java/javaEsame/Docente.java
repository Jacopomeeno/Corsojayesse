/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEsame;

/**
 *
 * @author Jacopo Minò
 */
public class Docente {
    public String nome;
    public String cognome;
    public String codice;
    public int eta;
    
    public Docente (String n, String cn, String cd, int e) {
        nome=n;
        cognome=cn;
        codice=cd;
        eta=e;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodice() {
        return codice;
    }

    public int getEta() {
        return eta;
    }
    
}
