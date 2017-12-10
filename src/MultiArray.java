
public class MultiArray {
    public static void main(String[] args) {

        MultiArrayMethods multiArrayMethods = new MultiArrayMethods();
        System.out.println();

        int[][] tab = multiArrayMethods.randomize();
        System.out.print("Wyświetlona tablica jest poniżej: ");
        multiArrayMethods.print(tab);

        System.out.print("\n\nNajwiększa wartość w tablicy to: ");
        int max = multiArrayMethods.findMax(tab);
        System.out.println(max);

        System.out.print("\nNajmniejsza wartość w tablicy to: ");
        int min = multiArrayMethods.findMin(tab);
        System.out.println(min);
    }
}
