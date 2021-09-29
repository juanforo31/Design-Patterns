import java.util.Scanner;

import fabrica.Fabrica;
import observador.ObservadorConsola;
import fabrica.CreadorVacunas;
import vacunas.IVacuna;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static String mensajeTipoVacuna = "Seleccione una vacuna: \n 1. Pfizer \n 2. Astrazeneca ";
    static IVacuna pfizer;
    static IVacuna astrazeneca;

    // Patrón observer
    public static ObservadorConsola observadorConsolaPfizer;
    public static ObservadorConsola observadorConsolaAstrazeneca;

    public static void main(String[] args) {

        Fabrica creador = new CreadorVacunas();

        pfizer = creador.crearVacuna(Fabrica.PFIZER);
        astrazeneca = creador.crearVacuna(Fabrica.ASTRAZENECA);

        observadorConsolaPfizer = new ObservadorConsola(pfizer);
        observadorConsolaAstrazeneca = new ObservadorConsola(astrazeneca);

        SeleccionarProcedimiento();
    }

    private static void SeleccionarProcedimiento() {
        String procesoARealizar = "Desea: \n" + "1. Añadir vacunas \n" + "2. Suministrar vacunas \n"
                + "3. Ver existencias \n" + "0. Salir \n" + "Seleccione una opción";

        String mensajeNumeroDosis = "Cuantas dosis son: ";
        int cantidad = 0;

        System.out.println(procesoARealizar);
        int opcionProceso = sc.nextInt();

        if (opcionProceso == 1) {
            System.out.println(mensajeNumeroDosis);
            cantidad = sc.nextInt();
            AdicionarVacunas(cantidad);
        } else if (opcionProceso == 2) {
            System.out.println(mensajeNumeroDosis);
            cantidad = sc.nextInt();
            SuministrarVacunas(cantidad);
        } else if (opcionProceso == 3) {
            VerExistencias();
        } else {
            System.exit(0); // Salir de la aplicación
        }

        System.out.println(procesoARealizar);
    }

    private static void AdicionarVacunas(int cantidad) {

        System.out.println("");
        System.out.println(mensajeTipoVacuna);
        int opcionTipoVacuna = sc.nextInt();

        switch (opcionTipoVacuna) {
            case 1:

                pfizer.adicionarVacunas(cantidad);

                break;

            case 2:

                astrazeneca.adicionarVacunas(cantidad);

                break;

            default:
                break;
        }
        System.out.println("");
        SeleccionarProcedimiento();

    }

    private static void SuministrarVacunas(int cantidad) {
        System.out.println("");
        System.out.println(mensajeTipoVacuna);
        int opcionTipoVacuna = sc.nextInt();

        switch (opcionTipoVacuna) {
            case 1:

                pfizer.suministrarVacunas(cantidad);

                break;

            case 2:

                astrazeneca.suministrarVacunas(cantidad);

                break;

            default:
                break;
        }
        System.out.println("");
        SeleccionarProcedimiento();
    }

    private static void VerExistencias() {
        pfizer.verExistencias();
        astrazeneca.verExistencias();
        System.out.println("");
        SeleccionarProcedimiento();
    }
}
