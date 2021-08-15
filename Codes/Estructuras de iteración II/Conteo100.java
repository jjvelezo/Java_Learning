import java.util.Scanner;
public class Conteo100 {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
    
    int contador = 0;
    
    while(true){
        
        
        int num=entrada.nextInt();
        
        
     if (num > 100){
      
       num += 1;
       contador++;
     }
     
     if (num == 0){
         System.out.println(contador++);
         break;
     }
     
    
       
    }
    
   }
}
