public class one {

    // Main method
    public static void main(String[] args) {
        one obj = new one();

        // Call another method inside main class
        int result = obj.add(5, 10);
        System.out.println("Result: " + result);

        obj.printMessage();
    }

    // Custom method inside the class
    public int add(int a, int b) {
        return a + b;
    }

    // Another method inside the class
    public void printMessage() {
        System.out.println("Hello from inside the main class!");
    }
}
