public class Planeta {
    
       
    private String nombre;
    private double masa;
    public int contador = 0;
    
    public Planeta(){
        this.nombre="Tierra";
        this.masa=5.972;
    }
    
    public Planeta(String nom, double mas){
        this.nombre = nom;
        this.masa = mas;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    
    public void setMasa(double masa){
        this.masa=masa;
    }
    
    public double getMasa(){
    return masa;
    }
    
    
    public static Planeta planetaMedio(Planeta p){
        Planeta p2 = new Planeta();
        p2.setNombre(p.getNombre());
        p2.setMasa(p.getMasa()/2);
        return p2;
    }

    
}    
