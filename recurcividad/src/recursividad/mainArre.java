
package recursividad;

import java.util.Scanner;

public class mainArre {
    public static void main(String[] args) {
    int[] arreg = {20,15,10,8,6};        
        arreglo arreglo = new arreglo();
            Scanner teclado = new Scanner(System.in); 
        int iOpcion = 0;
       
            while(iOpcion!=9){
                System.out.println("Asegurese de leer los arreglos antes de cualquier accion");
                System.out.println("1.- Leer los arreglos");
                System.out.println("2.- Desplegar el arreglo");
                System.out.println("3.- Desplegar arreglo al reves");
                System.out.println("4.- Sumar los arreglos");
                System.out.println("5.- Promediar los arreglos");
                System.out.println("6.- Contar elementos");
                System.out.println("7.- Sumar los pares");
                System.out.println("8.- Contar los impares");
                System.out.println("9.- Salir");
                iOpcion = teclado.nextInt();
                
                switch(iOpcion){
                                case 1:
                                         arreglo.leerArre(arreg, 0);   
                                break;
                        
		case 2:
                                        arreglo.despArre(arreg, 0);
                                    break;
			
		case 3:
                                    arreglo.arreInv(arreg, 0);
		break;
				
		case 4:
                                    arreglo.sumArre(arreg, 0);
                                break;
				
		case 5:
                                    arreglo.promArre(arreg, 0);
		break;				
				
                                case 6:
                                    arreglo.conArre(arreg, 0);
		break;
			
		case 7:
                                    arreglo.sumParArre(arreg, 0);
		break;
			
		case 8:
		break;										
											
                                case 9:
                                    System.out.println("Vuelva pronto, adios...");
                                break;
		}
	}       
       
       
    }
}
