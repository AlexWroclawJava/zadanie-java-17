import java.util.Random;

public class MultiArrayMethods {

    private int [][] MultiArray = new int [8][8];

        public int[][] randomize() {
            Random random = new Random();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    MultiArray[i][j] = random.nextInt(100);
                }
            }
            return MultiArray;
        }

        public int findMin (int[][] MultiArray) {
            int min = MultiArray[0][0];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (MultiArray[i][j] < min)
                        min = MultiArray[i][j];
                }
            }
            return min;
        }


        public int findMax (int[][] MultiArray) {
            int max = MultiArray[0][0];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (MultiArray[i][j] > max)
                        max = MultiArray[i][j];
                }
            }
            return max;
        }

        void print(int[][] MultiArray) {
            for (int i = 0; i < 8; i++) {
                System.out.println();
                for (int j = 0; j < 8; j++) {
                    System.out.print(MultiArray[i][j] + " ");
                }
            }
        }
}


