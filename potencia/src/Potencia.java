import java.util.Scanner;

public class Potencia {
    public static void main (String [] args){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Ingrese el numero base ");
        long base = tec.nextLong();
        System.out.println("Ingrese el munero del exponente");
        long exp = tec.nextLong();
        System.out.println("El resultado es: " +potencia(base,exp));
    }
    
    public static long potencia(long base, long exp){
        if(exp == 0)return 1;
        return base * potencia(base, exp -1);
    }
}
