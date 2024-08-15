import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BitStuffing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 0;

        System.out.println("The Frame is : 01111110");

        System.out.println("Enter the number of bits to be stuffed: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the bits to be stuffed: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++) {

            list.add(arr[i]);

            if (arr[i] == 1) {
                count++;
            } else {

                count = 0;
            }

            if (count == 5) {
                list.add(0);
                count = 0;
            }
        }

        System.out.println("The stuffed bits are: ");
        for (int bit : list) {
            System.out.print(bit + " ");
        }
    }
}
