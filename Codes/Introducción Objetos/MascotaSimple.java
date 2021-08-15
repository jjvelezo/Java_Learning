public class MascotaSimple {
    private int edad = 8;
    private String nombre;
    
    public MascotaSimple(){
        this.nombre = "Kitty";
    }
    
public MascotaSimple(String n){
    this.nombre = n;
}
    public MascotaSimple(int e){
    this.edad = e;
    }
    
    public MascotaSimple (String n, int e) {
        
        this.nombre=n;
        this.edad=e;
}
public String getNombre(){
    return nombre;
}
public int getEdad(){
    return edad;
}
}
