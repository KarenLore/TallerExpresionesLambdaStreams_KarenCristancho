package com.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Estadisticas implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("pj")
    private int pj; // Partidos jugados

    @JsonProperty("pg")
    private int pg; // Partidos ganados

    @JsonProperty("pe")
    private int pe; // Partidos empatados

    @JsonProperty("pp")
    private int pp; // Partidos perdidos

    @JsonProperty("gf")
    private int gf; // Goles a favor

    @JsonProperty("gc")
    private int gc; // Goles en contra

    @JsonProperty("tp")
    private int tp; // Total de puntos

    public Estadisticas() {}

    public Estadisticas(int pj, int pg, int pe, int pp, int gf, int gc, int tp) {
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.tp = tp;
    }

    public int getPj() { return pj; }
    public int getPg() { return pg; }
    public int getPe() { return pe; }
    public int getPp() { return pp; }
    public int getGf() { return gf; }
    public int getGc() { return gc; }
    public int getTp() { return tp; }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "pj=" + pj +
                ", pg=" + pg +
                ", pe=" + pe +
                ", pp=" + pp +
                ", gf=" + gf +
                ", gc=" + gc +
                ", tp=" + tp +
                '}';
    }
}
