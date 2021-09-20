package classes;

import java.util.ArrayList;
import interfaces.IElemento;
import interfaces.IVisitor;

public class Factura implements IElemento {

    private int codigo;
    private ArrayList<Articulo> articulos = new ArrayList<>();

    // constructores
    public Factura() {
        this.codigo = 0;
    }

    public Factura(int codigo) {
        this.codigo = codigo;
    }

    // Getters & setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void agregarArticulo(Articulo articuloNuevo) {
        this.articulos.add(articuloNuevo);
    }

    // aceptamos el la visita del visitor
    @Override
    public void aceptar(IVisitor visitor) {
        // para la factura en general
        visitor.visit(this);

        // para cada artículo de la factura
        for (Articulo articulo : this.articulos) {
            articulo.aceptar(visitor);
        }
    }

}
