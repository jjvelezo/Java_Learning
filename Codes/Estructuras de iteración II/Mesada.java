import java.util.Scanner;
public class Mesada {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
    
    String nombre=entrada.next();
    
    
    while (true){
        
       int numero=entrada.nextInt();
       
       
       if (numero < 500){
               System.out.println(nombre + " me decepcionas");
       }
       
       
                if (numero > 500){
                System.out.println(nombre + " eres mi angel");
                break;}
           
           
           
           }
       
    


   }
}
