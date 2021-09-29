package fabrica;

import vacunas.IVacuna;

public abstract class Fabrica {
    public static final int PFIZER = 1;
    public static final int ASTRAZENECA = 2;
    public static final int JANSSEN = 3;
    public static final int MODERNA = 4;

    public abstract IVacuna crearVacuna(int tipo);
}
