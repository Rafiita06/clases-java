package pilas;

public class pila {

    static final int MAX = 5;
    private String [] dato = new String [MAX];
    private int tope;
    private int i;

    public pila() {
        tope = 1;
    }

    //pregunta si esta vacia
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
        dato[tope] = x+"";
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
    }
}