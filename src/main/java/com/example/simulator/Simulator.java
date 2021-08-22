package com.example.simulator;

import com.example.entity.Entity;
import java.io.IOException;

public class Simulator {
    Entity entity;
    public Simulator() throws IOException {
        this.entity = new Entity();

    }

    public void run() throws IOException, InterruptedException {
        String msg;
        msg = this.entity.action();
        System.out.println(msg);
    }

    public void runContinuous() throws IOException, InterruptedException {
        final int sleepSeconds = Integer.parseInt("300");
        String msg;
        while(true) {
        msg = this.entity.action();
            Thread.sleep(sleepSeconds * 1000);
        }
    }

    public static void main(String args[]) throws IOException, InterruptedException {
        System.out.println("Starting Simulation");
        new Simulator().run();
        System.out.println("Simulation Ended");
    }
}
