/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio2;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author Jacopo Minò
 */
public class Maiuscola {
    public static void main(String[] args) {
        String Parola="tavolo";
        for (int i = 0; i < Parola.length(); i++) {
            if (i%2==0) {
                System.out.println(Character.toUpperCase(Parola.charAt(i)));
            }
                else {
            System.out.println(Parola.charAt(i));
        }
    }

    
}

    
    }
