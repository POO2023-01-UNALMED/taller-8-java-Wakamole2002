package futbol;

public class Jugador extends Futbolista {
    public Short golesMarcados;
    public Byte dorsal;
    public Jugador(String nombre, Integer edad, String posicion, Short golesMarcados, Byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    // ------------ setters and getters ----------
    public Short getGolesMarcados() {
        return golesMarcados;
    }
    public void setGolesMarcados(Short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }
    public Byte getDorsal() {
        return dorsal;
    }
    public void setDorsal(Byte dorsal) {
        this.dorsal = dorsal;
    }
    // ----------- metodos a implementar ----------
    @Override
    public boolean jugarConLasManos() {
        return false;
    }
    @Override
    public int compareTo(Futbolista f) {
        int dif = this.getEdad() - f.getEdad();
        if (dif < 0) {
            return dif*-1;
        }
        else{
            return dif;
        }
    }
    @Override
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+getDorsal()+". Ha marcado "+getGolesMarcados();
    }
    
    
}
