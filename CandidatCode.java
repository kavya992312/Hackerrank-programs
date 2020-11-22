import java.io.*;
import java.util.*;
class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here\
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] p=new int[100][3];

        for(int i =0;i<T;i++)
            for(int j =0;j<3;j++)
            {
                p [i][j]=sc.nextInt();
            }

        for(int i =0;i<T;i++)
            System.out.println(p[i][0]+(p[i][2]-1)*p[i][1]);

    }
}

