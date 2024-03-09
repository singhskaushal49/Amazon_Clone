import java.util.*;

public class pratic {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
          int n = Sc.nextInt();
          
          int row = 1;
          int space = n - 1;
          int star = 1;
          int val = 1;
          while(row <= 2 * n - 1) {
              // space
              int i = 1;
              while (i <= space) {
                  System.out.print(" \t");
                  i++;
              }
              // star
              int j = 1;
              int p = 1;
              while (j <= star) {
                  System.out.print(p+"\t");
                  if (j <= star / 2) {
                    p++;
                  } else {
                    p--;
                  }
                  j++;
              }
              row++;
              if (row <= n){
                star = star + 2;
                space--;
              } else {
                star = star - 2;
                space++;
              }
              System.out.println();
        }
    }
}
