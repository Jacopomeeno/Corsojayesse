/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio1;

/**
 *
 * @author Jacopo Minò
 */
public class Rettangolo {
    private int Altezza;
    private int Larghezza;
    
    public Rettangolo(int x, int y ){
        Altezza = x;
        Larghezza = y;
    }
    public int getAltezza() {
        return Altezza;
    }
    public int getLarghezza() {
        return Larghezza;
    }
    public int getArea() {
        return Altezza*Larghezza;
    }
    public static void main(String[] args) {
        Rettangolo r1;
        r1=new Rettangolo (4,5);
        r1.getAltezza();
        r1.getLarghezza();
        System.out.println("l'altezza e' "+r1.getAltezza());
        System.out.println("La larghezza e' "+r1.getLarghezza());
        System.out.println("l'area e' "+r1.getArea());
    }
}
