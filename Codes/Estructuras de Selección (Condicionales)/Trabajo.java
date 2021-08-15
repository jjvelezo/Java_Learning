import java.util.Scanner;
public class Trabajo {
   public static void main(String[] args) {
       
  Scanner entrada= new Scanner (System.in);
  
  int dia=entrada.nextInt();
  double salario=entrada.nextDouble();
       
       
    switch(dia){
        
    case(1):
    System.out.println(String.format("%.2f",salario*1.455));
    break;
    
    case(2):
    System.out.println(String.format("%.2f",salario));
    break;
    
    case(3):
    System.out.println(String.format("%.2f",salario));
    break;
    
    case(4):
    System.out.println(String.format("%.2f",salario*1.1));
    break;
    
    
    case(5):
    System.out.println(String.format("%.2f",salario*1.295));
    break;
    
    case(6):
    System.out.println(String.format("%.2f",salario*1.75));
    break;
    
    case(7):
    System.out.println(String.format("%.2f",salario*1.75));
    break;
    }
    
    
    
   }
}
