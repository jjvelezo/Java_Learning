import java.util.Scanner;
public class Helado3 {
   public static void main(String[] args) {

Scanner entrada= new Scanner (System.in);
  
    int temperatura=entrada.nextInt();
    int edad=entrada.nextInt();
   
    
    if(temperatura>27){
        
    if(edad>=18) {

    int dinero=entrada.nextInt();
    
    if(dinero>5000){
     System.out.println("Comprar helado cerveza");
    } 
    
    
    else 
    { 
    System.out.println("De que me hablas viejo");
    }
    
    }
    else 
    {
    System.out.println("Lo sentimos juventud");
    }
    }
   }
}
