import java.util.Scanner;
public class Word{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.next();
        
        palabra = palabra.toUpperCase();
        System.out.println(palabra.length());
        System.out.println(palabra.indexOf("A"));
        
    }
}
