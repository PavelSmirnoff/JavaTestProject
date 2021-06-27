package dev.smirnoff;

import lombok.SneakyThrows;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MyThread();

        Thread t2 = new Thread(new MyRunnable());

        t2.setDaemon(true);

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("MultiThreading is Work " + i);
            Thread.sleep((long)(Math.random()*500));
        }

        t1.join();

        System.out.println("END");
    }
}

class MyThread extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread is Work " + i);
            Thread.sleep((long)(Math.random()*800));
        }
    }
}

class MyRunnable implements Runnable{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable is Work " + i);
            Thread.sleep((long)(Math.random()*1000));
        }
    }
}
