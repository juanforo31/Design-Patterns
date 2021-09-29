package vacunas;

import observador.IObservable;

public interface IVacuna extends IObservable {

    void adicionarVacunas(int cantidad);

    void suministrarVacunas(int cantidad);

    void verInfo();

}
