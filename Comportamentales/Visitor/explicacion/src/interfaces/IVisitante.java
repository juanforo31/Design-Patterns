package interfaces;

import classes.Elemento;
import classes.ElementoL;

public interface IVisitante {
    
    void Visitar(Elemento pElemento);
    void Visitar(ElementoL pElemento);
}

