/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;
import ObjetosDeJuego.Ficha;

/**
 *
 * @author ricar
 */
public class ListaFichasJugador {
    NodoFicha cabeza;
    NodoFicha ultimo;
    public ListaFichasJugador(){
           cabeza = null;
           ultimo = null;
    }
    
    //METER A COLAR
    public void Insertar(NodoFicha nuevo){
        if(isEmpty()){
            cabeza = nuevo;
            ultimo = nuevo;
            this.cabeza.setSiguiente(ultimo);
        }
        else{
            ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    public Ficha  obtenerFicha(int index){
        Ficha retorno = null;
        int contador=1;
        if(!isEmpty() && index>1 && index<= Count()){
            NodoFicha aux1 = this.cabeza;
            NodoFicha aux2 = this.cabeza.getSiguiente();
            while(index!=contador){
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();
            }
            retorno = aux2.getFicha();
            aux1.getSiguiente().setSiguiente(aux1.getSiguiente().getSiguiente());
            aux2.setSiguiente(null);
        }
        else{
            if(!isEmpty() && index<=1){
                if(index == 0){
                    retorno = this.cabeza.getFicha();
                    this.cabeza = null;
                }
                if(index == 1){
                    retorno = this.cabeza.getSiguiente().getFicha();
                    this.cabeza.setSiguiente(this.cabeza.getSiguiente().getSiguiente());
                }
            }
        }
        return retorno;
    }
    public String textoParaDot(){
        int contador = 1;
        int temp = 0;
        String dot = "";
        if(!isEmpty()){
            NodoFicha aux = this.cabeza;
            dot= "digraph G {";
            while(aux.getSiguiente()!=null){
                temp = contador+1;
                dot = dot+"Ficha_"+contador+"_"+aux.getFicha().getLetra()+"-> Ficha_"+temp+"_"+aux.getSiguiente().getFicha().getLetra()+";\n";
                aux = aux.getSiguiente();
                contador++;
            }
            dot = dot+"}";
        }
        return dot;
    }
    //SI ESTA VACÍA
    public boolean isEmpty(){
        return cabeza ==null;
    }
    
    public int Count(){
        if(isEmpty()){
            return 0;
        }
        else{
            int contador=0;
            NodoFicha aux = this.cabeza;
            while(aux!=null){
              aux = aux.getSiguiente();
              contador++;
            }
            return contador;
        }
    }
}
