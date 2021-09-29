package observador;

public interface IObservable {

    void adicionarObservador(IObserver observer);

    void removerObservador(IObserver observer);

    void verExistencias();

}
