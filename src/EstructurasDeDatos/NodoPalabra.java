/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;
import ObjetosDeJuego.Palabra;
/**
 *
 * @author ricar
 */
public class NodoPalabra {
    //ATRIBUTOS DE NODO
    private NodoPalabra Siguiente;
    private Palabra palabra;
    
    //CONSTRUCTOR
    public NodoPalabra(Palabra palabra){
        this.palabra = palabra;
        this.Siguiente = null;
    }
    
    //GETTERS Y SETTERS

    public NodoPalabra getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoPalabra Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }
    
}
