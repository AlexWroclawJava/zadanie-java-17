import java.util.ArrayList;
import java.util.Random;

public class MultiArray {

    private int[][] Array;

    public MultiArray(int N, int M) {
        Array = new int[N][M];
        Random random = new Random();
        randomize();
    }

    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Array[i][j] = random.nextInt(100);
            }
        }
    }

    public int findMin() {
        int min = Array[0][0];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Array[i][j] < min)
                    min = Array[i][j];
            }
        }
        return min;
    }

    public int findMax() {
        int max = Array[0][0];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Array[i][j] > max)
                    max = Array[i][j];
            }
        }
        return max;
    }

    void print() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(Array[i][j] + " ");
            }
        }
    }
}


