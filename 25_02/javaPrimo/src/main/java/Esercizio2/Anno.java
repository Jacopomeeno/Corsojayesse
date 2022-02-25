/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio2;
/**
 *
 * @author Jacopo Minò
 */
public class Anno {
    public static void main (String[] args) {
        int anno = 1917;
        if (anno%4==0&&anno%100!=0){
            System.out.println("Bisestile");
        }
        else {
        System.out.println("non bisestile");
    }
    }
}