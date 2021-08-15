import java.util.Scanner;
public class PrincipalCalculadoraSimple {
    public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
     int num1=entrada.nextInt();
     int num2=entrada.nextInt();
    
       
       CalculadoraSimple numero = new CalculadoraSimple();
        
        System.out.println(numero.sumar(num1,num2));
        System.out.println(numero.restar(num1,num2));
  }
 }
