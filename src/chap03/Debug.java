package chap03;

import java.util.Scanner;

public class Debug {
    public static int sum =0;
    public static int ps(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            sum++;
            return ps(n / 2);
        } else if (n % 3 == 0) {
            sum++;
            return ps(n / 3) + 1;
        }
        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ps(n);
        System.out.println(sum);
    }
}