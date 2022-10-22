
package recursividad;

public class arreglo {
    
    public void leerArre(int arre[], int i) {
        if (i <= 5) {
            int[] arr = {20, 15, 10, 8, 6};
            arre = arr;
            System.out.println("Los valores ya han sido registrados");
        }
    }
    
    public void despArre(int arre[], int i) {
        if (i < 5) {
            System.out.println("El valor en " + (i + 1) + " es " + arre[i] + " ");
            despArre(arre, i + 1);
        }
    }
    
    public void arreInv(int arre[], int i) {
        for (int inv = arre.length - 1; inv >= 0; inv--) {
            System.out.println("El valor de " + (inv + 1) + " es " + arre[inv] + " ");
        }
    }
    
    public void sumArre(int arre[], int i) {
        int s;
        for (s = 0; i < arre.length; i++) {
            s += arre[i];
        }
        System.out.println("La suma de los valores obtenidos es: " + s + " ");

    }

    public void promArre(int arre[], int i) {
        double s;
        for (s = 0; i < arre.length; i++) {
            s = s + arre[i];
        }
        System.out.println("La suma de los valores obtenidos es: " + s + " ");
        System.out.println("El promedio de los valores obtenidos es: " + (s / arre.length) + " ");
    }

    public void conArre(int arre[], int i) {
        int co;
        for (co = arre.length - 1; co >= 0; co--) {

        }
        System.out.println("El numero de datos que hay son: " + (arre.length));
    }

    public int sumParArre(int arre[], int i) {
        int tp = 0;
        if (arre.length / 2 == 0) {
            tp += 1;
        }
        System.out.println("La cantidad de numeros pares que hay es: " + tp);
        return tp;
    }

    public void sumImpArre(int arre[], int i) {
        System.out.println("La cantidad de numeros nones que hay es: ");
    }
}
