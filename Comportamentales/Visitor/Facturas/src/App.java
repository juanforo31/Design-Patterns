import classes.Articulo;
import classes.Factura;
import classes.GrupoFacturas;

public class App {
    public static void main(String[] args) throws Exception {

        // creación del grupo de Facturas
        GrupoFacturas grupoFacturas = new GrupoFacturas();

        // creación de facturas
        Factura factura1 = new Factura();
        factura1.agregarArticulo(new Articulo("Tornillos",40));
        factura1.agregarArticulo(new Articulo("Puntillas",80));
        factura1.agregarArticulo(new Articulo("Martillo",2));
        factura1.agregarArticulo(new Articulo("Taladro",1));
        
        Factura factura2 = new Factura();
        factura2.agregarArticulo(new Articulo("cable USB",1));
        factura2.agregarArticulo(new Articulo("Bombillo",10));
        factura2.agregarArticulo(new Articulo("destornillador",5));

        // agrupamos las facturas en el grupo de las facturas

        grupoFacturas




    }
}
