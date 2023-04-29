package org.example;

import javax.naming.spi.DirStateFactory;

public class Pronostico extends Equipo{

    private Partido partidoElegido;

    private Equipo equipoElegido;

    private resultadoEnum resultado;

    public Pronostico(String nombre, String descripcion, Partido partidoElegido, Equipo equipoElegido, resultadoEnum resultado) {
        super(nombre, descripcion);
        this.partidoElegido = partidoElegido;
        this.equipoElegido = equipoElegido;
        this.resultado = resultado;
    }

    public int puntos(){
        return 0;
    }
}
