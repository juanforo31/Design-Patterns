package vacunas;

public class Pfizer extends Vacuna {
    private static final String nombreVacuna = "PFIZER";
    private static final int numeroDosis = 3;

    public Pfizer() {
        super();
        this.nombre = Pfizer.nombreVacuna;
        this.numero_dosis = Pfizer.numeroDosis;
    }

    public Pfizer(String cantidad_por_dosis, int numero_dosis, String siguiente_dosis, int existencias) {
        super(Pfizer.nombreVacuna, cantidad_por_dosis, Pfizer.numeroDosis, siguiente_dosis, existencias);
    }

}
