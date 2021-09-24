package classes;

import java.util.ArrayList;

import interfaces.IElemento;
import interfaces.IVisitor;

public class Equipo implements IElemento {

    private String nombreEquipo;
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();

    // Constructor
    public Equipo() {
        this.nombreEquipo = "";
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // Getters & Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void agregarJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }

    // Añadir jugadores a la lista - se puede realizar con el patron de factory
    // method
    public void agregarPortero(Portero portero) {
        this.listaJugadores.add(portero);
    }

    public void agregarDefensa(Defensa defensa) {
        this.listaJugadores.add(defensa);
    }

    public void agregarMedioCampista(MedioCampista medioCampista) {
        this.listaJugadores.add(medioCampista);
    }

    public void agregarDelantero(Delantero delantero) {
        this.listaJugadores.add(delantero);
    }

    @Override
    public void aceptar(IVisitor visitante) {

        // datos equipo
        visitante.visitar(this);

        if (this.listaJugadores != null && this.listaJugadores.isEmpty() == false) {
            System.out.println("Jugadores [" + this.listaJugadores.size() + "]");
            // datos jugadores
            for (Jugador jugador : listaJugadores) {
                jugador.aceptar(visitante);
            }
        }

    }

}
