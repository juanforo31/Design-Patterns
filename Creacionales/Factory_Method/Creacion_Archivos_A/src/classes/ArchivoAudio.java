package classes;

import Interfaces.IArchivo;

public class ArchivoAudio implements IArchivo {

    // constrcutore
    public ArchivoAudio() {
        // TODO: aca se colocaran los atributos un archivo de audio
    }

    // --------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de audio ... ");
    }

}
