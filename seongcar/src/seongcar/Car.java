package seongcar;

public class Car {

	Tire LeftFrontTire = new Tire(6,"앞왼쪽");
	Tire RightFrontTire = new Tire(2,"앞오른쪽");
	Tire LeftBackTire = new Tire(3,"뒤왼쪽");
	Tire RightBackTire = new Tire(4,"뒤오른쪽");
	
	public int run() {
		
		System.out.println("자동차가 달립니다.");
		
		if(LeftFrontTire.roll() == false) {
			
			stop();
			return 1;
			
		}
		
		if(RightFrontTire.roll() == false) {
			
			stop();
			return 2;
			
		} 
		
		if(LeftBackTire.roll() == false) {
			
			stop();
			return 3;
			
		} 
		
		if(RightBackTire.roll() == false) {
		
			stop();
			return 4;
			
		}
		
		System.out.println("------------------");
		
	
		return 0;
		
		
	}
	
	public void stop() {
		
		System.out.println("자동차가 멈춥니다.");
		
	}
	
	
}
