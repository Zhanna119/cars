package com.example.cars.enums;

public enum Gearbox {
    AUTOMATIC(1),
    MANUAL(2);

    public int getGearboxNumber() {
        return gearboxNumber;
    }
    // todo подумать про сериализация

    private final int gearboxNumber;
    private Gearbox(int gearboxNumber) {
        this.gearboxNumber = gearboxNumber;
    }

}
