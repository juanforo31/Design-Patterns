package interfaces;

import classes.Articulo;
import classes.Factura;

public interface IVisitor {
    
    public void visit(Factura factura);
    public void visit(Articulo articulo);

}
