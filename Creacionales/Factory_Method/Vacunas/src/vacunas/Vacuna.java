package vacunas;

import java.util.ArrayList;
import java.util.Iterator;

import observador.IObserver;

public class Vacuna implements IVacuna {

    public String nombre;
    public String cantidad_por_dosis;
    public int numero_dosis;
    public String siguiente_dosis;
    public int existencias;

    private ArrayList<IObserver> observadores;

    public Vacuna() {
        this.nombre = "";
        this.cantidad_por_dosis = "";
        this.numero_dosis = 0;
        this.siguiente_dosis = "";
        this.existencias = 0;
        this.observadores = new ArrayList<IObserver>();
    }

    public Vacuna(String nombre, String cantidad_por_dosis, int numero_dosis, String siguiente_dosis, int existencias) {
        this.nombre = nombre;
        this.cantidad_por_dosis = cantidad_por_dosis;
        this.numero_dosis = numero_dosis;
        this.siguiente_dosis = siguiente_dosis;
        this.existencias = existencias;
        this.observadores = new ArrayList<IObserver>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad_por_dosis() {
        return cantidad_por_dosis;
    }

    public void setCantidad_por_dosis(String cantidad_por_dosis) {
        this.cantidad_por_dosis = cantidad_por_dosis;
    }

    public int getNumero_dosis() {
        return numero_dosis;
    }

    public void setNumero_dosis(int numero_dosis) {
        this.numero_dosis = numero_dosis;
    }

    public String getSiguiente_dosis() {
        return siguiente_dosis;
    }

    public void setSiguiente_dosis(String siguiente_dosis) {
        this.siguiente_dosis = siguiente_dosis;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public void adicionarVacunas(int cantidad) {
        int cantidadActual = this.getExistencias();
        int cantidadActualizada = cantidadActual + cantidad;
        this.setExistencias(cantidadActualizada);

        this.notificar();
    }

    @Override
    public void suministrarVacunas(int cantidad) {

        int cantidadActual = this.getExistencias();
        int cantidadActualizada = cantidadActual - cantidad;
        System.out.println("");

        if (cantidadActualizada <= -1) {
            System.out.println("no hay dosis suficientes");
            System.out.println("Las existencias actuales son: " + cantidadActual);

        } else {
            this.setExistencias(cantidadActualizada);
            System.out.println("Las cantidad actual de vacunas es: " + this.getExistencias());
        }

        this.notificar();

        if (this.getExistencias() <= 100) {
            notificarAlerta();
        }
    }

    @Override
    public void verInfo() {
        System.out.println("Nombre" + this.getNombre() + "Cantidad de dosis" + this.getCantidad_por_dosis()
                + "Numero de dosis" + this.getNumero_dosis() + "Siguiente_ dosis" + this.getSiguiente_dosis()
                + "Existencias" + this.getExistencias());

    }

    // Patrón de diseño observer
    @Override
    public void adicionarObservador(IObserver observer) {
        this.observadores.add(observer);
    }

    @Override
    public void removerObservador(IObserver observer) {
        this.observadores.remove(observer);
    }

    @Override
    public void verExistencias() {
        System.out.println("");
        System.out.println("Nombre " + this.getNombre() + " Existencias " + this.getExistencias() + " vacunas");
    }

    @Override
    public String toString() {
        return "" + this.getNombre();
    }

    private void notificar() {
        for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
            IObserver iObserver = it.next();
            iObserver.update();
        }
    }

    private void notificarAlerta() {
        for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
            IObserver iObserver = it.next();
            iObserver.alerta();
        }
    }

}
