package interfaces;

import classes.Defensa;
import classes.Delantero;
import classes.Equipo;
import classes.Jugador;
import classes.MedioCampista;
import classes.Portero;

public interface IVisitor {
    void visitar(Equipo equipo);

    void visitar(Jugador jugador);

    void visitar(Portero portero);

    void visitar(Defensa defensa);

    void visitar(MedioCampista medioCampista);

    void visitar(Delantero delantero);
}
