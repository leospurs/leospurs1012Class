package exam;

public class Exam01 {

public static void main(String[] args) {
	
//	문제 1. 다음 형태로 String 인스턴스를 생성.
//
//    String str = “ABCDEFGHIJKLMN”;
//
//    그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.

	String str = "ABCDEFGHIJKLMN";
	
	StringBuilder strBuf = new StringBuilder(str);
	
	System.out.println(strBuf.reverse());

//	문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
//
//    String str = “990929-1010123”
//
//    이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.
	
	String str1 = "990929-1010123";
	
	str1 = str1.replace("-", "");
	
	System.out.println(str1);
	
}
	
	
}
