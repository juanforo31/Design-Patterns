package classes;

import interfaces.IElemento;
import interfaces.IVisitor;

public class Articulo implements IElemento{

    private String nombre;
    private int unidades;

    // contructores

    public Articulo(){
        this.nombre = "";
        this.unidades = 0;
    }
    
    public Articulo(String nombre, int unidades){
        this.nombre = nombre;
        this.unidades = unidades;
    }

    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    // aceptamos al visitor en esta clase
    public void aceptar(IVisitor visitor){
        visitor.visit(this);
    }
    
}
