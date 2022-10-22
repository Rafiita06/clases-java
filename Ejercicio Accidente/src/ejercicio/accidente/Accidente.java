
package ejercicio.accidente;


public class Accidente {
    private int edad;
    private char sexo;

    public Accidente(int edad, char sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }


    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
