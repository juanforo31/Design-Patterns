package classes;

import java.util.ArrayList;

import interfaces.IElemento;
import interfaces.IVisitor;

public class GrupoFacturas implements IElemento {

    private ArrayList<Factura> facturas = new ArrayList<>();

    public void agregarFacturas(Factura nuevaFactura){
        this.facturas.add(nuevaFactura);
    }
//============================================================
    public Factura getFactura(int posicion){
        return this.facturas.get(posicion);
    }

    @Override
    public void aceptar(IVisitor visitor) {

        for(Factura factura : this.facturas){
            factura.aceptar(visitor);
        }
    }

}
