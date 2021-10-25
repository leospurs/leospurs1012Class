package exam10;

import java.util.LinkedList;

public class LinkedListFP {

	public static void main(String[] args) {
		
		
		LinkedList<FootballPlayer> list = new LinkedList<FootballPlayer>();
		
		list.add(new FootballPlayer("손흥민", 7, "토트넘", 29));
		list.add(new FootballPlayer("황희찬", 26, "울버햄튼", 26));
		list.add(new FootballPlayer("이강인", 7, "마요르카", 21));
		list.add(new FootballPlayer("황의조", 13, "보르도", 29));
		list.add(new FootballPlayer("정우영", 11, "프라이부르크", 21));
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}

}
