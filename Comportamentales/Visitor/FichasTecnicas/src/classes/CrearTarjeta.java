package classes;

import interfaces.IVisitor;

public class CrearTarjeta implements IVisitor {

    // Colores para la consola
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String LINES = "------------------------------------------------------";
    public static final String NOMBRE = "Nombre:";
    public static final String EDAD = "Edad:";

    @Override
    public void visitar(Equipo equipo) {

        System.out.println("===================================================== ");
        System.out.println(ANSI_RED + equipo.getNombreEquipo() + ANSI_RESET);

    }

    @Override
    public void visitar(Jugador jugador) {
        System.out.println(LINES);
        System.out.println(ANSI_GREEN + "Sin posición" + ANSI_RESET);
        System.out.println(NOMBRE + jugador.getNombreJugador());
        System.out.println(EDAD + jugador.getEdad());
    }

    @Override
    public void visitar(Portero portero) {
        System.out.println(LINES);
        System.out.println(ANSI_GREEN + "Portero" + ANSI_RESET);
        System.out.println(NOMBRE + portero.getNombreJugador());
        System.out.println(EDAD + portero.getEdad());
        System.out.println(ANSI_PURPLE + "Número de tapadas: " + portero.getTapadas() + ANSI_RESET);
    }

    @Override
    public void visitar(Defensa defensa) {
        System.out.println(LINES);
        System.out.println(ANSI_GREEN + "Defensa" + ANSI_RESET);
        System.out.println(NOMBRE + defensa.getNombreJugador());
        System.out.println(EDAD + defensa.getEdad());
        System.out.println(ANSI_PURPLE + "Balones recuperados: " + defensa.getIntercepcionPases() + ANSI_RESET);

    }

    @Override
    public void visitar(MedioCampista medioCampista) {
        System.out.println(LINES);
        System.out.println(ANSI_GREEN + "Medio Campista" + ANSI_RESET);
        System.out.println(NOMBRE + medioCampista.getNombreJugador());
        System.out.println(EDAD + medioCampista.getEdad());
        System.out.println(ANSI_PURPLE + "Asistencias: " + medioCampista.getAsistencias() + ANSI_RESET);

    }

    @Override
    public void visitar(Delantero delantero) {
        System.out.println(LINES);
        System.out.println(ANSI_GREEN + "Delantero" + ANSI_RESET);
        System.out.println(NOMBRE + delantero.getNombreJugador());
        System.out.println(EDAD + delantero.getEdad());
        System.out.println(ANSI_PURPLE + "Asistencias: " + delantero.getGoles() + ANSI_RESET);

    }

}
