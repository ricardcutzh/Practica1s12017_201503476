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
public class ListaPalabras {
    //ATRIBUTOS LISTAS
    NodoPalabra cabeza;
    NodoPalabra ultimo;
    
    //CONSTRUCTOR DE LISTA
    public ListaPalabras(){
        this.cabeza = null;
        this.ultimo = null;
    }
    
    //METODOS DE LISTA
    
    private boolean isEmpty(){
        return this.cabeza==null;
    }//VALIDA SI LISTA ESTA VACÍA
    
    public void insertarEnLista(NodoPalabra nuevo){
        if(isEmpty()){
            this.cabeza = nuevo;
            this.ultimo = nuevo;
        }
        else{
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }//INSERTAR A LISTA
    
    public int Count(){
        if(isEmpty()){
            return 0;
        }
        else{
            NodoPalabra aux = this.cabeza;
            int contador = 0;
            while(aux!=null){
                aux = aux.getSiguiente();
                contador++;
            }
            return contador;
        }
    } //CUENTA LOS ELEMENTOS DE LA LISTA
    
    public String showList(){
        if(isEmpty()){
            return "Lista de Palabras Vacia";
        }
        else{
            NodoPalabra aux = this.cabeza;
            String lista = "";
            while(aux!=null){
                lista =lista+ "| "+aux.getPalabra().getValor()+" |---->";
                aux = aux.getSiguiente();
            }
            return lista;
        }
    } //DEVUELVE UN STRING CON LOS ELEMENTOS EN LISTA
    
}
