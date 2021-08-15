import java.util.Scanner;
public class Hipotenusa {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    double Cateto1=entrada.nextDouble();
    double Cateto2=entrada.nextDouble();
    double Suma=(Math.pow(Cateto1,2));
    double Suma2=(Math.pow(Cateto2,2));
    double Suma3=(Suma+Suma2);
    double Sumafinal=(Math.sqrt(Suma3));
    System.out.println(String.format("%.2f",Sumafinal));
   }
}  
