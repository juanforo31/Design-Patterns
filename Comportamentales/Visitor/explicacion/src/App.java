import classes.Elemento;
import classes.ElementoL;
import classes.Visitante;

// importes

public class App {
    // colores para imprimir en consola
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        double totalCosto = 0;
        int totalObjetos = 0;
        int totalClasificaciones = 0;

        // creación de la estructura de datos en -Arból-

        Elemento botiquinElemento = new Elemento();
        botiquinElemento.setCosto(1);
        botiquinElemento.setNombre("Botiquin");

        Elemento termometroElemento = new Elemento();
        termometroElemento.setCosto(2);
        termometroElemento.setNombre("Termometro");

        Elemento antibioticoElemento = new Elemento();
        antibioticoElemento.setCosto(2);
        antibioticoElemento.setNombre("Antibiotico");

        Elemento antiacidoElemento = new Elemento();
        antiacidoElemento.setCosto(2);
        antiacidoElemento.setNombre("Antiacido");

        Elemento aspirinaElemento = new Elemento();
        aspirinaElemento.setCosto(2);
        antiacidoElemento.setNombre("Aspirina");

        Elemento antiinflamatorioElemento = new Elemento();
        antiinflamatorioElemento.setCosto(2);
        antiinflamatorioElemento.setNombre("Antiinflamatorio");

        Elemento gasaElemento = new Elemento();
        gasaElemento.setCosto(2);
        gasaElemento.setNombre("Gasa");

        Elemento cintaElemento = new Elemento();
        cintaElemento.setCosto(2);
        cintaElemento.setNombre("Cinta");

        Elemento tijerasElemento = new Elemento();
        tijerasElemento.setCosto(3);
        tijerasElemento.setNombre("Tijeras");

        botiquinElemento.hijo = termometroElemento;
        termometroElemento.hijo = new ElementoL(antibioticoElemento, gasaElemento);
        antibioticoElemento.hijo = antiacidoElemento;
        antiacidoElemento.hijo = new ElementoL(aspirinaElemento, antiinflamatorioElemento);
        aspirinaElemento.hijo = null;
        antiinflamatorioElemento.hijo = null;
        gasaElemento.hijo = cintaElemento;
        cintaElemento.hijo = tijerasElemento;
        tijerasElemento.hijo = null;


        // Visitar la estructura de datos
        Visitante visitante = new Visitante();
        visitante.ContarElementos(botiquinElemento);

        totalCosto = visitante.getTotal();
        totalClasificaciones = visitante.getClasificaciones();
        totalObjetos = visitante.getConteo();

        System.out.println("Se tienen " + totalObjetos + " objetos con un costo " + totalCosto + " en " + totalClasificaciones );



    }
}
