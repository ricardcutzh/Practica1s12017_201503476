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
public class NodoMatriz {
    String posi;
    Casilla casilla;
    NodoMatriz arriba;
    NodoMatriz abajo;
    NodoMatriz siguiente;
    NodoMatriz anterior;
    
    public NodoMatriz(Casilla casilla){
        arriba = null;
        abajo = null;
        siguiente = null;
        anterior = null;
    }
    
    public NodoMatriz(){
        
    }
    
    public NodoMatriz(String posi){
        this.posi = posi;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public NodoMatriz getArriba() {
        return arriba;
    }

    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    public NodoMatriz getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }

    public NodoMatriz getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMatriz siguiente) {
        this.siguiente = siguiente;
    }

    public NodoMatriz getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoMatriz anterior) {
        this.anterior = anterior;
    }
    
    
}
