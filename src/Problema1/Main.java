package Problema1;

import java.util.ArrayList;

import Problema1.marks.Marks;
import Problema1.threads.Counter;

public class Main {

    public static void main(String[] args) throws Exception {

        Marks marksList = new Marks(100000);
        ArrayList<Counter> counterList = new ArrayList<>();
        Boolean notFinnished = false;
        Double average = 0d;

        for (int idx = 0; idx < 10; idx++) {
            counterList.add(new Counter((idx + 1), 10000, (idx * 10000), marksList));
        }

        for (int idx = 0; idx < counterList.size(); idx++) {
            counterList.get(idx).start();
        }

        while (!notFinnished) {
            notFinnished = true;
            for (int idx = 0; idx < counterList.size(); idx++) {
                if (counterList.get(idx).isAlive()) {
                    notFinnished = false;
                }
            }
        }

        System.out.println("\n \u001B[33m WARNING:\u001B[0m Los hilos han terminado. \n");
        for (int idx = 0; idx < counterList.size(); idx++) {
            average += counterList.get(idx).getSumQuantity();
            System.out.println(counterList.get(idx).toString());
        }

        average = average / marksList.length();

        if (average == marksList.getArAverage()) {
            System.out.println(
                    "\nLa media aritmética es de " + average + "\u001B[32m (COMPROBADO) \u001B[0m");
            System.out.println("\nMedia del array: " + marksList.getArAverage());
            System.out.println("Media de los hilos: " + average + "\n");
        } else {
            System.out.println("ERROR: El cálculo es incorrecto");
        }

    }

}
