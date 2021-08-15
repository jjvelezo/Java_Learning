import java.util.Scanner;
public class Punto {
    
    double x;
    double y;
    
    public Punto(double x, double y){
        
        this.x = x;
        this.y = y;
        
    }
    
    public void setX(double n){
        this.x = n;
    }
    
    public double getX(){
    return x;
}
  
  public void setY(double n){
        this.y = n;
    }
    
    public double getY(){
    return y;
}


    
    public static double distancia(Punto a, Punto b){
        
   double restadex = a.getX()-b.getX();
   double restadey = a.getY()-b.getY();
   double ala2 = (Math.pow(restadex,2))+(Math.pow(restadey,2));
   double dist = Math.sqrt(ala2);
    
    return dist;
        

   }
}
