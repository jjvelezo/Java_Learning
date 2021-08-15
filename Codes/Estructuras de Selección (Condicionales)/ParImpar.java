import java.util.Scanner;
public class ParImpar {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
    int num=entrada.nextInt();
    
    if (num%2==0){
        System.out.println("Es par");
    }
    
    else {
        
        System.out.print("Es impar");
        }
        
    }

   }
