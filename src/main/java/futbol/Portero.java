package futbol;

public class Portero extends Futbolista{

    public Short golesRecibidos;
    public Byte dorsal;


    public Portero(String nombre, Integer edad, Short golesRecibidos, Byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // ---------- setters and getters ------------
    public Short getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(Short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public Byte getDorsal() {
        return dorsal;
    }
    public void setDorsal(Byte dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Portero p) {
        int dif = this.getGolesRecibidos() - p.getGolesRecibidos();
        if (dif<0){
            return dif*-1;
        }
        else{
            return dif;
        }
    }

    @Override
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+getDorsal()+". Le han marcado "+getGolesRecibidos();
    }
    
    
    
}
