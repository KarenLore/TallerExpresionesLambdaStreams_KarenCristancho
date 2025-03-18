package com;

import com.models.ListaEquipos;
import com.utils.JsonReader;
import com.ui.Menu;

public class Main {
    public static void main(String[] args) {
        ListaEquipos listaEquipos = JsonReader.leerJson("uefa_teams_36_full_players.json");

        if(listaEquipos == null) {
            System.out.println("Error al cargar los datos.");
            return;
        }
        Menu.mostrarMenu(listaEquipos);
    }
}