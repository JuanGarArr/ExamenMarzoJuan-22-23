package com.iesam.openbank.data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.openbank.domain.models.Producto;
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

public class ProductoFileDataSource {

    private String ProductoFileDataSource = "Producto.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Producto>>() {
    }.getType();

    public void save(Producto model) {
        List<Producto> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Producto> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Producto> models) {
        try {
            FileWriter myWriter = new FileWriter(ProductoFileDataSource);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Producto findById(Integer id) {
        List<Producto> models = findAll();
        for (Producto model : models) {
            if (Objects.equals(model.getCod(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Producto> findAll() {
        try {
            File myObj = new File(ProductoFileDataSource);
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
        List<Producto> newList = new ArrayList<>();
        List<Producto> models = findAll();
        for (Producto model : models) {
            if (model.getCod() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
