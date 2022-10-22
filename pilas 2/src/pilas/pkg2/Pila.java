package pilas.pkg2;

public class Pila {

    String[] dato = new String[50];
    int tope;
    
    public Pila(){
        
    }
    /*public Pila() {
        tope = 1;
    }

    boolean esVacia() {
        return (tope == -1) ? true : false;
    }

    //pregunta si esta llena
    boolean esLlena() {
        return (tope >= MAX - 1) ? true : false;
    }

    //meter datos
    void push(int x) {
        if (esLlena()) {
            System.out.println("Pila Llena\n");
            return;
        }
        tope++;
        dato[tope] = x + "";
    }

    //sacar datos
    int pop() {
        int x;
        if (esVacia()) {
            System.out.println("Pila Vacia\n");
            return -1;
        }
        x = Integer.parseInt(dato[tope]);
        tope--;
        return x;
    }

    //desplegar contenido de pila
    void despliega() {
        if (esVacia()) {
            System.out.println("Pila Vacia\n");
            return;
        }
        for (i = 0; i <= tope; i++) {
            System.out.println(dato[i]);
        }
    }*/
}
