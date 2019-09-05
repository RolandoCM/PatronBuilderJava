package com.quetzali;

public class ConcreteBuilder implements Builder{

    private final Ordenador ordenador= new Ordenador("laptop");
    @Override
    public void buildBatery() {
        ordenador.setBatery(true);
    }

    @Override
    public void buildDisk() {
        ordenador.setDisk("Disco del ordenador 1 TB ");
    }

    @Override
    public void buildMemory() {
        ordenador.setMemory("Memoria del ordenador 8 GB");

    }

    @Override
    public void buildSO() {
        ordenador.setSo("Linux");
    }

    @Override
    public Ordenador getObject() {
        return ordenador;
    }
}
