public class Fibonacci {
    public static void main(String [] args){
        int x=0;
        while(x !=9){
            System.out.println(Fibonacci(x));
            x++;
        }
    }
    public static int Fibonacci(int N){
        if((N == 0) || (N == 1)){
            return 1;
        }else{
            return Fibonacci (N-1) + Fibonacci (N-2);
        }
    }
}
