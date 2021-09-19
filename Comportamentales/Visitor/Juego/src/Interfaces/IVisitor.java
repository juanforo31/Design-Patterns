package Interfaces;
import java.util.List;
import classes.Guerrero;
import classes.Mago;

public interface IVisitor {
    
public void visit(Mago m);
public void visit(Guerrero g);
public void visit(List<IPersonaje> elementList);

}
