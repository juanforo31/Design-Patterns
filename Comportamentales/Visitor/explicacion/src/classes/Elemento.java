package classes;

import interfaces.IElemento;
import interfaces.IVisitante;

public class Elemento implements IElemento {

    public Elemento datos;
    public Elemento hijo;
    private double costo;
    private String nombre;

    

    // Constructores
    public Elemento() {
        this.datos = null;
        this.hijo = null;
        this.costo = 0;
        this.nombre = "";
    }

    public Elemento(double pCosto, String pNombre, Elemento pHijo){
        hijo = pHijo;
        costo = pCosto;
        nombre = pNombre;
    }

    // getters y setters
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void Aceptar(IVisitante pVisitante) {
        
        pVisitante.Visitar(this);

    }

}
