/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author Jacopo Minò
 */
public class Cliente1 {
    
    public void verniciatura (Macchina auto, String cn) {
        auto.setColore(cn);    
    }
    
    
    
    public static Macchina immatricola (String targaNuova) {
        
        Macchina m1;
        m1 = new Macchina (targaNuova, "Ferrari", "Giallo", null);
        
        return m1;
    }
    
    public static void main (String[] args) {
        Scanner S1=new Scanner(System.in);
        Macchina m2;
        m2 = new Macchina ("saisjai", "Ferrari", "Giallo", null);
        System.out.println(m2.toString());
        System.out.println("Inserisci nuovo colore: ");
        m2.setColore(S1.next());
        System.out.println(m2.toString());
        Macchina m3 = immatricola("sisisaijcjio");
        System.out.println(m3.toString());
        
    }
}
