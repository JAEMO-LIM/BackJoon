package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //숫자 개수
        int M = Integer.parseInt(st.nextToken()); //나눌 수
        long S[] = new long[N]; //합배열
        long C[] = new long[M];
        int result = 0;
        //카운트 배열
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<N;i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<N;i++) {
            int reminder = (int)(S[i] % M);
            if(reminder == 0) result++;
            C[reminder]++;
        }

        for(int i=0;i<M;i++) {
            result = result + (int)(C[i]*(C[i]-1))/2;
        }

        System.out.println(result);


    }
}

/*
* N개의 수 A1,A2,,....,An이 주어졌때 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
*
* */