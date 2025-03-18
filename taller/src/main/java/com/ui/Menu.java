package com.ui;

import com.models.ListaEquipos;
import com.challenges.RetosPropuestos;
import com.challenges.RetosAdicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void mostrarMenu(ListaEquipos listaEquipos) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n****************************");
            System.out.println("📌      MENÚ PRINCIPAL      ");
            System.out.println("****************************");
            System.out.println("1  Retos Propuestos");
            System.out.println("2  Retos Adicionales");
            System.out.println("3  Salir");
            System.out.println("****************************");
            System.out.print("🔹 Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> mostrarMenuRetosPropuestos(listaEquipos);
                    case 2 -> mostrarMenuRetosAdicionales(listaEquipos);
                    case 3 -> System.out.println("👋 ¡Hasta luego!");
                    default -> System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Debes ingresar un número válido.");
                scanner.nextLine(); 
                opcion = -1;
            }
        } while (opcion != 3);
        
        scanner.close();
    }

    private static void mostrarMenuRetosPropuestos(ListaEquipos listaEquipos) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n****************************");
            System.out.println("📌   RETOS PROPUESTOS   ");
            System.out.println("****************************");
            System.out.println("1  Listar Equipos Fundados Después del Año 2000");
            System.out.println("2  Imprimir Nombres de Entrenadores");
            System.out.println("3  Calcular el Promedio de Edad de Jugadores por Equipo");
            System.out.println("4  Listar Equipos con Más de 20 Victorias");
            System.out.println("5  Obtener el Jugador Más Alto de Cada Equipo");
            System.out.println("6  Calcular el Total de Goles por Equipo");
            System.out.println("7  Volver al Menú Principal");
            System.out.println("****************************");
            System.out.print("🔹 Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> RetosPropuestos.listarEquiposFundadosDespues2000(listaEquipos);
                    case 2 -> RetosPropuestos.imprimirEntrenadores(listaEquipos);
                    case 3 -> RetosPropuestos.calcularPromedioEdadJugadores(listaEquipos);
                    case 4 -> RetosPropuestos.listarEquiposMas20Victorias(listaEquipos);
                    case 5 -> RetosPropuestos.JugadorMasAltoPorEquipo(listaEquipos);
                    case 6 -> RetosPropuestos.calcularTotalGolesPorEquipo(listaEquipos);
                    case 7 -> System.out.println("🔙 Volviendo al menú principal...");
                    default -> System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Debes ingresar un número válido.");
                scanner.nextLine();
                opcion = -1;
            }
        } while (opcion != 7);
    }

    private static void mostrarMenuRetosAdicionales(ListaEquipos listaEquipos) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n****************************");
            System.out.println("📌   RETOS ADICIONALES   ");
            System.out.println("****************************");
            System.out.println("1  Listar Equipos con Más de 15 Puntos");
            System.out.println("2  Obtener el Promedio de Goles a Favor por Equipo");
            System.out.println("3  Mostrar el Equipo con Más Victorias");
            System.out.println("4  Encontrar el Jugador Más Alto de Todos los Equipos");
            System.out.println("5  Contar Cuántos Jugadores son Delanteros");
            System.out.println("6  Obtener Nombres de Entrenadores con al Menos un Empate");
            System.out.println("7  Crear un Mapa con Goles a Favor por Equipo");
            System.out.println("8  Listar los Jugadores Brasileños Ordenados por Edad");
            System.out.println("9  Filtrar los Equipos Cuyo Entrenador Tiene un Nombre Largo");
            System.out.println("10  Verificar si Algún Equipo Tiene Más de 25 Puntos");
            System.out.println("11  Agrupar Jugadores por Posición y Contar Cuántos Hay");
            System.out.println("12  Obtener Equipos con Más de 20 Goles a Favor Ordenados");
            System.out.println("13  Volver al Menú Principal");
            System.out.println("****************************");
            System.out.print("🔹 Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> RetosAdicionales.listarEquiposMas15Puntos(listaEquipos);
                    case 2 -> RetosAdicionales.calcularPromedioGolesAFavor(listaEquipos);
                    case 3 -> RetosAdicionales.encontrarEquipoMasVictorias(listaEquipos);
                    case 4 -> RetosAdicionales.encontrarJugadorMasAlto(listaEquipos);
                    case 5 -> RetosAdicionales.contarDelanteros(listaEquipos);
                    case 6 -> RetosAdicionales.obtenerEntrenadoresConEmpates(listaEquipos);
                    case 7 -> RetosAdicionales.mapearGolesPorEquipo(listaEquipos);
                    case 8 -> RetosAdicionales.listarBrasileñosOrdenadosPorEdad(listaEquipos);
                    case 9 -> RetosAdicionales.filtrarEntrenadoresNombreLargo(listaEquipos);
                    case 10 -> RetosAdicionales.verificarEquipoMas25Puntos(listaEquipos);
                    case 11 -> RetosAdicionales.contarJugadoresPorPosicion(listaEquipos);
                    case 12 -> RetosAdicionales.listarEquiposMas20GolesOrdenados(listaEquipos);
                    case 13 -> System.out.println("🔙 Volviendo al menú principal...");
                    default -> System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Debes ingresar un número válido.");
                scanner.nextLine();
                opcion = -1;
            }
        } while (opcion != 13);
    }
}