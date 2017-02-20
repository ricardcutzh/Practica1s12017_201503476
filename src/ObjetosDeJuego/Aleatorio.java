/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDeJuego;
import java.util.Random;

/**
 *
 * @author ricar
 */

import EstructurasDeDatos.*;
import java.util.ArrayList;

public class Aleatorio {
    
    ColaFichas fichas = new ColaFichas();
    ArrayList lista = new ArrayList();//SOLO PARA TENER MIS VALORES METIDOS INICIALMENTE, DESPUES LOS AGREGARE ALEATORIAMENTE A LA COLA
    public Aleatorio(){
        //CONSTRUCTOR POR DEFECTO
        for(int i = 0; i<12; i++){
            lista.add(new Ficha("A",1));
            lista.add(new Ficha("E",1));
        }
        for(int i = 0; i<9; i++){
            lista.add(new Ficha("O",1));
        }
        for(int i = 0; i<6; i++){
            lista.add(new Ficha("I",1));
            lista.add(new Ficha("S",1));
        }
        for(int i = 0; i<5; i++){
            lista.add(new Ficha("N",1));
            lista.add(new Ficha("R",1));
            lista.add(new Ficha("U",1));
            lista.add(new Ficha("D",2));
        }
        for(int i = 0; i<4; i++){
            lista.add(new Ficha("L",1));
            lista.add(new Ficha("T",1));
            lista.add(new Ficha("C",3));
        }
        for(int i = 0; i<2; i++){
            lista.add(new Ficha("G",2));
            lista.add(new Ficha("B",3));
            lista.add(new Ficha("M",3));
            lista.add(new Ficha("P",3));
            lista.add(new Ficha("H",4));
        }
        lista.add(new Ficha("F",4));
        lista.add(new Ficha("V",4));
        lista.add(new Ficha("Y",4));
        lista.add(new Ficha("Q",5));
        lista.add(new Ficha("J",8));
        lista.add(new Ficha("Ñ",8));
        lista.add(new Ficha("X",8));
        lista.add(new Ficha("Y",10));  
    }
    
    public void meterFichasACola(){
        Random r = new Random();
        while(!lista.isEmpty()){
            int index = r.nextInt(lista.size());
            Ficha nueva =(Ficha) lista.get(index);
            fichas.encolar(new NodoFicha(nueva));
            lista.remove(index);   
        }
    }

    public ColaFichas getFichas() {
        return fichas;
    }

   

    
    
    
    
    
    
    
}
