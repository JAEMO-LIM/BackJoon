package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_12891 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼드 리더로 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); //첫 줄 입력
        int P = Integer.parseInt(st.nextToken()); //두번 째 줄 입력
        int Result = 0;
        checkSecret = 0;
        myArr = new int[4];
        char A[] = new char [S]; // 입력된 DNA 문자열
        A = br.readLine().toCharArray(); //DNA 처리 부분
        st = new StringTokenizer(br.readLine()); // 'A, C, G, T'

        checkArr = new int [4]; //'A, C, G, T' 가 몇개 필요한지 에 대한 배열
        for(int i=0;i<4;i++) { // checkArr(A,C,G,T) 가 얼마나 조건을 만족했는지에 대한 배열
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for(int i=0;i<P;i++) {
            Add(A[i]);
        }
        if(checkSecret ==4) Result++;


        for(int i=P;i<S;i++) {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4)
                Result++;

        }
        System.out.println(Result);
        br.close();
    }


    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (checkArr[0] == myArr[0])
                    checkSecret++;
                break;

            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A' :
                if(myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case'G' :
                if(myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}


