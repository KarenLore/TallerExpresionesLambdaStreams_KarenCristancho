package com.challenges;

import com.models.ListaEquipos;
import com.models.Equipo;
import com.models.Jugador;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RetosPropuestos {

    // a. Listado de Equipos Fundados Después del Año 2000:
    public static void listarEquiposFundadosDespues2000(ListaEquipos listaEquipos) {
        Predicate<Equipo> filtro = e -> Integer.parseInt(e.yearfoundation) > 2000;
        listaEquipos.equipos.stream()
                .filter(filtro)
                .map(e -> e.name)
                .forEach(System.out::println);
    }

    // b. Impresión de Nombres de Entrenadores:
    public static void imprimirEntrenadores(ListaEquipos listaEquipos) {
        Consumer<Equipo> imprimirCoach = e -> System.out.println(e.coach);
        listaEquipos.equipos.forEach(imprimirCoach);
    }

    // c. Cálculo del Promedio de Edad de Jugadores por Equipo:
    public static void calcularPromedioEdadJugadores(ListaEquipos listaEquipos){
        BiConsumer<Equipo, List<Jugador>> promedioEdad = (equipo, jugadores) -> {
                double promedio = jugadores.stream()
                    .mapToInt(j -> j.age)
                    .average()
                    .orElse(0);
                System.out.println(equipo.name + ": " + promedio + " años.");
            };
        listaEquipos.equipos.forEach(e -> promedioEdad.accept(e, e.players));
    }

    // d. Listado de Equipos con Más de 20 Victorias:
    public static void listarEquiposMas20Victorias(ListaEquipos listaEquipos){
        Predicate<Equipo> filtro = e -> e.statistics.get(0).pg > 20;
            listaEquipos.equipos.stream()
                .filter(filtro)
                .map(e -> e.name)
                .forEach(System.out::println);
    }

    // e. Obtención del Jugador Más Alto de Cada Equipo:
    public static void JugadorMasAltoPorEquipo(ListaEquipos listaEquipos){
        listaEquipos.equipos.forEach(e -> {
            e.players.stream()
                .max(Comparator.comparingInt(j -> j.height))
                .ifPresent(jugador -> System.out.println(e.name + ": " + jugador.name + " (" + jugador.height + " cm"));
        });
    }

    // f. Cálculo del Total de Goles por Equipo:
    public static void calcularTotalGolesPorEquipo(ListaEquipos listaEquipos){
        listaEquipos.equipos.forEach(e ->{
            int totalGoles = e.statistics.get(0).gf;
            System.out.println(e.name + ": " + totalGoles + " goles a favor");
        });
    }
}
