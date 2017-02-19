/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd_201503476;
import Interfaz_GUI.MenuPrincipal;
import ObjetosDeJuego.XML_READER;
import EstructurasDeDatos.ListaPalabras;
/**
 *
 * @author ricar
 */
public class Practica1_EDD_201503476 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRUEBA LECTURA XML
        //XML_READER xml = new XML_READER();
        /*
        xml.leemeElXML("C:\\Users\\ricar\\Documents\\EJEMPLOS\\xml\\XML_PRUEBA.xml");
        ListaPalabras list = xml.getListaP();
        System.out.println(list.showList());*/
        //System.out.println(xml.getListaCasillas().showList());
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
    }
    
}
