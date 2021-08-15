public class Balanceado {
    public static boolean balancear(int[]args) {
        
       boolean balanceado = false;
       int numero1 = 0, numero2 = 0;
       
       for(int index = 0; index < args.length; index++)
       {
           if(index < (args.length/2)){
               numero1 += args[index];
           }
           else if(index > (args.length/2)){
               numero2 += args[index];
           }
       }
    
    if(numero1 == numero2){
        balanceado = true;
    }
    return balanceado;
    

   }
} 
