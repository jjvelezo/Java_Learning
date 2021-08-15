import java.util.Scanner;
public class DeFront{
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        String palabra= entrada.next();
    
        if(palabra.charAt(1)!='b'){
            palabra= palabra.substring(2);
            palabra= palabra.charAt(0)+palabra;
        }
        if(palabra.charAt(0)!='a'){
            palabra= palabra.substring(1);
        }
        System.out.println(palabra);
        }

    }
