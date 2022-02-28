/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuole;

/**
 *
 * @author Jacopo Minò
 */
public class Classe {
    private String Scuola;
    private String Nome;
    public Insegnante Maestri[];
    public int numAlunni;

    public Classe(String S, String N, Insegnante Maestri[], int nA) {
        Scuola = S;
        Nome = N;
        numAlunni = nA;
    }
    public String getNome() {
        return Nome;
    }
    public String getScuola() {
        return Scuola;
    }
    public Insegnante[] getInsegnanti() {
        return Maestri;
    }
    public int getNumAlunni() {
        return numAlunni;
    }
    public void inserisciInsegnanti(int Posizione, Insegnante i) {
        Maestri[Posizione] = i;
    }
    public static void main (String[] args) {
        System.out.println();
    }
}
