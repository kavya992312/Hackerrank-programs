import java.util.Arrays;
import java.util.Scanner;

public class minmax {
    static void miniMaxSum(long[] arr) {


            long temp,sum = 0 ;
            long max = 0;
            long min = 0;
            Arrays.sort(arr);
            for (int j = 0; j < 5; j++)
                sum += arr[j];
            temp = sum;
            //max
            max = temp-arr[0];
            //min
            min = temp-arr[4];
            System.out.println(min+" "+max);

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         long [] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLong();
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
