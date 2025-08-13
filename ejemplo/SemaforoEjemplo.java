package ejemplo;

import java.util.concurrent.Semaphore;

public class SemaforoEjemplo {

    private static final Semaphore semaforo = new Semaphore(2);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            new Thread(() -> tarea(id)).start();
        }
    }

    private static void tarea(int id) {
        try {
            System.out.println("Hilo " + id + " esperando permiso...");
            semaforo.acquire();
            System.out.println("Hilo " + id + " obtuvo permiso.");
            Thread.sleep(2000); // Simula trabajo
            System.out.println("Hilo " + id + " libera permiso.");
            semaforo.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
