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

    public void visitar(Portero portero);

    public void visitar(Defensa defensa);

    public void visitar(MedioCampista medioCampista);

    public void visitar(Delantero delantero);
}
