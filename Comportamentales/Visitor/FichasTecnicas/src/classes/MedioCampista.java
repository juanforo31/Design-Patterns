package classes;

import interfaces.IVisitor;

public class MedioCampista extends Jugador {

    private int asistencias;

    // Constructor
    public MedioCampista() {
        super();
        this.asistencias = 0;
    }

    public MedioCampista(String nombreJugador, int edad, String piernaHabil, int asistencias) {
        super(nombreJugador, edad, piernaHabil);
        this.asistencias = asistencias;
    }


    // Getters & Setters
    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public void aceptar(IVisitor visitante) {
        visitante.visitar(this);
    }

}
