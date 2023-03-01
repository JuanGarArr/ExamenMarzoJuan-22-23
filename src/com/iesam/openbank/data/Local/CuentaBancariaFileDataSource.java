package com.iesam.openbank.data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.openbank.domain.models.CuentaBancaria;
import com.iesam.openbank.domain.models.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CuentaBancariaFileDataSource {

    private String CuentaBancariaFileDataSource = "CuentaBancaria.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<CuentaBancaria>>() {
    }.getType();

    public void save(CuentaBancaria model) {
        List<CuentaBancaria> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<CuentaBancaria> models) {
        saveToFile(models);
    }

    private void saveToFile(List<CuentaBancaria> models) {
        try {
            FileWriter myWriter = new FileWriter(CuentaBancariaFileDataSource);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public CuentaBancaria findById(Integer id) {
        List<CuentaBancaria> models = findAll();
        for (CuentaBancaria model : models) {
            if (Objects.equals(model.getNumCuenta(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<CuentaBancaria> findAll() {
        try {
            File myObj = new File(CuentaBancariaFileDataSource);
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
        List<CuentaBancaria> newList = new ArrayList<>();
        List<CuentaBancaria> models = findAll();
        for (CuentaBancaria model : models) {
            if (model.getNumCuenta() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
