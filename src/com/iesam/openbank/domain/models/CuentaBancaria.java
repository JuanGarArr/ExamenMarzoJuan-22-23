package com.iesam.openbank.domain.models;

public class CuentaBancaria {
    private Integer numCuenta;
    private Cliente titular;
    private Transaccion transaccion;
    private Producto producto;
    private String saldo;


    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
