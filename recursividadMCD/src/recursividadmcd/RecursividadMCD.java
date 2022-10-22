//Morales Torres Christian Rafael trabajó en este codigo
package recursividadmcd;

import java.util.Scanner;

public class RecursividadMCD {

    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingresa numero [i]:: ");
        int a=sc.nextInt();
        System.out.println("Ingrese numero [2]:: ");
        int b=sc.nextInt();
        
        System.out.println("El maximo comun divisor es:: " +mcd(a, b));
        //Si lees esto, feliz navidad :)
    }
    public static int mcd(int a, int b){
        if(a%b==0){
            return b;
        }else{
            return mcd(b, a%b);
        }
    }
}
