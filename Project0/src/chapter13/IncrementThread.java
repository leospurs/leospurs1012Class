package chapter13;

public class IncrementThread extends Thread{

	Increment inc;
	
	public IncrementThread(Increment inc) {
		this.inc = inc;
		
	}
	
	@Override
	public void run() {
		for(int i=0; i <10000; i++) {
			for(int j =0; j<10000; j++) {
				inc.increment();
			}
		}
	}
	
}
