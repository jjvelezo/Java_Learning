import java.util.Scanner;
public class Helado2 {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
       
       
    double temp=entrada.nextDouble();
    double edad=entrada.nextDouble();
    
    if (temp>27 && edad>=18)
   
   {
       System.out.println("Comprar helado cerveza");
   }
   else
   System.out.println("Lo sentimos juventud");
   

   }
} 
