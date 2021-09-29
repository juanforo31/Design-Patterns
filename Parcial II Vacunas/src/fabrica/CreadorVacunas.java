package fabrica;

import vacunas.Astrazeneca;
import vacunas.IVacuna;
import vacunas.Janssen;
import vacunas.Moderna;
import vacunas.Pfizer;

public class CreadorVacunas extends Fabrica {

    public CreadorVacunas() {
        // TODO
    }

    @Override
    public IVacuna crearVacuna(int tipo) {

        IVacuna objeto;

        switch (tipo) {

            case PFIZER:
                objeto = new Pfizer();
                break;

            case ASTRAZENECA:
                objeto = new Astrazeneca();
                break;

            case JANSSEN:
                objeto = new Janssen();
                break;

            case MODERNA:
                objeto = new Moderna();
                break;

            default:
                objeto = null;
                break;
        }
        return objeto;

    }
}
