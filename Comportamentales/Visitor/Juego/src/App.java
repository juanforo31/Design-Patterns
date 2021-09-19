import java.util.ArrayList;
import java.util.List;

import classes.EquiparArma;
import classes.Guerrero;
import classes.Mago;
import interfaces.IPersonaje;
import interfaces.IVisitor;

public class App {
    public static void main(String[] args) throws Exception {

        // Creación de los elementos

        Guerrero leonidas = new Guerrero();
        leonidas.setNombre("Leonidas");
        
        Guerrero hercules = new Guerrero();
        hercules.setNombre("Hercules");
        
        Mago merlin = new Mago();
        merlin.setNombre("Merlin");
        
        Mago dumbledore  = new Mago();
        dumbledore.setNombre("Dumbledore");

        // Lista para guardar a los personajes
        List<IPersonaje> personajes = new ArrayList<>();

        // agregamos los elementos a la lista

        personajes.add(leonidas);
        personajes.add(hercules);
        personajes.add(merlin);
        personajes.add(dumbledore);

        // Creación del visitor y asignación de la lista
        IVisitor visitorArma = new EquiparArma();
        visitorArma.visit(personajes);

        // Comprobar el resultado
        
        String primerMensaje = "El arma del guerrero ";
        String segundoMensaje = " es la ";

        System.out.println(primerMensaje + leonidas.getNombre() + segundoMensaje + leonidas.getArma());
        System.out.println(primerMensaje + hercules.getNombre() + segundoMensaje + hercules.getArma());
        System.out.println(primerMensaje + merlin.getNombre() + segundoMensaje + merlin.getArma());
        System.out.println(primerMensaje + dumbledore.getNombre() + segundoMensaje + dumbledore.getArma());


        
    }
}
