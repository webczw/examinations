package com.webczw.examinations.unit4;

public class Vehicle {
    int vno;
    String name;

    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }

}
