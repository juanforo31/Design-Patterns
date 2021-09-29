package fabrica;

import vacunas.IVacuna;

public abstract class Fabrica {
    public static final int PFIZER = 1;
    public static final int ASTRAZENECA = 2;

    public abstract IVacuna crearVacuna(int tipo);
}
