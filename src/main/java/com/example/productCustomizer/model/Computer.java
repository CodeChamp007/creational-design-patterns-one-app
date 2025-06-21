package com.example.productCustomizer.model;

public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String graphicsCard;
    private final String os;

    public Computer(String cpu, int ram, int storage, String graphicsCard, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.os = os;
    }

    public String getSpecs() {
        return "CPU: "+cpu + ", Ram:" + ram + " storage:" + storage + " graphicsCard: " + graphicsCard
                + " os: " + os;
    }
}
