package classes;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import interfaces.IVisitor;

public class Factura {
    private int codigo;
    private ArrayList<Articulo> articulos = new ArrayList<>();

    // constructores
    public Factura() {
        this.codigo = 0;
        this.articulos = null;
    }

    public Factura(int codigo, ArrayList<Articulo> articulos) {
        this.codigo = codigo;
        this.articulos = articulos;
    }
    
    // Getters & setters
    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void agregarArticulo(Articulo articuloNuevo){
        this.articulos.add(articuloNuevo);
    }

    // aceptamos el la visita del visitor

    public void aceptar(IVisitor visitor){
        // para la factura en general
        visitor.visit(this);

        // para cada artículo de la factura
        for(Articulo articulo : this.articulos){
            articulo.aceptar(visitor);
        }
    }

}
