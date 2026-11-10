package singletonPattern;

public class Application {

    private static Application instance;
    private String name;
    private int currentNumber;


    private Application() {

    }

    public static synchronized Application getInstance() {
        if (instance == null)
                instance = new Application();
        return instance;
    }

    public synchronized int currentNumber() {
        return currentNumber;
    }

    public synchronized void joinQueue(String name) {
        currentNumber++;
        System.out.println(" Welcome " + name + "!" + " Your number is: " + currentNumber);
    }

    public synchronized void resetQueue() {
        currentNumber = 0;
        System.out.println("Resetted the queue!");
    }
 
}