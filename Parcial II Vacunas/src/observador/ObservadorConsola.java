package observador;

public class ObservadorConsola implements IObserver {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    private IObservable observable;

    public ObservadorConsola(IObservable observable) {
        this.observable = observable;
        this.observable.adicionarObservador(this);
    }

    @Override
    public void update() {
        observable.verExistencias();
    }

    @Override
    public void alertaMenosCien() {

        System.out.println(ANSI_RED + "ALERTA :: Quedan menos de 100 vacunas de " + observable.toString() + ANSI_RESET);

    }

    @Override
    public void alertaMenos50() {

        System.out.println(ANSI_RED + "ALERTA :: Quedan menos de 50 vacunas de " + observable.toString() + ANSI_RESET);

    }

    @Override
    public void alertaSinExistencias() {

        System.out.println(ANSI_RED + "ALERTA :: No quedan vacunas de " + observable.toString() + ANSI_RESET);

    }

}
