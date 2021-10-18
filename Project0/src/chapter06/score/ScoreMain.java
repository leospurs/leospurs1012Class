package chapter06.score;

public class ScoreMain {

	public static void main(String[] args) {
		
		// 데이터 저장 목적
		
		//	1 Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다. 
		Student[] score = new Student[10]; // 배열의 모습: null null null null ....
		
		int numOfStudent = 0; //  배열에 입력할 때 index로 사용
		

		//	2 Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		Student s1 = new Student("손흥민", 100, 100, 100);
		
		// score[0] = s1;
		
		score[numOfStudent] = s1;
		numOfStudent++; // 추가 된 학생의 수를 +1 증가 시킨다.
		
		Student s2 = new Student("이강인", 80, 80, 70);
		
		score[numOfStudent] = s2;
		numOfStudent++; // 추가 된 학생의 수를 +1 증가 시킨다.
		
		//	3 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		
		
		for(int i = 0; i < numOfStudent; i++) {
//			System.out.println(score[i].getKorScore()+"\t" + score[i].getEngScore() + "\t" + score[i].getMathScore() + "\t" + score[i].sumScore() + "\t" + score[i].avgScore());
			System.out.println(score[i]); // score[i].toString();
		}
		
		
		// score[5].avgScore(); -> 오류
		
		
		// 데이터 입력 -> 배열에 저장 
		// 데이터 검색 -> 배열의 요소에서 검색
		// 데이터 삭제 -> 배열의 요소를 삭제
		
		
		
	}

}
