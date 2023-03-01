package com.iesam.openbank.data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.openbank.domain.models.Cliente;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ClienteFileDataSource {

    private String ClienteFileDataSource = "Cliente.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Cliente>>() {
    }.getType();

    public void save(Cliente model) {
        List<Cliente> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Cliente> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Cliente> models) {
        try {
            FileWriter myWriter = new FileWriter(ClienteFileDataSource);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Cliente findById(Integer id) {
        List<Cliente> models = findAll();
        for (Cliente model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Cliente> findAll() {
        try {
            File myObj = new File(ClienteFileDataSource);
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
        List<Cliente> newList = new ArrayList<>();
        List<Cliente> models = findAll();
        for (Cliente model : models) {
            if (model.getId() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
