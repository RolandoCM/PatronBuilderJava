package com.quetzali;

public class Director {

    private final Builder builderOrdenador;

    public Director(Builder bulderOrdenador){
        this.builderOrdenador = bulderOrdenador;
    }
    public Ordenador builder(){
        builderOrdenador.buildBatery();
        builderOrdenador.buildDisk();
        builderOrdenador.buildMemory();
        builderOrdenador.buildSO();
        return builderOrdenador.getObject();
    }

}
