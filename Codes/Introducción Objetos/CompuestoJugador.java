Jugador.java

public class Jugador {
    
    
    private String nombre;
    private int salud;
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setSalud(int s){
        this.salud = s;
    }
    public int getSalud(){
        return this.salud;
    }
    public void reducirSalud(int s){
        salud = salud-s;
    }
}

PrincipalJugador.java

import java.util.Scanner;
public class PrincipalJugador {
   public static void main(String[] args) {
       
Jugador jugadorprincipal = new Jugador();
Scanner in = new Scanner (System.in);
    int salud = in.nextInt();
    jugadorprincipal.setSalud(salud);
    String nombre = in.next();
    jugadorprincipal.setNombre(nombre);
    int numero1 = in.nextInt();
    jugadorprincipal.reducirSalud(numero1);
    int numero2 = in.nextInt();
    jugadorprincipal.reducirSalud(numero2);
    
    System.out.println(jugadorprincipal.getNombre()+jugadorprincipal.getSalud());

   }
}  
