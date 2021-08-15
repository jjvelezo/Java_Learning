import java.util.Scanner;
public class SumaPares {
   public static void main(String[] args) {
     Scanner entrada= new Scanner (System.in);

    int a =entrada.nextInt();
    int resultado=0;
    for(int i=0;i<a;i++)
    {
        int b =entrada.nextInt();
        if(b%2==0){
            resultado=resultado + b;}
            else{resultado=resultado;}
    }
    System.out.println(resultado);

   }
} 
