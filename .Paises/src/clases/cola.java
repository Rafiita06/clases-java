package Java.Paises.src.clases;

import javax.swing.JOptionPane;

public class cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";

    public cola(){
        inicioCola = null;
        finalCola = null;
    }

    //Metodo para saber si la cola está vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para insertar cola
    public void insertar(int pais){
        Nodo n_nodo = new Nodo();
        n_nodo.pais = pais;
        n_nodo.sig = null;
        
        if (ColaVacia()) {
            inicioCola = n_nodo;
            finalCola = n_nodo;
        } else {
            finalCola.sig = n_nodo;
            finalCola = n_nodo;
        }
    }

    //Metodo para extraer
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.pais;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.sig;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    //Metodo mostrar contenido de la cola
    public void Mostrar(){
        Nodo recorrido = inicioCola;
        String colaInv = "";

        while(recorrido != null){
            Cola += recorrido.pais+" ";
            recorrido = recorrido.sig;
        }
        String cadena [] = Cola.split(" ");

        for(int i = cadena.length -1 ; i >= 0; i--){
            colaInv += " " +cadena [i];
        }
        JOptionPane.showMessageDialog(null, colaInv);
        Cola = "";
    }
}
