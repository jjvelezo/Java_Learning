SensorActuador.java

public class SensorActuador {
       
int temperatura;
int minTemp;
int maxTemp;

public SensorActuador (int temp, int min, int max){
    
    this.temperatura = temp;
    this.minTemp = min;
    this.maxTemp = max;
}
public int getTemperatura()
{
    return this.temperatura;
}
public void disminuirTemp(int i){
    
    int restado = this.temperatura-i;
    if((restado>=this.minTemp))
    {this.temperatura = restado;}
    
    else{this.temperatura=this.temperatura;}
    
}
public void aumentarTemp(int i){
    
    int suma = this.temperatura+1;
    if((suma<=this.maxTemp)){this.temperatura = suma;}
    
    else{this.temperatura=this.temperatura;}
    


   }
}


ControlAmbiente.java

import java.util.Scanner;
public class ControlAmbiente {
   public static void main(String[] args) {
    
    SensorActuador sa1 = new SensorActuador(5,1,10);
    
    Scanner entrada= new Scanner (System.in);

    for(int i=1; i<=4; i++){
        
        int num=entrada.nextInt();
        
        
        if(i<=2){
            sa1.disminuirTemp(num);
        }
        else{
            sa1.aumentarTemp(num);
        }
        
        
    }

    System.out.println(sa1.getTemperatura());

   }
}   
