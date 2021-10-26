package oopExam;

public class Student {

//	1 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다. 
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

//	2 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

//	3 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	
	// 합계 메소드
	public int sumScore() {
		return this.getKorScore() + this.getEngScore() + this.getMathScore();
	}

	// 평균 메소드
	public float avgScore() {
		return (float) sumScore() / 3;
	}

}
