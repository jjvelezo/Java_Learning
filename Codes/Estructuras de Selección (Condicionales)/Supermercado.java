import java.util.Scanner;
public class Supermercado {
   public static void main(String[] args) {
       
    Scanner entrada= new Scanner (System.in);
       


int tipo1=5, tipo2=10, tipo3=15;

String producto_comprados=entrada.next();

   int cantidad_comprados=entrada.nextInt();
   
   if(producto_comprados.equals("1"))
   {
      int operacion=tipo1*cantidad_comprados;
      
      System.out.println(operacion);
      
   } 
   else if(producto_comprados.equals("2"))
   {
     int operacion=tipo2*cantidad_comprados;
     System.out.println(operacion);
   
   } 
   else if (producto_comprados.equals("3"))
   {
     int operacion=tipo3*cantidad_comprados;
     System.out.println(operacion);
       }
       
   else {}





   }
} 
