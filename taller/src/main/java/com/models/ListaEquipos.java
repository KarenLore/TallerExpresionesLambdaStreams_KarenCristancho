package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ListaEquipos implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("equipos")
    private List<Equipo> equipos;

    public ListaEquipos() {}

    public ListaEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() { return equipos; }

    @Override
    public String toString() {
        return "ListaEquipos{" +
                "equipos=" + equipos +
                '}';
    }
}