package modelo;

public class Persona {
    
    private String Nombre=null;
    private Integer Edad=null;
    
    public Persona () {
        
    }

    public Persona(String Nombre, Integer Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
            
    
}
