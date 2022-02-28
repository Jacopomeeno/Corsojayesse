/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuole;

/**
 *
 * @author Jacopo Minò
 */
public class Scuola {
    private String Nome;
    private String Indirizzo;
    private String Provveditorato;
    
    public Scuola (String N, String I, String P) {
        Nome = N;
        Indirizzo = I;
        Provveditorato = P;
    }
    public String getNomeS() {
        return Nome;
    }
    public String getIndirizzoS() {
        return Indirizzo;
    }
    public String getProvveditorato() {
        return Provveditorato;
    }
    public static void main (String[] args) {
        System.out.println();
    }
}
