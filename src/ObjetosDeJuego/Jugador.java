/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDeJuego;

/**
 *
 * @author ricar
 */
public class Jugador {
    
    //Atributos del Objeto
    private String N_Usuario;
    //FIN ATRIBUTOS
    
    //Constructor
    public Jugador(String Nombre){
        this.N_Usuario = Nombre;
    }
    
    //GETTER DEL NOMBRE DE USUARIO
    public void setUsuario(String user){
        this.N_Usuario = user;
    }
    //SETTER DEL NOMBRE DE USUARIO
    public String getUsuario(){
        return this.N_Usuario;
    }
}
