package com.iesam.openbank.domain.models;

public class Transaccion {
    private Integer id;
    private String desc;
    private String importe;
    private String ingresos;
    private String gastos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String getPagos() {
        return gastos;
    }

    public void setPagos(String pagos) {
        this.gastos = gastos;
    }
}
