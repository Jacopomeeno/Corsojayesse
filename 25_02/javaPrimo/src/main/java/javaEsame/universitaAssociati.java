/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEsame;

/**
 *
 * @author Jacopo Minò
 */
public class universitaAssociati extends Universita {
    docenteAssociato[] listaAs;
    
    public universitaAssociati() {
        listaAs = new docenteAssociato[]{};
    }
    
    public int sommaAnni(docenteAssociato a) {
        int b = 0;
        for (int i = 0; i < a.listaContratti.length ; i++) {
            b += a.listaContratti[i].durataContrattoLavoro;
        }
        return b;
    }
    
    public docenteAssociato bestRicercatore() {
        int v= 0;
        int r = 0;
        int e = 1000;
        docenteAssociato b = null;
        for (int i = 0; i < listaAs.length; i++) {
            if (listaAs[i].votoDiDottorato>=v) {
                v = listaAs[i].votoDiDottorato;
                b = listaAs[i];
                if (sommaAnni(listaAs[i])>=r) {
                    r = sommaAnni(listaAs[i]);
                    b = listaAs[i];
                    if (listaAs[i].eta<=e) {
                        e = listaAs[i].eta;
                        b = listaAs[i];
                    }
                }
            }
        }
        return b;
    }
}
