/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDeJuego;
import EstructurasDeDatos.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ricar
 */
public class Reporte {
    
    public Reporte(){
        //CONSTRUCTOR
    }
    
    public boolean generarReporteDiccionario(ListaPalabras diccionario){
        boolean estado = true;
        try{
            crearDot("Diccionario",diccionario.textoParaDot());
        }
        catch(Exception e){
            estado = false;
        }
        return estado;   
    }
    
    private void crearDot(String nombre, String texto){
        File f;
        FileWriter escribir;
        try{
            f = new File(nombre+".txt");
            escribir = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribir);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(texto);
            salida.close();
            bw.close();
            generarImagen(nombre);
        }
        catch(Exception e){
            
        }
    }
    
    private void generarImagen(String nombre){
        File f = new File(".");
        
            String dotPath ="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileOut = f.getAbsolutePath()+"\\"+nombre+".png";
            String param = "-Tpng";
            String input = f.getAbsolutePath()+"\\"+nombre+".txt";
            String toP = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = param;
            cmd[2] = input;
            cmd[3] = toP;
            cmd[4] = fileOut;
            Runtime rt = Runtime.getRuntime();
            
        try {
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
