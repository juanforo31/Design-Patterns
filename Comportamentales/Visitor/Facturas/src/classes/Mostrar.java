package classes;

import interfaces.IVisitor;

public class Mostrar implements IVisitor {

    @Override
    public void visit(Factura factura) {

        System.out.println("=========================");
        System.out.println( "Factura número [" + factura.getCodigo() + "]" );
        
    }

    @Override
    public void visit(Articulo articulo) {
        
        System.out.println("=========================");
        System.out.println( "Factura número [" + articulo.getUnidades() + "]" );

    }
    
}
