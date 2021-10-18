package chapter06.score;

import java.util.Scanner;

public class ScoreManager {
	// 배열을 가지고 있고,
	// 배열의 요소를 추가, 검색, 삭제 기능

	public static final Scanner sc = new Scanner(System.in);

	private Student[] score;
	private int numOfStudent;

	public ScoreManager(int size) {
		score = new Student[size];
		numOfStudent = 0;

	}

	public ScoreManager() {
		this(10);
	}

	// 전체 데이터 출력 : 배열에 입력 된 모든 데이터를 출력
	public void showAll() {
		System.out.println("학생 점수 리스트");
		System.out.println("----------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");

		for (int i = 0; i < numOfStudent; i++) {
			System.out.println(score[i]);
		}

		System.out.println("----------------------------------");
	}

	// 데이터 추가
	public void insertScore(Student s) {
		score[numOfStudent++] = s;
//		score[numOfStudent] = s;
//		numOfStudent++;		

	}

	// 데이터 검색(이름 기준) -> 배열의 요소들중 이름을 비교
	public void searchData() {
		
		System.out.println("검색 하고자하는 학생의 이름을 입력해 주세요.");
		String name = sc.nextLine();

		// -1 또는 배열 범위 안의 정수 0 ~ N-1

		int index = searchIndex(name);

		if (index > -1) {
			System.out.println(score[index]);
		} else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}
	}

	// 데이터 삭제(이름 기준) -> 배열의 요소에 손흥민을 지운다. -> 손흥민 객체를 참조하는 값이 없으면

	public void deleteScore() {

		System.out.println("삭제 하고자하는 학생의 이름을 입력해 주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);

		if (index > -1) {
			// 시프트 : 참조값을 지운다. -> 정보 삭제
			for (int i = index; i < numOfStudent - 1; i++) {
				score[i] = score[i + 1];
			}
			numOfStudent--;
			System.out.println("데이터가 삭제 되었습니다.");
		} else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}

//		for (int i = 0; i < numOfStudent; i++) {
//
//			if (score[i].getName().equals(name)) {
//
//				for (int j = i; j < numOfStudent - 1; j++) {
//					score[j] = score[j + 1];
//				}
//				System.out.println("삭제 되었습니다.");
//			}
//		}
	}

	// 이름으로 배열의 인데스를 찾아 인덱스 값을 반환하는 메소드
	private int searchIndex(String name) {

		int index = -1;

		for (int i = 0; i < numOfStudent; i++) {
			if (score[i].getName().equals(name)) {
				index = i;
				break;
			}
		}

		return index;
	}
	
	public void insertStudent() {
		
		System.out.println("학생 성적 데이터를 입력합니다.");
		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		System.out.println("국어 점수를 입력해 주세요.");
		int korScore = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력해 주세요.");
		int	engScore = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력해 주세요.");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		
		insertScore(new Student(name, korScore, engScore, mathScore));
		System.out.println("성적 데이터가 입력되었습니다.");
		
	}

}
