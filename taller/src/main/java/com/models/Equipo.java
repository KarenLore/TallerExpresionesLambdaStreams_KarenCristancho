package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("yearfoundation")
    private String yearFoundation;

    @JsonProperty("statistics")
    private List<Estadisticas> statistics;

    @JsonProperty("players")
    private List<Jugador> players;

    @JsonProperty("coach")
    private String coach;

    public Equipo() {}

    public Equipo(int id, String name, String yearFoundation, List<Estadisticas> statistics, List<Jugador> players, String coach) {
        this.id = id;
        this.name = name;
        this.yearFoundation = yearFoundation;
        this.statistics = statistics;
        this.players = players;
        this.coach = coach;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getYearFoundation() { return yearFoundation; }
    public List<Estadisticas> getStatistics() { return statistics; }
    public List<Jugador> getPlayers() { return players; }
    public String getCoach() { return coach; }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearFoundation='" + yearFoundation + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}