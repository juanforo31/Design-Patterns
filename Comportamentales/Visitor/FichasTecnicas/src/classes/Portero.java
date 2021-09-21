package classes;

import interfaces.IVisitor;

public class Portero extends Jugador {

    private int tapadas;

    // Constructor
    public Portero() {
        super();
        this.tapadas = 0;
    }

    public Portero(String nombreJugador, int edad, String piernaHabil, int tapadas) {
        super(nombreJugador, edad, piernaHabil);
        this.tapadas = tapadas;
    }

    // Getters & Setters
    public int getTapadas() {
        return tapadas;
    }

    public void setTapadas(int tapadas) {
        this.tapadas = tapadas;
    }

    // Aceptamos al visitante
    @Override
    public void aceptar(IVisitor visitante) {
        visitante.visitar(this);
    }

}
