package com.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.ListaEquipos;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static ListaEquipos leerJson(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(filePath), ListaEquipos.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}