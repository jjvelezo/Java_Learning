import java.util.Scanner;
public class ImpuestoSolidario {
   public static void main(String[] args) {
       
Scanner entrada= new Scanner (System.in);


double salario=entrada.nextDouble();
String contrato=entrada.next();


if(contrato.equals("publico") && salario>10000000)

{ double quince=(salario*15/100);

System.out.println(String.format("%.2f",quince));

}

else { System.out.println("No debes aportar"); 
}



   }
}     
