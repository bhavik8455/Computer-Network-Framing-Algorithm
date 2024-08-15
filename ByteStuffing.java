import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ByteStuffing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String flag , Esc;
    List<String> list = new ArrayList<String>();
    
    System.out.println("Enter the length of data: ");
    int len = sc.nextInt();
    
    System.out.println("Enter the Flag: ");
    flag = sc.next();

    
    System.out.println("Enter the ESC: ");
    Esc = sc.next();

    
    String[] data = new String[len+2];
    
  
      System.out.println("Enter the data: ");
 
      for(int i = 0; i < len+2; i++){
        if(i == 0){
          data[i] = flag;
        }else if(i == len+1){
          data[i] = Esc;
        }else{
          data[i] = sc.next();
        }
      }
    
    for(int i = 0; i <= len+1; i++){
      if(i==0){
        list.add(data[i]);
      }else{
        if((data[i].equals(flag)|| data[i].equals(Esc) )&& i!=len+1){
          list.add(data[i]);
          list.add(Esc);
        }else{
          list.add(data[i]);
        }
      }
    }

    for(int i = 0; i < list.size(); i++){
      System.out.print(list.get(i)+"\t");
    } 
    
    
  }

 
}