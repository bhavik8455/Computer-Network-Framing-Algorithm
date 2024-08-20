import java.util.*;

public class TECMPNBS {
  static Scanner obj = new Scanner(System.in);

  // Character Count
  public void characterCount() {
    System.out.println("Enter the number of elements:");
    int n = obj.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++)
      arr[i] = obj.nextInt();

    List<Integer> list = new ArrayList<>();
    list.add((n / 2) + 1);
    for (int i = 0; i < n / 2; i++)
      list.add(arr[i]);
    list.add(n % 2 == 0 ? (n / 2) + 1 : (n / 2) + 2);
    for (int i = n / 2; i < n; i++)
      list.add(arr[i]);

    System.out.println("After performing Character Count the data is: ");
    list.forEach(i -> System.out.print(i + "\t"));
  }

  // Bit Stuffing
  public void bitStuffing() {
    System.out.println("The Flag is : 01111110");
    System.out.println("Enter the number of bits to be stuffed: ");
    int len = obj.nextInt();
    int[] arr = new int[len];
    System.out.println("Enter the bits to be stuffed: ");
    for (int i = 0; i < len; i++)
      arr[i] = obj.nextInt();

    List<Integer> list = new ArrayList<>();
    int count = 0;
    for (int bit : arr) {
      list.add(bit);
      count = (bit == 1) ? count + 1 : 0;
      if (count == 5) {
        list.add(0);
        count = 0;
      }
    }

    System.out.println("After performing Bit Stuffing the data is: ");
    list.forEach(b -> System.out.print(b + " "));
    System.out.println();
  }

  // Byte Stuffing
  public void ByteStuffing() {
    String flag, Esc;
    List<String> list = new ArrayList<String>();

    System.out.println("Enter the length of data: ");
    int len = obj.nextInt();

    System.out.println("Enter the Flag: ");
    flag = obj.next();

    System.out.println("Enter the ESC: ");
    Esc = obj.next();

    String[] data = new String[len + 2];

    System.out.println("Enter the data: ");

    for (int i = 0; i < len + 2; i++) {
      if (i == 0) {
        data[i] = flag;
      } else if (i == len + 1) {
        data[i] = Esc;
      } else {
        data[i] = obj.next();
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
    System.out.println();

  }

  // Physical Violation
  public void physicalViolation() {
    System.out.println("Enter the length of data: ");
    obj.nextInt(); // Read length but not used
    obj.nextLine(); // Consume newline
    System.out.println("Enter the data: ");
    String data = obj.nextLine();
    System.out.println("After performing Physical Violation the data is: ");
    System.out.print(data + " 0 1" + "\n");
  }

  public static void main(String[] args) {
    TECMPNBS obj1 = new TECMPNBS();
    while (true) {
      System.out.println("1. Character Count\n2. Bit Stuffing\n3. Byte Stuffing\n4. Physical Violation\n5. Exit");
      System.out.print("Enter your choice: ");
      int choice = obj.nextInt();
      switch (choice) {
        case 1:
          obj1.characterCount();
          break;
        case 2:
          obj1.bitStuffing();
          break;
        case 3:
          obj1.ByteStuffing();
          break;
        case 4:
          obj1.physicalViolation();
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }
  }
}
