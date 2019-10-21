package thread.creation.example;

public class Main {
    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.run();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am " + this.getName());
        }
    }
}
