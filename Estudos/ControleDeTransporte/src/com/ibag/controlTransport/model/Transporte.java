package com.ibag.controlTransport.model;

public class Transporte {
    private Carga carga;
    private int diasEntrega;

    public Transporte(Carga carga, int diasEntrega){
        this.carga = carga;
        this.diasEntrega = diasEntrega;
    }
    
    public Carga getCarga() {
        return carga;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }
    
    @Override
    public String toString(){
        return  carga.toString() + ", Dias para entrega: "+ getDiasEntrega();
    }
}
