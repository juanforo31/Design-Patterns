package vacunas;

public class Astrazeneca extends Vacuna {

    private static final String nombreVacuna = "Astrazeneca";
    private static final int numeroDosis = 2;

    public Astrazeneca() {
        super();
        this.nombre = Astrazeneca.nombreVacuna;
        this.numero_dosis = Astrazeneca.numeroDosis;
    }

    public Astrazeneca(String nombre, String cantidad_por_dosis, int numero_dosis, String siguiente_dosis,
            int existencias) {
        super(Astrazeneca.nombreVacuna, cantidad_por_dosis, Astrazeneca.numeroDosis, siguiente_dosis, existencias);
    }

}