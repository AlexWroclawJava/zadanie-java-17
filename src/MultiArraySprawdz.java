import java.lang.reflect.Array;

public class MultiArraySprawdz {

    public static void main(String[] args) {

        MultiArray tablica = new MultiArray(6,6);
        tablica.randomize();

        System.out.print("\nNajwiększa wartość w tablicy to: ");
        int max = tablica.findMax();
        System.out.println(max);

        System.out.print("Najmniejsza wartość w tablicy to: ");
        int min = tablica.findMin();
        System.out.println(min);

        System.out.println("Wyświetlona tablica to: ");
        tablica.print();
    }
}
