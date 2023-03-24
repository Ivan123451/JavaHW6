package org.example;

public class Laptop {
    String name;
    int numberOfCores;
    String collor;
    int memory;
    int monitorSize;

    public Laptop(String name, Integer numberOfCores, String collor, Integer memory, Integer monitorSize) {
        this.name = name;
        this.numberOfCores = numberOfCores;
        this.collor = collor;
        this.memory = memory;
        this.monitorSize = monitorSize;
    }

    @Override
    public String toString() {
        return "ноутбук со следующими параметрами: " +
                "Название = " + name +
                ", Количестов ядер = " + numberOfCores +
                ", цвет = '" + collor + '\'' +
                ", оперативаня память = " + memory +
                ", размер экрана = " + monitorSize +
                '}';
    }


    public void setMemory(int memory) {
        this.memory = memory;
    }
}
