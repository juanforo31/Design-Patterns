package classes;

import interfaces.IVisitor;

public class Delantero extends Jugador {
    
    private int goles;

    // Constructor
    public Delantero() {
        super();
        this.goles = 0;
    }

    public Delantero(String nombreJugador, int edad, String piernaHabil, int goles) {
        super(nombreJugador, edad, piernaHabil);
        this.goles = goles;
    }

    // Getters & Setters
    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    // Aceptamos la visita a esta clase
    @Override
    public void aceptar(IVisitor visitante){
        visitante.visitar(this);
    }

}
