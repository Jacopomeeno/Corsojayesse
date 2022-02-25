/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Jacopo Minò
 */
public class Persona {
    private String Nome;
    private String Residenza;
    
    public Persona(String x, String y){
        Nome = x;
        Residenza = y;
    }

    public String getNome(){
    return Nome;
}
public String getResidenza() {
    return Residenza;
}
public void setResidenza (String nuovaResidenza) {
    Residenza = nuovaResidenza;
}
}


