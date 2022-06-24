package org.example;

public class Main {

    volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        Changer changer = new Changer();
        Changer changer1 = new Changer();

        MyThread myThread = new MyThread(changer);
        myThread.start();

        MyThread myThread21 = new MyThread(changer1);
        myThread21.start();

        Thread.sleep(3000);
//        Changer.changer.flag = false;
        changer.flag = false;
    }

}