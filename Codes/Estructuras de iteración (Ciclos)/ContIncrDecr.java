import java.util.Scanner;
public class ContIncrDecr {
   public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
    double variable = 0.0;
    
    int contador = 0;
    String cadena="";
    double a = entrada.nextDouble();
    
    while(a != 0){
        
     if(a>=variable){
         contador++;
     if(cadena.equals("")){
       cadena+="+1";
     }
       
    else { 
        cadena+="\n+1"; }
        variable = a;
    
    }
     
    else {
        contador--;
     if(cadena.equals("")){
       cadena+="-1";
     }
    else { 
        cadena+="\n-1";
    }
    variable = a;
    }
    
    a=entrada.nextDouble();
    }
    
    System.out.println(cadena);
    System.out.println("Contador: "+contador);
    
   }
}
