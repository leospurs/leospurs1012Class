package chap01;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대 정수값을 구합니다.");
		System.out.println("정수 3개를 입력하세요.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
		
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}
