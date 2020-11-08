import java.util.Scanner;

import static java.lang.String.*;

public class staircase {
    static void staircase(int n) {
        int st = 1, sp = n-1;
        while(n > 0){
            for(int i = 0; i < sp; i++){
                System.out.print(" ");
              //  System.out.print("giving space");
            }
            for(int i = 0; i < st; i++){
                System.out.print("#");

            }
            st = st + 1;
            sp = sp - 1;
            --n;
            //System.out.print(n);
          System.out.println(" " );
        }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();


         staircase(n);

        scanner.close();
    }
}
