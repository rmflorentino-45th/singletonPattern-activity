package singletonPattern;

public class Main {
    
    public static void main(String[] args) {
        
        Application app = Application.getInstance();

        app.joinQueue("Alex");
        app.joinQueue("Mark");
        app.joinQueue("John");

        app.resetQueue();

    }
    
}

