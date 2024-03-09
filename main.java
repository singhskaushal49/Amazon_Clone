import java.util.*;
public class main {
    public static void main(String args[]) {
      Scanner Sc = new Scanner(System.in);
      int n = Sc.nextInt();
      int star = 1;
      int row = 1;
      int a = 0;
      int b = 1;
      while (row <= n) {
        int i = 1;
      
      while (i <= star){
        System.out.print(a+"\t");
        int c = a + b;
        a = b;
        b = c;
        i++;
      }
      row++;
      System.out.println();
      star++;
      }
   }
}