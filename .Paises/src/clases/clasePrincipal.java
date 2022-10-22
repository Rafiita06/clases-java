package Java.Paises.src.clases;

import javax.swing.JOptionPane;

public class clasePrincipal {
    public static void main (String[] args){
        int opc =0, nodo_info = 0;
        cola cola = new cola();

        do {
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu de opciones\n\n"
                    + "1. Insertar\n"
                    + "2. Eliminar\n"
                    + "3. Desplegar\n"
                    + "4. Desplegar inversa\n"
                    + "5. Salir\n\n"));

                switch(opc){
                    case 1:
                        nodo_info = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Porfvor ingresa el pais"));
                        cola.insertar(nodo_info);
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
                
            }catch(NumberFormatException e){

            }
        } while (opc != 5);
    }
}
