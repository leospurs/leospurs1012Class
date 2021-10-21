package OOPProject;

import java.util.Scanner;

public class SmartPhone {

	// 1 Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	private Contact arr[];
	private int num;
	private int SIZE = 10;
	

	// 2 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	
	// 생성자
	public SmartPhone() {
		arr = new Contact[SIZE];
		num = 0;
	}

	// 객체를 배열에 저장하는 메소드
	public void insert(Contact c) {
		arr[num++] = c;
	}
	
	// 수정 메소드
	public void update(Contact c) {
	
	}
	// 삭제 메소드
	
	
	// 리스트 출력 메소드

}
