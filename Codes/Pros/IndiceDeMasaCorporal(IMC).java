import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       
Scanner entrada= new Scanner (System.in);

String Nombre;
int estatura;
int peso;


System.out.println("Su Nombre");
String nombre1=entrada.next();


System.out.println("Su Estatura en Metros");
double estatura1=entrada.nextDouble();


System.out.println("Su Peso en Kg");
double peso1=entrada.nextDouble();


double IMC= (peso1/(estatura1*estatura1));


if (IMC < 18.5)
System.out.println(nombre1 + ", Estas delgado");


else


if (24.99 > IMC && IMC >= 18.5)
System.out.println(nombre1 + ", Estas en el peso ideal");

else


if (IMC >= 25)
System.out.println(nombre1 + ", Estas en sobre peso");

System.out.println(IMC);

   }
} 
