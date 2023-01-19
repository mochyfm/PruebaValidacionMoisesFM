package Problema1.marks;

import java.util.ArrayList;

public class Marks {

    public ArrayList<Integer> califications;
    private int numberOfCalifications;

    private final int DEFAULT_LENGTH = 100000;

    public Marks(int numberOfCalifications) {
        this.numberOfCalifications = numberOfCalifications;
        this.califications = createMarkArray(numberOfCalifications);
    }

    public Marks() {
        this.numberOfCalifications = DEFAULT_LENGTH;
        this.califications = createMarkArray(this.DEFAULT_LENGTH);
    }

    private ArrayList<Integer> createMarkArray(int arrLen) {
        ArrayList<Integer> listToReturn = new ArrayList<Integer>();
        for (int index = 0; index < arrLen; index++) {
            int randomMark = (int) (Math.random() * 10);
            listToReturn.add(randomMark);
        }

        return listToReturn;

    }

    public int length() {
        return califications.size();
    }

    public int getValue(int position) {
        return califications.get(position);
    }

    public double getArAverage() {
        double sum = 0;
        for (int index = 0; index < numberOfCalifications; index++) {
            sum += this.getValue(index);
        }
        return sum / numberOfCalifications;
    }

    @Override
    public String toString() {
        String outputString = "[ ";
        for (int idx = 0; idx < this.length(); idx++) {
            outputString += califications.get(idx) + " - ";
        }
        outputString += " ]";
        return outputString;
    }

}
