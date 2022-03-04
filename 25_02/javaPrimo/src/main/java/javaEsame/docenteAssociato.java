/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEsame;

/**
 *
 * @author Jacopo Minò
 */
public class docenteAssociato extends Docente {
    public int votoDiDottorato;
    Contratti[] listaContratti;
    
    public docenteAssociato(String n, String cn, String cd, int e, int v, Contratti[] c) {
        super(n, cn, cd, e);
        votoDiDottorato = v;
        listaContratti = c;
    }
    
    
    
}
