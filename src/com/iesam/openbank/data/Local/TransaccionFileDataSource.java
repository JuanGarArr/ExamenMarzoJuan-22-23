package com.iesam.openbank.data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.openbank.domain.models.Cliente;
import com.iesam.openbank.domain.models.Transaccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TransaccionFileDataSource {
    private String TransaccionFileDataSource = "Transaccion.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Transaccion>>() {
    }.getType();

    public void save(Transaccion model) {
        List<Transaccion> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Transaccion> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Transaccion> models) {
        try {
            FileWriter myWriter = new FileWriter(TransaccionFileDataSource);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Transaccion findById(Integer id) {
        List<Transaccion> models = findAll();
        for (Transaccion model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Transaccion> findAll() {
        try {
            File myObj = new File(TransaccionFileDataSource);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(Integer modelId) {
        List<Transaccion> newList = new ArrayList<>();
        List<Transaccion> models = findAll();
        for (Transaccion model : models) {
            if (model.getId() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
