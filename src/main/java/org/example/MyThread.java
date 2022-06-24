package org.example;

public class MyThread extends Thread{

    public Changer changer;

    public MyThread(Changer changer) {
        this.changer = changer;
    }

    @Override
    public void run() {
        System.out.println("스레드 시작");
        while(changer.flag){

        }
        System.out.println("스레드 종료");
    }
}
