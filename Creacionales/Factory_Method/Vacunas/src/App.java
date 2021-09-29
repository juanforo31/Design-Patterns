import java.util.Scanner;

import fabrica.Fabrica;
import observador.ObservadorConsola;
import fabrica.CreadorVacunas;
import vacunas.IVacuna;

public class App {
    // Estilo
    public static final String LINES = "------------------------------------------------------";
    public static final String DOUBLE_LINES = "=====================================================";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    private static Scanner sc = new Scanner(System.in);
    private static String mensajeTipoVacuna = "Seleccione el número de la vacuna: \n" + ANSI_GREEN + "1." + ANSI_RESET
            + " Pfizer \n" + ANSI_GREEN + "2." + ANSI_RESET + " Astrazeneca \n" + ANSI_GREEN + "3." + ANSI_RESET
            + " Janssen \n" + ANSI_GREEN + "4." + ANSI_RESET + " Moderna \n" + ANSI_GREEN + "0." + ANSI_RESET
            + " Volver \n";

    static IVacuna pfizer;
    static IVacuna astrazeneca;
    static IVacuna janssen;
    static IVacuna moderna;

    // Patrón observer
    public static ObservadorConsola observadorConsolaPfizer;
    public static ObservadorConsola observadorConsolaAstrazeneca;
    public static ObservadorConsola observadorConsolaJanssen;
    public static ObservadorConsola observadorConsolaModerna;

    public static void main(String[] args) {

        Fabrica creador = new CreadorVacunas();

        pfizer = creador.crearVacuna(Fabrica.PFIZER);
        astrazeneca = creador.crearVacuna(Fabrica.ASTRAZENECA);
        janssen = creador.crearVacuna(Fabrica.JANSSEN);
        moderna = creador.crearVacuna(Fabrica.MODERNA);

        observadorConsolaPfizer = new ObservadorConsola(pfizer);
        observadorConsolaAstrazeneca = new ObservadorConsola(astrazeneca);
        observadorConsolaJanssen = new ObservadorConsola(janssen);
        observadorConsolaModerna = new ObservadorConsola(moderna);

        SeleccionarProcedimiento();
    }

    private static void SeleccionarProcedimiento() {
        String procesoARealizar = "Seleccione el número del proceso a realizar: \n" + ANSI_GREEN + "1." + ANSI_RESET
                + " Añadir vacunas \n" + ANSI_GREEN + "2." + ANSI_RESET + " Suministrar vacunas \n" + ANSI_GREEN + "3."
                + ANSI_RESET + " Ver existencias \n" + ANSI_GREEN + "0." + ANSI_RESET + " Salir \n";

        String mensajeNumeroDosis = "Cuantas dosis son: ";
        int cantidad = 0;

        System.out.println(DOUBLE_LINES);
        System.out.println(procesoARealizar);
        int opcionProceso = sc.nextInt();

        switch (opcionProceso) {
            case 1:

                System.out.println(LINES + "\n" + mensajeNumeroDosis);
                cantidad = sc.nextInt();

                if (cantidad <= 0) {

                    System.out.println("Cantidad invalida");
                    SeleccionarProcedimiento();

                } else {

                    AdicionarVacunas(cantidad);

                }

                break;

            case 2:

                System.out.println(LINES + "\n" + mensajeNumeroDosis);
                cantidad = sc.nextInt();

                if (cantidad <= 0) {

                    System.out.println("Cantidad invalida");
                    SeleccionarProcedimiento();

                } else {

                    SuministrarVacunas(cantidad);

                }

                break;
            case 3:

                VerExistencias();

                break;
            case 0:

                System.exit(0); // Salir de la aplicación

                break;

            default:

                System.out.println("Número invalido");
                SeleccionarProcedimiento();

                break;
        }

    }

    private static void AdicionarVacunas(int cantidad) {

        System.out.println(DOUBLE_LINES);
        System.out.println(mensajeTipoVacuna);
        int opcionTipoVacuna = sc.nextInt();

        switch (opcionTipoVacuna) {
            case 1:

                pfizer.adicionarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 2:

                astrazeneca.adicionarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 3:

                janssen.adicionarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 4:

                moderna.adicionarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 0:

                SeleccionarProcedimiento();

                break;

            default:

                System.out.println("Número invalido");
                AdicionarVacunas(cantidad);

                break;
        }

    }

    private static void SuministrarVacunas(int cantidad) {

        System.out.println(DOUBLE_LINES);
        System.out.println(mensajeTipoVacuna);
        int opcionTipoVacuna = sc.nextInt();

        switch (opcionTipoVacuna) {
            case 1:

                pfizer.suministrarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 2:

                astrazeneca.suministrarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 3:

                janssen.suministrarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 4:

                moderna.suministrarVacunas(cantidad);
                SeleccionarProcedimiento();

                break;

            case 0:

                SeleccionarProcedimiento();

                break;

            default:

                System.out.println("Número invalido");
                SuministrarVacunas(cantidad);

                break;
        }

    }

    private static void VerExistencias() {

        System.out.println(DOUBLE_LINES);
        pfizer.verExistencias();
        astrazeneca.verExistencias();
        janssen.verExistencias();
        moderna.verExistencias();

        System.out.println("");
        SeleccionarProcedimiento();
    }
}
