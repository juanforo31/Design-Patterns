package vacunas;

public class Moderna extends Vacuna {
    private static final String nombreVacuna = "MODERNA";
    private static final int numeroDosis = 2;

    public Moderna() {
        super();
        this.nombre = Moderna.nombreVacuna;
        this.numero_dosis = Moderna.numeroDosis;
    }

    public Moderna(String cantidad_por_dosis, String siguiente_dosis, int existencias) {
        super(Moderna.nombreVacuna, cantidad_por_dosis, Moderna.numeroDosis, siguiente_dosis, existencias);
    }
}
