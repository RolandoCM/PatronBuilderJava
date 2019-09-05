package com.quetzali;

public class Excecutor {
    public static void main(String [] args){
        Builder b = new ConcreteBuilder();

        Director director = new Director(b);
        Ordenador ordenador = director.builder();

        System.out.println(ordenador.toString());
    }
}
