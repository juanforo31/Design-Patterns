package classes;

import interfaces.IVisitante;

public class Visitante implements IVisitante{

    private int conteo;
    private int clasificaciones;
    private int total;


    // Getters y setters
    public int getConteo() {
        return conteo;
    }

    public int getClasificaciones() {
        return clasificaciones;
    }

    public int getTotal() {
        return total;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
    public void setClasificaciones(int clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    //----------------------------------------------------------
    public void ContarElementos(Elemento pElemento){

        // Envia como elemento al visitante
        pElemento.Aceptar(this);

        // Validación de si hay datos
        if (pElemento.datos != null){
            ContarElementos(pElemento.datos);
        }

        // Validación si hay un hijo
        if (pElemento.hijo != null){
            ContarElementos(pElemento.hijo);
        }

    }

    //-----------------------------------------------------------
    public void Visitar(Elemento pElemento){
        conteo++;
        total += pElemento.getCosto(); 
    }

    
    public void Visitar(ElementoL pElementoL){
        clasificaciones++;
    }
    
    
}
    

