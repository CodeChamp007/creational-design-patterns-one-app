package com.example.productCustomizer.builder;

import com.example.productCustomizer.model.Computer;

public class ComputerBuilder {
    private String cpu;
    private int ram;
    private int storage;
    private String graphicsCard;
    private String os;

    public ComputerBuilder setCpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, ram, storage, graphicsCard, os);
    }
}
