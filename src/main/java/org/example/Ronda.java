package org.example;

public class Ronda extends Partido{

    private String nro_Ronda;

    private Partido[] partidos;

    public Ronda(String nombre, String descripcion, Equipo equipo1, Equipo equipo2, Integer golesEquipo1, Integer golesEquipo2, String nro_Ronda, Partido[] partidos) {
        super(nombre, descripcion, equipo1, equipo2, golesEquipo1, golesEquipo2);
        this.nro_Ronda = nro_Ronda;
        this.partidos = partidos;
    }
}
