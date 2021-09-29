package observador;

public class ObservadorConsola implements IObserver {

    private IObservable observable;

    public ObservadorConsola(IObservable observable) {
        this.observable = observable;
        this.observable.adicionarObservador(this);
    }

    @Override
    public void update() {
        // System.out.println(" AQUI " + observable.toString());
        observable.verExistencias();
    }

    @Override
    public void alerta() {
        System.out.println(" ALERTA :: Quedan menos de 100 vacunas de " + observable.toString());
        // observable.verExistencias();
    }

}
