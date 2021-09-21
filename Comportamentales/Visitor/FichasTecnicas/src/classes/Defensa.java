package classes;

import interfaces.IVisitor;

public class Defensa extends Jugador {

    private int intercepcionPases;

    // Constructor
    public Defensa() {
        super();
        this.intercepcionPases = 0;
    }

    public Defensa(String nombreJugador, int edad, String piernaHabil, int intercepcionPases) {
        super(nombreJugador, edad, piernaHabil);
        this.intercepcionPases = intercepcionPases;
    }

    // Getters & Setters
    public int getIntercepcionPases() {
        return intercepcionPases;
    }

    public void setIntercepcionPases(int intercepcionPases) {
        this.intercepcionPases = intercepcionPases;
    }

    // Aceptamos la visita a esta clase
    @Override
    public void aceptar(IVisitor visitante) {
        visitante.visitar(this);

    }

}
