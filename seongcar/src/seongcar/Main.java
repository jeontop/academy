package seongcar;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		for(int i = 1; i <= 5; i++) {
		
			int problemLocation = c1.run();
		
		switch(problemLocation) {
		
		case 1:
			System.out.println("앞왼쪽 KumhoTire로 교체");
			c1.LeftFrontTire = new KumhoTire(16,"앞왼쪽");
			break;
			
		case 2 :
			System.out.println("앞왼쪽 KumhoTire로 교체");
			c1.RightFrontTire = new KumhoTire(13,"앞오른쪽");
			break;
			
		case 3 :
			System.out.println("뒤왼쪽 KumhoTire로 교체");
			c1.LeftBackTire = new KumhoTire(14,"뒤왼쪽");
			break;
			
		case 4 :
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			c1.RightBackTire = new KumhoTire(13,"앞오른쪽");
			break;
			
			}
		
		}
	
	}

}
