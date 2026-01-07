package java_Do_it_Algorithm_02;

import java.util.Scanner;

public class Debug {
	private int a;

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int b[] = new int[100] ;
		for(int i=0;i<100;i++) {
			b[i]  = i;
			System.out.println("i = " + i);
			System.out.println("b[" + i +"] = " + i);
			if(i==10) {
				i =  15;
			}
		}
		

	}

}
