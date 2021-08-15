import java.util.Scanner;
public class SubTexto{
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        String palabra= entrada.next();
        int numero = entrada.nextInt();
        int numero2 = entrada.nextInt();

    
        System.out.println(palabra.substring(numero,numero2+1));

    }
}
