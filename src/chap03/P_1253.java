package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        long A[] = new long[N];
        int count =0;
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=0;i<N;i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        for(int K =0;K<N;K++) {
                                                                                                                                                                                                                                                                                                                           
            int Left_p=0;
            int Right_p=N-1;
            while(Left_p<Right_p) {
                if(A[Left_p] + A[Right_p] == A[K]) {
                    if(Left_p != K && Right_p != K) {
                        count++;
                        break;
                    }
                    else if(Left_p == K) {
                        Left_p ++;
                    }
                    else if(Right_p == K) {
                        Right_p --;
                    }
                }
                else if(A[Left_p] + A[Right_p] > A[K] ) {
                    Right_p --;
                }
                else {
                    Left_p ++;
                }
            }

        }
        System.out.println(count);
    }
}
