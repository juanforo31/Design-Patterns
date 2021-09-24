import classes.CrearTarjeta;
import classes.Defensa;
import classes.Delantero;
import classes.Equipo;
import classes.Jugador;
import classes.ListaEquipos;
import classes.MedioCampista;
import classes.Portero;

public class App {
    public static void main(String[] args) {

        // LIsta donde estaran los equipos
        ListaEquipos listaEquipos = new ListaEquipos();

        // Equipos
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("PSG");

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo("Manchester United");

        // Jugadores Equipo 1
        Jugador jugador1 = new Jugador("Juan", 21, "Derecho");
        Portero portero1 = new Portero("Keylor Navas", 34, "Derecho", 128);
        Defensa defensa1 = new Defensa("Sergio Ramos", 35, "Derecho", 112);
        MedioCampista mediocampista1 = new MedioCampista("Ángel Di María", 33, "izquierdo", 13);
        Delantero delantero1 = new Delantero("Leonel Messi", 34, "Izquierdo", 38);

        // Jugadores Equipo 2
        Portero portero2 = new Portero("David de Gea", 30, "Derecho", 91);
        Defensa defensa2 = new Defensa("Harry Maguire", 28, "Derecho", 254);
        MedioCampista mediocampista2 = new MedioCampista("Paul Pogba", 28, "ambidiestro", 6);
        Delantero delantero2 = new Delantero("Cristiano Ronaldo", 36, "Derecho", 33);

        // Agregar jugadores a cada equipo
        equipo1.agregarJugador(jugador1);
        equipo1.agregarPortero(portero1);
        equipo1.agregarDefensa(defensa1);
        equipo1.agregarMedioCampista(mediocampista1);
        equipo1.agregarDelantero(delantero1);

        equipo2.agregarPortero(portero2);
        equipo2.agregarDefensa(defensa2);
        equipo2.agregarMedioCampista(mediocampista2);
        equipo2.agregarDelantero(delantero2);

        // Agregar equipos a la lista de Equipos

        listaEquipos.agregarEquipos(equipo1);
        listaEquipos.agregarEquipos(equipo2);

        // Ejecutamos el metodo aceptar
        listaEquipos.aceptar(new CrearTarjeta());

    }
}
