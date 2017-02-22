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
public class MatrizOrto {
    int dimension;
    NodoMatriz cabeza = new NodoMatriz("P_0_0");
    NodoMatriz nuevo;
    
    
    public boolean isEmpty() {
        return cabeza == null;
    }
    
    public MatrizOrto(int dimension) {
        this.dimension = dimension - 1;
    }
    
    public void createMatrix(){
        NodoMatriz col = cabeza;
        NodoMatriz fil = cabeza;
        
        for(int i= 0; i<=dimension;i++){
            nuevo = new NodoMatriz("P_0_" + String.valueOf(i) + "");
            col.setSiguiente(nuevo);
            nuevo.setAnterior(col);
            col = nuevo;
            nuevo = new NodoMatriz("P_" + String.valueOf(i) + "_0");
            fil.setAbajo(nuevo);
            nuevo.setArriba(fil);
            fil = nuevo;
        }
        
        NodoMatriz auxFila1 = this.cabeza;
        NodoMatriz auxFila0 = this.cabeza;
        
        for (int i = 0; i < dimension; i++) {
            auxFila1 = this.cabeza;
            auxFila0 = this.cabeza;
            for (int j = 0; j <= i; j++) {
                auxFila1 = auxFila1.getAbajo();
                if (j < i) {
                    auxFila0 = auxFila0.getAbajo();
                }
            }
            auxFila0 = auxFila0.getSiguiente();
            for (int k = 0; k < dimension; k++) {
                nuevo = new NodoMatriz("P_" + String.valueOf(i + 1) + "_" + String.valueOf(k + 1) + "");

                auxFila1.setSiguiente(nuevo);
                nuevo.setAnterior(auxFila1);

                auxFila0.setAbajo(cabeza);
                nuevo.setArriba(auxFila0);

                auxFila1 = nuevo;//aquí avanzo
                auxFila0 = auxFila0.getSiguiente();
            }

        }
    }
    public void ShowMatriz() {

        NodoMatriz recorrer = cabeza;
        NodoMatriz recorrido2 = cabeza;
        for (int i = 0; i <= dimension; i++) {
            recorrido2 = recorrer;
            System.out.println("");
            for (int j = 0; j <= dimension; j++) {
                System.out.print(recorrido2.posi);
                recorrido2 = recorrido2.siguiente;
            }
            recorrer = recorrer.abajo;
        }
        System.out.println("");
    }
    
    public String textoParaDot(){
        String dot="";
        if(!isEmpty()){
            dot = "digraph G {\n";
            NodoMatriz aux1 = this.cabeza;
            NodoMatriz aux2 = this.cabeza;
            for(int i = 0; i<=dimension; i++){
                aux2 = aux1;
                for(int j = 0; j<= dimension; j++){
                 if(aux2.getAbajo()!=null){
                        dot = dot+aux2.posi+"->"+aux2.getAbajo().posi+";\n";
                    }
                    if(aux2.getArriba()!=null){
                        dot = dot+aux2.posi+"->"+aux2.getArriba().posi+";\n";
                    }
                    if(aux2.getSiguiente()!=null){
                        dot = dot+aux2.posi+"->"+aux2.getSiguiente().posi+";\n";
                    }
                    if(aux2.getAnterior()!=null){
                        dot = dot+aux2.posi+"->"+aux2.getAnterior().posi+";\n";
                    }
                    aux2 = aux2.getSiguiente();
                }
                aux1 = aux1.getAbajo();
            }
            dot = dot+"\n}";
            
        }
        return dot;
    }
}
