package classes;

import Interfaces.CreadorAbstracto;
import Interfaces.IArchivo;

public class Creador extends CreadorAbstracto {

    public Creador() {
        // TODO
    }

    @Override
    public IArchivo crear(int tipo) {

        IArchivo objeto;

        switch (tipo) {

            case AUDIO:
                objeto = new ArchivoAudio();
                break;

            case VIDEO:
                objeto = new ArchivoVideo();
                break;

            default:
                objeto = null;
                break;
        }
        return objeto;

    }

}
