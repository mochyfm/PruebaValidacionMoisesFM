package Problema1.threads;

import Problema1.marks.Marks;

public class Counter extends Thread {

    private int id;
    private int lengthToMeasure;
    private int startingIndex;
    private Marks marksList;
    private int sumQuantity = 0;

    public Counter(int id, int lengthToMeasure, int startingIndex, Marks marksToMeasure) {
        this.id = id;
        this.lengthToMeasure = lengthToMeasure;
        this.startingIndex = startingIndex;
        this.marksList = marksToMeasure;
    }

    public int getSumQuantity() {
        return this.sumQuantity;
    }

    @Override
    public void run() {

        for (int idx = startingIndex; idx < startingIndex + lengthToMeasure; idx++) {
            sumQuantity += marksList.getValue(idx);
        }

        System.out.println("El hilo con ID " + id + " ha terminado de sumar.");
    }

    @Override
    public String toString() {
        return "El hilo (" + id +
                ") empezó en el índice " + startingIndex +
                " y ha contado " + lengthToMeasure +
                " calificaciones y ha sumado un total de: " + sumQuantity;
    }

}
