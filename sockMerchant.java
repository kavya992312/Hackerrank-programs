import java.io.IOException;
import java.util.Scanner;
//if pairs are found only then merchant can sell socks.
public class sockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count=0,sell=0;
        for(int i =0;i<n;i++){
            count =0;
            for(int j =i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                    count++;
            }
            if(count%2!=0)
                sell++;

            }
        System.out.println("count"+count);
        System.out.println("sell "+sell);
        return sell;
    }
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i =0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        sockMerchant(n,ar);
        sc.close();
    }
}
