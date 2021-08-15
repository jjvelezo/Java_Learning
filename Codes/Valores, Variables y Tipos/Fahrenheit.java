import java.util.Scanner;
public class Fahrenheit {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    double Numero=entrada.nextDouble();
    double Multi=(1.8*Numero);
    double Total=(Multi+32);
    System.out.println(String.format("%.2f",Total));
   }
}
