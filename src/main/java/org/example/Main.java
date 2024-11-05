package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static final int NUM_THREADS = 6;

    public static void main(String[] args) {
        String [] names = {"Pepe", "manolo", "benito", "alicia", "papilla", "medaigual"};

        //para crear pool siempre pillamos ExecutorService, es el import necesario
        //no se instancia directamente, usamos un Builder de Executors
        // le pasamos el número de hilos, en este caso la constante y así se crea ya el pool
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            Runnable rg = new RunnableGreet(names[i]);
            pool.execute(rg);

        }
        // si no le especificamos shutdown, el programa sigue ejecutándose
        // si comentamos esta llamada, vemos que al ejecutar el programa sale la luz verde que indica que el programa sigue ejecutándose

        pool.shutdown();
    }
}