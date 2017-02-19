/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;
import ObjetosDeJuego.Casilla;
/**
 *
 * @author ricar
 */
public class NodoCasilla {
    NodoCasilla siguiente;
    Casilla casilla;
    
    public NodoCasilla(Casilla casilla){
        this.casilla = casilla;
    }

    public NodoCasilla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCasilla siguiente) {
        this.siguiente = siguiente;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
}
