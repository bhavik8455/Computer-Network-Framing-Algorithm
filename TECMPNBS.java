import java.util.*;

public class TECMPNBS {
  static Scanner obj = new Scanner(System.in);

  // ---------------------------------Character Count---------------------
  public void CharaterCount() {
    System.out.println("Enter the number of elements:");
    int n = obj.nextInt();

    List<Integer> list = new ArrayList<Integer>();
    int[] arr = new int[n + 1];
    System.out.println("Enter the  elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = obj.nextInt();
    }

    list.add((n / 2) + 1);
    for (int i = 0; i < n / 2; i++) {
      list.add(arr[i]);

    }
    list.add(n % 2 == 0 ? (n / 2) + 1 : n / 2 + 2);
    for (int i = (n / 2); i < n; i++) {
      list.add(arr[i]);

    }
    System.out.println("After performing Character Count  the data is: ");
    for (int i : list) {
      System.out.print(i + "\t");

    }

  }

  // -----------------------------Bit Stuffing-----------------------

  public void BitStuffing() {
    List<Integer> list = new ArrayList<>();
    int count = 0;

    System.out.println("The Frame is : 01111110");

    System.out.println("Enter the number of bits to be stuffed: ");
    int len = obj.nextInt();

    int[] arr = new int[len];

    System.out.println("Enter the bits to be stuffed: ");
    for (int i = 0; i < len; i++) {
      arr[i] = obj.nextInt();
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

    System.out.println("After performing Bit Stuffing  the data is: ");
    for (int bit : list) {
      System.out.print(bit + " ");
    }

  }

  // -------------------------------Byte Stuffing---------------------

  public void ByteStuffing() {
    String flag, Esc;
    List<String> list = new ArrayList<String>();

    System.out.println("Enter the length of data: ");
    int len = obj.nextInt();

    System.out.println("Enter the Flag: ");
    flag = obj.nextLine();

    System.out.println("Enter the ESC: ");
    Esc = obj.nextLine();

    String[] data = new String[len + 2];

    System.out.println("Enter the data: ");

    for (int i = 0; i < len + 2; i++) {
      if (i == 0) {
        data[i] = flag;
      } else if (i == len + 1) {
        data[i] = Esc;
      } else {
        data[i] = obj.nextLine();
      }
    }

    for (int i = 0; i <= len + 1; i++) {
      if (i == 0) {
        list.add(data[i]);
      } else {
        if ((data[i].equals(flag) || data[i].equals(Esc)) && i != len + 1) {
          list.add(data[i]);
          list.add(Esc);
        } else {
          list.add(data[i]);
        }
      }
    }

    System.out.println("After performing Byte Stuffing the data is: ");

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + "\t");
    }

  }

  // -------------------------------Physical Violation------------------

  public void PhysicalViolation() {

  }

  public static void main(String[] args) {

    System.out.println("1.Charater Count\n2.Bit Stuffing\n3.Byte Stuffing\n4.Physical Violation\n5.Exit");
    System.out.println("Enter your choice: ");
    int choice = obj.nextInt();
    TECMPNBS obj1 = new TECMPNBS();

    switch (choice) {
      case 1:
        obj1.CharaterCount();
        break;
      case 2:
        obj1.BitStuffing();
        break;
      case 3:
        obj1.ByteStuffing();
        break;
      // case 4 : PhysicalViolation.main(args);
      // break;
      default:
        System.exit(0);

    }

  }

}
