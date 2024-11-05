package org.example;

public class RunnableGreet implements Runnable{
    private String name;

    public RunnableGreet (String n) {
        this.name=n;
    }

    @Override
    public void run() {
        System.out.println("How are you? "+name);

    }
}
