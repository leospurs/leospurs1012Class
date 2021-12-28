package exam;

public class Exam05 {
//	문제 3.
//	다음의 형태로 표현된 2차원 배열이 존재한다고 가정해 보자.
//	123
//	456
//	789
//	이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열 의 구조를 변경시키는 메서드를 정의해 보자.
//	789
//	123
//	456
//	즉 총 N행으로 이뤄진 2차원 배열이 존재한다면, 
//	메서드 호출 시, 1행은 2행 으로 이동이 이뤄져야한다. 
//	이번에도 마찬가지로 배열의 가로, 세로길이에 상 관 없이 동작을 하도록 메서드가 정의되어야 하며, 
//	정의된 메서드의 확인을 위한 main메서드도 함께 정의하자.

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		// 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		//////////////////////////
		// 행의 시프트
		
		// 임시 배열 선언
		int temp[]	= arr1[arr1.length-1];
		
		for(int i = arr1.length-1; i > 0; i--) {
			arr1[i] = arr1[i-1];
		}
		
		arr1[0] = temp;
		/////////////////////////
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ "\t");
			}
			System.out.println();
		}
		
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int num : arr) {
			System.out.println(num);
		}
		
		
		
	}

}
