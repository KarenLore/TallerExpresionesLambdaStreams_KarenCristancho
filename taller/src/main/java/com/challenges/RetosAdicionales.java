package com.challenges;

import com.models.ListaEquipos;
import com.models.Equipo;
import com.models.Jugador;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class RetosAdicionales {

    // 1. Listar equipos con más de 15 puntos en la fase de liga
    public static void listarEquiposMas15Puntos(ListaEquipos listaEquipos){
        Predicate<Equipo> filtro = e -> e.statistics.get(0).tp > 15;
        listaEquipos.equipos.stream()
            .filter(filtro)
            .map(e -> e.name)
            .forEach(System.out::println);
    }

    // 2. Obtener el promedio de goles a favor por equipo
    public static void calcularPromedioGolesAFavor(ListaEquipos listaEquipos){
        double promedioGoles = listaEquipos.equipos.stream()
            .collect(Collectors.averagingInt(e -> e.statistics.get(0).gf));

            System.out.println("promedio de goles a favor: " + promedioGoles);
    }

    // 3. Mostrar el equipo con más victorias
    public static void encontrarEquipoMasVictorias(ListaEquipos listaEquipos){
        listaEquipos.equipos.stream()
            .max(Comparator.comparingInt(e -> e.statistics.get(0).pg))
            .ifPresent(equipo -> System.out.println("Equipo con más victorias: " + equipo.name + " (" + equipo.statistics.get(0).pg + " Victorias."));
    }

    // 4. Encontrar el jugador más alto de todos los equipos
    public static void encontrarJugadorMasAlto(ListaEquipos listaEquipos){
        listaEquipos.equipos.stream()
        .flatMap(e -> e.players.stream())
        .max(Comparator.comparingInt(j -> j.height))
        .ifPresent(jugador -> System.out.println("Jugador más alto: " + jugador.name + " (" + jugador.height + " cm"));
    }

    // 5. Contar cuántos jugadores son delanteros en toda la UEFA Champions League
    public static void contarDelanteros(ListaEquipos listaEquipos){
        long totalDelanteros = listaEquipos.equipos.stream()
        .flatMap(e -> e.players.stream())
        .filter(j -> j.position.equals("Delantero"))
        .count();

        System.out.println("Total de delanteros: " + totalDelanteros);
    }

    // 6. Obtener los nombres de los entrenadores de los equipos que han empatado al menos un partido
    public static void obtenerEntrenadoresConEmpates(ListaEquipos listaEquipos){
        listaEquipos.equipos.stream()
            .filter(e -> e.statistics.get(0).pe > 0)
            .map(e -> e.coach)
            .forEach(System.out::println);
    }

    // 7. Crear un Map con los nombres de los equipos como clave y la cantidad total de goles a favor como valor
    public static void mapearGolesPorEquipo(ListaEquipos listaEquipos){
        Map<String, Integer> golesPorEquipo = listaEquipos.equipos.stream()
            .collect(Collectors.toMap(e -> e.name, e -> e.statistics.get(0).gf));

            golesPorEquipo.forEach((equipo, goles) -> System.out.println(equipo + ": " + goles));
    }

    // 8. Listar los jugadores de nacionalidad "Brasileño" y ordenarlos por edad
    public static void listarBrasileñosOrdenadosPorEdad(ListaEquipos listaEquipos){
        listaEquipos.equipos.stream()
        .flatMap(e -> e.players.stream())
        .filter(j -> j.nationality.equals("Brasileño"))
        .sorted(Comparator.comparingInt(j -> j.age))
        .forEach(j -> System.out.println(j.name + "-" + j.age + " años"));
    }

    // 9. Filtrar los equipos cuyo entrenador tiene más de 10 caracteres en su nombre
    public static void filtrarEntrenadoresNombreLargo(ListaEquipos listaEquipos){
        listaEquipos.equipos.stream()
        .filter(e -> e.coach.length() > 10)
        .map(e -> e.name + " - " + e.coach)
        .forEach(System.out::println);
    }

    // 10. Determinar si algún equipo tiene más de 25 puntos
    public static void verificarEquipoMas25Puntos(ListaEquipos listaEquipos) {
        boolean existe = listaEquipos.equipos.stream()
            .anyMatch(e -> e.statistics.get(0).tp > 25);
        
    System.out.println("¿Algún equipo tiene más de 25 puntos? " + (existe ? "Sí" : "No"));
    }

    // 10.1. Agrupar los jugadores por posición y contar cuántos hay en cada una
    public static void contarJugadoresPorPosicion(ListaEquipos listaEquipos) {
        Map<String, Long> conteoPosiciones = listaEquipos.equipos.stream()
            .flatMap(e -> e.players.stream())
            .collect(Collectors.groupingBy(j -> j.position, Collectors.counting()));

        System.out.println("Jugadores por posición:");
        conteoPosiciones.forEach((posicion, cantidad) -> System.out.println(posicion + ": " + cantidad));
    }

    // 10.2. Obtener los equipos con más de 20 goles a favor ordenados de mayor a menor
    public static void listarEquiposMas20GolesOrdenados(ListaEquipos listaEquipos) {
        listaEquipos.equipos.stream()
            .filter(e -> e.statistics.get(0).gf > 20)  
            .sorted(Comparator.comparingInt(e -> -e.statistics.get(0).gf))  
            .forEach(e -> System.out.println(e.name + " - Goles a favor: " + e.statistics.get(0).gf));
    }
}

