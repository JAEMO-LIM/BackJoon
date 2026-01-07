package chap03;

import java.util.Scanner;

public class P_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; ++i) {
            A[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; ++i) {
            if (A[i] > max) {
                max = A[i];
            }

            sum += A[i];
        }

        double avg = (double)sum * (double)100.0F / (double)max / (double)n;
        System.out.println(avg);
    }
}
