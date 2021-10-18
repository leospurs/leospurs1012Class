package chapter06.score;

public class ScoreMain1 {
	public static void main(String[] args) {
		
		ScoreManager manager = new ScoreManager(); // 10개 저장 공간
		
		// 1. 데이터 저장
		manager.insertScore(new Student("손흥민",100,100,100));
		manager.insertScore(new Student("KING",80,70,70));
		manager.insertScore(new Student("황희찬",60,100,80));
		
		// 2. 데이터 전체 출력
		manager.showAll();
		
		// 3. 데이터 검색
//		manager.searchData("손흥민");
//		manager.searchData("이강인");
//		manager.searchData("황희찬");
		
		// 4. 데이터 삭제
//		manager.deleteScore("황희찬");
//		manager.deleteScore("이강인");
		
		// 5. 데이터 검색 또는 데이터 전체 출력
		manager.showAll();
		
 	}
}
