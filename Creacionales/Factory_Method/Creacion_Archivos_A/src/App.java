import Interfaces.CreadorAbstracto;
import Interfaces.IArchivo;
import classes.Creador;

public class App {
    public static void main(String[] args) {

        CreadorAbstracto creador = new Creador();

        IArchivo audio = creador.crear(Creador.AUDIO);
        audio.reproducir();

        IArchivo video = creador.crear(Creador.VIDEO);
        video.reproducir();

    }
}
