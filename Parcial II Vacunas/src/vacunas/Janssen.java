package vacunas;

public class Janssen extends Vacuna {
    private static final String nombreVacuna = "JANSSEN";
    private static final int numeroDosis = 1;

    public Janssen() {
        super();
        this.nombre = Janssen.nombreVacuna;
        this.numero_dosis = Janssen.numeroDosis;
    }

    public Janssen(String cantidad_por_dosis, String siguiente_dosis, int existencias) {
        super(Janssen.nombreVacuna, cantidad_por_dosis, Janssen.numeroDosis, siguiente_dosis, existencias);
    }
}
