import java.util.Random;

public class TwoArrays {
    int[][] a = new int[3][3];

    public static void main(String[] args) {
        TwoArrays obj = new TwoArrays(); // Create an instance of TwoArrays
        obj.genRandNum();
        obj.display();
        obj.sumRow();
        obj.sumAll();
    }

    public void genRandNum() {
        Random rand = new Random();
        // Loop through rows and columns
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // Generate number between 0-100
                a[i][j] = rand.nextInt(101); // Corrected random number generation
            }
        }
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // Print row and columns
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumRow() {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                // Sum of rows
                sum += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public void sumAll() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // Sum of all
                sum += a[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
