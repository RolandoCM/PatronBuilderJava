package com.quetzali;

public class Ordenador {

    private String type;
    private String so;
    private String memory;
    private String disk;
    private boolean batery;

    public Ordenador(String type){
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setBatery(boolean batery) {
        this.batery = batery;
    }

    public String getType() {
        return type;
    }

    public String getSo() {
        return so;
    }

    public String getMemory() {
        return memory;
    }

    public String getDisk() {
        return disk;
    }

    public boolean isBatery() {
        return batery;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "type='" + type + '\'' +
                ", so='" + so + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", batery=" + batery +
                '}';
    }
}
