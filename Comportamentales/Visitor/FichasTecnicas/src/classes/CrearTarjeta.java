package classes;

import interfaces.IVisitor;

public class CrearTarjeta implements IVisitor {

    @Override
    public void visitar(Equipo equipo) {

        System.out.println("===================================================== ");
        System.out.println("\u001B[31m" + equipo.getNombreEquipo() + "\u001B[0m");

    }

    @Override
    public void visitar(Jugador jugador) {
        // System.out.println("Jugador [" + jugador.getNombreJugador() + "] --> Edad ["
        // + jugador.getEdad() + "]");
        return;
    }

    @Override
    public void visitar(Portero portero) {
        System.out.println("------------------------------------------------------");
        System.out.println("\u001B[32m" + "Portero" + "\u001B[0m");
        System.out.println("Nombre: " + portero.getNombreJugador());
        System.out.println("Edad: " + portero.getEdad());
        System.out.println("\u001B[35m" + "Número de tapadas: " + portero.getTapadas() + "\u001B[0m");
    }

    @Override
    public void visitar(Defensa defensa) {
        System.out.println("------------------------------------------------------");
        System.out.println("\u001B[32m" + "Defensa" + "\u001B[0m");
        System.out.println("Nombre: " + defensa.getNombreJugador());
        System.out.println("Edad: " + defensa.getEdad());
        System.out.println("\u001B[35m" + "Balones recuperados: " + defensa.getIntercepcionPases() + "\u001B[0m");

    }

    @Override
    public void visitar(MedioCampista medioCampista) {
        System.out.println("------------------------------------------------------");
        System.out.println("\u001B[32m" + "Medio Campista" + "\u001B[0m");
        System.out.println("Nombre: " + medioCampista.getNombreJugador());
        System.out.println("Edad: " + medioCampista.getEdad());
        System.out.println("\u001B[35m" + "Asistencias: " + medioCampista.getAsistencias() + "\u001B[0m");

    }

    @Override
    public void visitar(Delantero delantero) {
        System.out.println("------------------------------------------------------");
        System.out.println("\u001B[32m" + "Delantero" + "\u001B[0m");
        System.out.println("Nombre: " + delantero.getNombreJugador());
        System.out.println("Edad: " + delantero.getEdad());
        System.out.println("\u001B[35m" + "Asistencias: " + delantero.getGoles() + "\u001B[0m");

    }

}
