package classes;

import java.util.ArrayList;

import interfaces.IElemento;
import interfaces.IVisitor;

public class ListaEquipos implements IElemento {

    private ArrayList<Equipo> listaEquipos = new ArrayList<>();

    public void agregarEquipos(Equipo nuevoEquipo) {

        this.listaEquipos.add(nuevoEquipo);
    }

    @Override
    public void aceptar(IVisitor visitante) {

        if (this.listaEquipos != null && this.listaEquipos.size() > 0) {
            System.out.println("Equipos [" + this.listaEquipos.size() + "]" );
            for (Equipo equipo : this.listaEquipos) {
                equipo.aceptar(visitante);
            }
        }

    }

}
