/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeriTelefono;
import java.util.*;

/**
 *
 * @author Jacopo Minò
 */
public class Rubrica {
    //public interface List<Contatto> extends Collection<Contatto> { 
    //}
    ArrayList<Contatto> Rubrica1;

    public Rubrica() {
        Rubrica1 = new ArrayList();
    }
   
    
    public void aggiungiContatto (String N, String C, String NDT) {
        Contatto cn;
        cn = new Contatto(N,C,NDT);
        Rubrica1.add(cn);
    }
    
    public void rimuoviContatto (String N, String C) {
        Contatto cn;
        cn = new Contatto(N,C,null);
        Iterator<Contatto> it = Rubrica1.iterator();
        while (it.hasNext()) {
            Contatto i = it.next();
            if (cn.Nome.equals(i.Nome)&&cn.Cognome.equals(i.Cognome)) {
                Rubrica1.remove(i);
            }
        }
        Rubrica1.remove(cn);
    }
    
    public String trovaNumero(String N, String C) {
        Iterator<Contatto> it = Rubrica1.iterator();
        Contatto cn;
        String cv;
        cv = "";
        cn = new Contatto (N,C,null);
        while (it.hasNext()) {
            Contatto i = it.next();
            if (cn.Nome.equals(i.Nome)&&cn.Cognome.equals(i.Cognome)){
                cv = i.getNumeroDiTelefono();
            } else {System.out.println("Contatto non presente");}
        }
        return cv;
    }
    
    
    public static void main (String[] args) {
        Rubrica Rubrica2;
        Rubrica2 = new Rubrica();
        Rubrica2.aggiungiContatto("Sergio","Rossi","06233123");
        Rubrica2.aggiungiContatto ("Riccardo","Bianchi","06384858");
        Rubrica2.aggiungiContatto("Tiziano", "Bruni", "06458945");
        Rubrica2.aggiungiContatto("Giorgio","Ricci","06123838");
        System.out.println(Rubrica2.trovaNumero("Giorgio","Ricci"));
    }
}
