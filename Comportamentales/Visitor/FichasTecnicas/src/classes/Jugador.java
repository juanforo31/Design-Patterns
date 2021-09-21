package classes;

import interfaces.IElemento;
import interfaces.IVisitor;

public class Jugador implements IElemento {

    public String nombreJugador;
    public int edad;
    public String piernaHabil;

    // Constructor

    public Jugador() {
        this.nombreJugador = "";
        this.edad = 0;
        this.piernaHabil = "";
    }

    public Jugador(String nombreJugador, int edad, String piernaHabil) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.piernaHabil = piernaHabil;
    }

    // Getters & Setters
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    @Override
    public void aceptar(IVisitor visitante) {

        visitante.visitar(this);

    }

}
