public class Mate {
   public int factorial(int num){

    int numero=1;
    int resultado = num;
    while (numero<resultado){
        
        num=num*numero;
        numero+=1;
    }

 return num;

   }
} 
