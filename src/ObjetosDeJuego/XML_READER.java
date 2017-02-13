/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDeJuego;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import EstructurasDeDatos.*;
/**
 *
 * @author ricar
 */
public class XML_READER {
    //Atributos
    ListaPalabras listaP = new ListaPalabras();
    
    //CONSTRUCTOR
    
     public XML_READER(){
         
     }
     
     //METODO PRINCIPAL
     public boolean leemeElXML(String ruta){
         boolean estadoLectura = true;
         try{
            File xml = new File(ruta);
            DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbn = db.newDocumentBuilder();
            Document doc = dbn.parse(xml);
            doc.getDocumentElement().normalize();
            //LECTURA DE PALABRAS EN XML
            NodeList nList = doc.getElementsByTagName("palabra");
            for(int i = 0; i<nList.getLength(); i++){
                Node node = nList.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    this.listaP.insertarEnLista(new NodoPalabra(new Palabra(node.getTextContent())));
                }
            }
            //FIN DE LECTURA DE PALABRAS XML
         }
         catch(Exception e){
             estadoLectura = false;
         }
         return estadoLectura;
     }
     
     //GETTERS Y SETTERS
     public ListaPalabras getListaP() {
        return listaP;
    }

    public void setListaP(ListaPalabras listaP) {
        this.listaP = listaP;
    }
    
}
