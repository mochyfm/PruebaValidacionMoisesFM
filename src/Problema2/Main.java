package Problema2;

import Problema2.table.Table;
import Problema2.thread.Consumer;

public class Main {

    public static void main(String[] args) {

        Table table = new Table(15, "Magdalena");

        Thread jose = new Thread(new Consumer("Jose", table));
        Thread juan = new Thread(new Consumer("Juan", table));
        Thread maria = new Thread(new Consumer("María", table));

        jose.setPriority(Thread.MIN_PRIORITY);
        juan.setPriority(Thread.NORM_PRIORITY);
        maria.setPriority(Thread.MAX_PRIORITY);

        jose.start();
        juan.start();
        maria.start();

    }

}
