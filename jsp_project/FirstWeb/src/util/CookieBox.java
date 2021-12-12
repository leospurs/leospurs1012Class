package util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;

// 클래스의 용도 : 현재 사용하는 시점의 요청에 있는 쿠기 값들을 저장하고 관리 기능을 제공하는 크래스
// 쿠키생성, 쿠키 제공, 쿠키 값 제공, 쿠키 존재 유무 확인
public class CookieBox {
	
	// 쿠키 값을 저장한다 : 간단한 코드로 빠르게 참조
	// -> HashMap<String, Cookie> 에 저장
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
	
	// 생성자를 통해서 값을 초기화 : Map에 Cookie 객체들을 저장
	public CookieBox() {
		
	}
}
