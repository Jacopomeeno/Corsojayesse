/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Jacopo Minò
 */
public class Cliente {
    public static void main(String[] args) {
        Persona p1;
        p1=new Persona("Mario","via Verdi");
        p1.setResidenza("via Rossi");
        System.out.println("la residenza e' "+p1.getResidenza());
        

    }

}