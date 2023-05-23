
package models;

import java.util.ArrayList;

/**
 *
 * @author Jess
 */
public class ElementoQuimico {
    private int Masa;
    private int NumeroAtomico;
    private String SimboloAtomico;
    private String nombre;
    private String color;
    public static ArrayList<ElementoQuimico> elementos = new ArrayList<>();
    
    public ElementoQuimico(){
    }
    public ElementoQuimico(int Masa,int NumAtomico, String SimAtomico, String nombre, String color){
        this.Masa = Masa;
        this.NumeroAtomico = NumeroAtomico;
        this.SimboloAtomico = SimboloAtomico;
        this.nombre = nombre;
        this.color =  color;
    }
    public int getMasa() {
        return Masa;
    }

    public void setMasa(int Masa) {
        this.Masa = Masa;
    }

    public int getNumAtomico() {
        return NumeroAtomico;
    }

    public void setNumeroAtomico(int NumeroAtomico) {
        this.NumeroAtomico = NumeroAtomico;
    }

    public String getSimboloAtomico() {
        return SimboloAtomico;
    }

    public void setSimboloAtomico(String SimboloAtomico) {
        this.SimboloAtomico = SimboloAtomico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "elemento {" + "Masa Atomica = " + Masa + ", Numero Atomico = " + NumeroAtomico + ", Simbolo Atomico = " + SimboloAtomico + ", Nombre = " + nombre + ", Color = " + color +'}';
    }
    public static void llenarElementos(){
        insertarElemento((int) 1.00794,1,"H","Hidrogeno","Morado");
        insertarElemento((int) 22.98976,11,"Na","Sodio","Naranja");
        insertarElemento((int) 44.95591,21,"Sc","Escandio","Amarillo-Verde");
        insertarElemento((int) 69.723,31,"Ga","Galio","Amarillo");
        insertarElemento((int) 92.90638,41,"Nb","Niobio","Amarillo-Verde");
        
    }
    public static void insertarElemento(int Masa,int NumeroAtomico, String SimboloAtomico, String nombre, String color){
        elementos.add(new ElementoQuimico(Masa, NumeroAtomico, SimboloAtomico, nombre, color));
    }
    public static void eliminarElemento(int posicion){ 
        elementos.remove(posicion);
    }
    public static void ActualizarElemento(int recNo, int Masa,int NumeroAtomico, String SimboloAtomico, String nombre, String color){
        elementos.get(recNo).setMasa(Masa);
        elementos.get(recNo).setNumeroAtomico(NumeroAtomico);
        elementos.get(recNo).setSimboloAtomico(SimboloAtomico);
        elementos.get(recNo).setNombre(nombre);
        elementos.get(recNo).setColor(color);
    }
    
}
