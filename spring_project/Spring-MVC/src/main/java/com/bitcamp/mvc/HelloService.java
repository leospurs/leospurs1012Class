package com.bitcamp.mvc;

import java.util.Calendar;

public class HelloService {

	public String getGreeting() {

		String str = "안녕하세요";

		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		if (hour >= 6 && hour <= 10) {
			str = "좋은 아침입니다!";
		} else if (hour >= 2 && hour <= 15) {
			str = "점심 식사는 하셨나요?";
		} else if (hour >= 18 && hour < 22) {
			str = "내일 만나요!";
		}

		return str;
	}

}
