package classes;

import java.util.List;

import interfaces.IPersonaje;
import interfaces.IVisitor;

public class EquiparArma implements IVisitor {

    @Override
    public void visit(Mago m) {
        m.setArma("Varita");
        
    }
    
    @Override
    public void visit(Guerrero g) {
        g.setArma("Espada");
        
    }
    
    @Override
    public void visit(List<IPersonaje> personajes ) {

        for( IPersonaje p : personajes){
            p.accept(this);
        }
        
    }
    
}
