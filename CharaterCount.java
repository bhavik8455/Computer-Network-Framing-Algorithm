import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CharaterCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();

    List<Integer> list = new ArrayList<Integer>();
    int[] arr = new int[n + 1];
    System.out.println("Enter the number of elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    list.add((n / 2) + 1);
    for (int i = 0; i < n / 2; i++) {
      list.add(arr[i]);

    }
    list.add(n % 2 == 0 ? (n / 2) + 1 : n / 2 + 2);
    for (int i = (n / 2); i < n; i++) {
      list.add(arr[i]);

    }

    for (int i : list) {
      System.out.print(i + "\t");
    }

  }

}
