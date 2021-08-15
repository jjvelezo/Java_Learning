import java.util.Scanner;
public class Radio {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    double AreaCirculo=entrada.nextDouble();
    double elevado=Math.pow(AreaCirculo,2);
    double area=(Math.PI*elevado);
    System.out.println(String.format("%.2f",area));
    
   }
} 
