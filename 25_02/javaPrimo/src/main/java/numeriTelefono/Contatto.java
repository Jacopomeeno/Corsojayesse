/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeriTelefono;

/**
 *
 * @author Jacopo Minò
 */
public class Contatto {
    public String Nome;
    public String Cognome;
    public String numeroDiTelefono;
    
    public Contatto (String N, String C, String NDT) {
        Nome = N;
        Cognome = C;
        numeroDiTelefono = NDT;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    @Override
    public String toString() {
        return "Contatto{" + "Nome=" + Nome + ", Cognome=" + Cognome + ", numeroDiTelefono=" + numeroDiTelefono + '}';
    }
    
}
