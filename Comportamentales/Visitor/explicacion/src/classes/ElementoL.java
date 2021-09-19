package classes;

import interfaces.IVisitante;

public class ElementoL extends Elemento  {

    
    public ElementoL(Elemento pDatos, Elemento pHijo){
        datos = pDatos;
        hijo = pHijo;
    }
    
    @Override
    public void Aceptar(IVisitante pVisitante) {
        
        pVisitante.Visitar(this);

    }
}


