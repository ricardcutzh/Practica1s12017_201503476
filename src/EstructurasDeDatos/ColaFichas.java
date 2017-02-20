/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

/**
 *
 * @author ricar
 */
public class ColaFichas {
    //Atributos
    NodoFicha cabeza;
    NodoFicha ultimo;
    
    //Constructor
    public ColaFichas(){
        this.cabeza = null;
        this.ultimo = null;
    }
    
    //Meter datos a la cola
    public void encolar(NodoFicha nuevo){
        if(isEmpty()){
            this.cabeza = nuevo;
            this.ultimo = nuevo;
        }
        else{
            ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    //Sacar datos de la cola
    public NodoFicha desencolar(){
        NodoFicha aux = this.cabeza;
        if(!isEmpty() && Count()!=1){
           this.cabeza = this.cabeza.getSiguiente();
           return aux; 
        }
        else{
            this.cabeza = this.ultimo = null;
            return aux;
        }
    }
    
    public String showCola(){
        String retorno = "";
        if(!isEmpty()){
            NodoFicha aux = this.cabeza;
            while(aux!=null){
                retorno = retorno+"| "+aux.getFicha().getLetra()+" |";
                aux = aux.getSiguiente();
            }
        }
        else{
            retorno = "COLA VACÍA";
        }
        return retorno;
    }
    
    public int Count(){
        int contador = 0;
        NodoFicha aux = this.cabeza;
        while(aux!=null){
            aux = aux.getSiguiente();
            contador++;
        }
        return contador;
    }
    
    //verificar si la cola está vacía
    public boolean isEmpty(){
        return this.cabeza==null;
    }
}
