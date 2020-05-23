package com.webczw.examinations.unit4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Vehicle> vehicles =new TreeSet<>();
        vehicles.add(new Vehicle(10123,"Ford"));
        vehicles.add(new Vehicle(10124,"BMW"));
        System.out.println(vehicles);

    }
}
