import java.util.Scanner;
public class Array {
 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        int n = entrada.nextInt();
        int array [] = new int [n];
       
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1));
            array [i] = entrada.nextInt();
        }
       
        int mayor, menor;
        mayor = menor = array [0];
       
        for (int i = 0; i < array.length; i++) {
           if(array[i]<menor) {
                menor = array[i]; 
            }
           
        }
        
        System.out.println(menor);
    }
}
