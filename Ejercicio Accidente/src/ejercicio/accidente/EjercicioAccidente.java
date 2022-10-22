package ejercicio.accidente;
import java.util.Scanner;

public class EjercicioAccidente{

    public static void main(String[] args) {
     int tm25=0,tf=0,tM=0;
           int resultado=0,resultado2=0;
           int resultado3=0;
       Scanner entrada=new Scanner(System.in);
           Accidente[]ac=new Accidente[3];
          
        int e=0;
        char s=' ';
        //guardando espacio en la memoria
        for(int j=0;j<3;j++){
          ac[j]=new Accidente(e,s);
        }
        
        for(int i=0;i<3;i++){
           System.out.println("Ingrese edad: ");
           e=entrada.nextInt();
           ac[i].setEdad(e);
           
            System.out.println("Ingrese el sexo: ");
           s=entrada.next().charAt(0);
           ac[i].setSexo(s);
 
        }
        
        for(int i=0;i<3;i++){
           if(ac[i].getEdad()<25){
             tm25+=1;
           }
           if(ac[i].getSexo()=='F'||ac[i].getSexo()=='f'){
               tf+=1;
           }
           if(ac[i].getEdad()>18||ac[i].getEdad()<25 && ac[i].getSexo()=='M'||ac[i].getSexo()=='m'){
           tM+=1;
           }            
        }
        //porcentajes
  
        
         resultado=(tm25*100)/3;
         resultado2=(tf*100)/3;
         resultado3=(tM*100)/3;
         
         System.out.println("El porcentaje de accidentes de conductores que son  menores de 25 es:"+resultado+" %");
         System.out.println("El porcentaje de accidentes de conductores que son del sexo femenino es:"+resultado2+" %");
         System.out.println("El porcentaje de accidentes de conductores que son del sexo masculino con edades comprendidas entre 18 y 25 anos es de:"+resultado3+" %");
         
         
    }
    
}
