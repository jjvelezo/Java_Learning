import java.util.Scanner;
public class Main {

    public static void main(String args[]) {

        Scanner lector = new Scanner(System.in);

        int numero, sumDig = 0;


        numero = lector.nextInt();

;       int aux=numero;

        while (numero != 0) {

            sumDig = sumDig + (numero % 10);

            numero = numero / 10;

        }

        System.out.println(sumDig);



    }

}
