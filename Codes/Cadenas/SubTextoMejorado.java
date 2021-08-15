import java.util.Scanner;
public class SubTextoMejorado{
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        String palabra= entrada.next();
        int numero = entrada.nextInt();
        int numero2 = entrada.nextInt();
        
        int palabranumero = palabra.length();
        
    if(palabranumero < numero2){
        System.out.println("Error");
        
    }
        if(numero > numero2){
            System.out.println("Error2");
        }
    System.out.println(palabra.substring(numero,numero2+1));

    }
}
