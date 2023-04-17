package futbol;
import java.lang.Comparable;


public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private Integer edad;
    private final String posicion;

    //------------- constructores --------------
    public Futbolista(String nombre, Integer edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    public Futbolista() {
        this("Maradona",30,"delantero");
    }

// ------------- setters and getters -----------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion();
    }
    
    // -------------- metodos ------------

    public boolean f(Futbolista fut){
        if (this == fut){
            return true;
        }
        else{
            return false;
        }
}

    public abstract boolean jugarConLasManos();

    //para sobreescribir el metodo que implementa de comparable:
    public int compareTo(Object p) {
        return 0;
    }
    //para el portero
    public int compareTo(Portero p) {
        return 0;
    }
    //para el jugador
    public int compareTo(Futbolista f) {
        return 0;
    }

    
}


