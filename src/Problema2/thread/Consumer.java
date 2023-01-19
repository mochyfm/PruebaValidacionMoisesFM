package Problema2.thread;

import Problema2.table.Table;

public class Consumer implements Runnable {

    String name;
    Table myTable;

    public Consumer(String name, Table table) {
        this.name = name;
        this.myTable = table;
    }

    @Override
    public void run() {
        while (myTable.foodAmount() > 0) {
            try {
                myTable.getFood(this.name);
                Thread.sleep(10 * 1000);
                System.out.println(this.name + " se ha terminado de comer una magdalena.");
            } catch (Exception excp) {
                excp.printStackTrace();
            }
        }
    }

}
