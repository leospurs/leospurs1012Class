package OOPExam;

public class Score {
	public static void main(String[] args) {
//		1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
//		평균 점수를 출력하는 프로그램을 작성해봅시다.

		// 배열 생성
		int[][] arr = new int[10][3];

		// 배열에 값 저장
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 50 + 50);

			}

		}

		// 배열의 값 출력
		System.out.println("국어\t영어\t수학");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();

		}
		// 각 과목 총점
		int korsum = 0;
		int engsum = 0;
		int mathsum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			korsum += arr[i][0];
		}
		
		for(int i = 0; i < arr.length; i++) {
			engsum += arr[i][1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			mathsum += arr[i][2];
		}
		
		// 각 과목 평균
		float koravg = 0.0f;
		float engavg = 0.0f;
		float mathavg = 0.0f;
		
		koravg = korsum / (float)arr.length;
		engavg = engsum / (float)arr.length;
		mathavg = mathsum / (float)arr.length;
		
		System.out.println("===========================");
		System.out.println("국어 점수 평균: " + koravg + "점");
		System.out.println("영어 점수 평균: " + engavg + "점");
		System.out.println("수학 점수 평균: " + engavg + "점");
		

	}


}
