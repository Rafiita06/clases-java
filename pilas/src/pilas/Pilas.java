package pilas;

import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        int x, opc = 0;
        pila p = new pila();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 Insertar");
            System.out.println("2 Sacar");
            System.out.println("3 Desplegar");
            System.out.println("4 Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Teclea el dato a ingresar");
                    x = sc.nextInt();
                    String s = String.valueOf(x);
                    p.push(x);
                    break;
                case 2:
                    x = p.pop();
                    if (x != -1) {
                        System.out.println("Dato que salió" + x);
                    }
                    break;
                case 3:
                    p.despliega();
                    break;
                case 4:
                    System.out.println("Bye :D");
                    break;

            }
        } while (opc != 4);
    }

}
