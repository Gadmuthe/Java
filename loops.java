public class LoopExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        int x = 5;
        do {
            System.out.println("Value of x: " + x);
            x--;
        } while (x > 0);
    }
}