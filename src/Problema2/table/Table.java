package Problema2.table;

import java.util.ArrayList;

public class Table {

    private int foodAmount;
    private ArrayList<String> table;

    public Table(int surfaceSize, String food) {
        this.table = fillTable(surfaceSize, food);
        this.foodAmount = surfaceSize;
    }

    private ArrayList<String> fillTable(int surfaceSize, String foodToFillWith) {
        ArrayList<String> listToReturn = new ArrayList<String>(surfaceSize);
        for (int index = 0; index < surfaceSize; index++) {
            listToReturn.add(foodToFillWith);
        }
        return listToReturn;
    }

    synchronized public int length() {
        return table.size();
    }

    synchronized public int foodAmount() {
        return this.foodAmount;
    }

    synchronized public boolean getFood(String consumer) {
        if (foodAmount > 0) {
            this.table.get(0);
            foodAmount--;
            System.out.println(consumer + " ha cogido una magdalena de la mesa.");
            return true;
        }
        return false;
    }

}
