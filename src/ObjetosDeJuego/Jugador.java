/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDeJuego;

import EstructurasDeDatos.ListaFichasJugador;
/**
 *
 * @author ricar
 */
public class Jugador {
    
    //Atributos JUGADOR
    private String N_Usuario;
    private ListaFichasJugador fichasDeJugador;
    //FIN ATRIBUTOS
    
    //Constructor
    public Jugador(String Nombre, ListaFichasJugador fichasPl){
        this.N_Usuario = Nombre;
        this.fichasDeJugador = fichasPl;
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
