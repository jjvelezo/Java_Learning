import java.util.Scanner;
public class Estrellas {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
    int calificacion=entrada.nextInt();
    int numero1 = 0;
    int numero2 = 0;
    int numero3 = 0;
    int numero4 = 0;
    int numero5 = 0;
    int numero6 = 0;
    
 while(calificacion>=0){
     
     switch(calificacion){
        
    case(0):
        numero1=numero1+1;
        break;
    case(1):
        numero2=numero2+1;
        break;
    case(2):
        numero3=numero3+1;
        break;
    case(3):
        numero4=numero4+1;
        break;
    case(4):
        numero5=numero5+1;
    break;
    case(5):
        numero6=numero6+1;
    break;
}

    calificacion=entrada.nextInt();
 }
 
   int total = numero1+numero2+numero3+numero4+numero5+numero6;
   
   
   System.out.print("0("+numero1+") ");
   System.out.print("*("+numero2+") ");
   System.out.print("**("+numero3+") ");
   System.out.print("***("+numero4+") ");
   System.out.print("****("+numero5+") ");
   System.out.println("*****("+numero6+")");
   System.out.println("Total: "+total);
    
    
    
   }
}
