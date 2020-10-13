package solo;

public class 싱글톤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singlton ob1 = Singlton.getInstance();
		Singlton ob2 = Singlton.getInstance();
		
		if(ob1 == ob2) {
			
			System.out.println("같");
			
		}else {
			
			System.out.println("다름");
			
		}
		
		
		//https://github.com/jeontop/academy.git
		
				// 깨달음 : 계속 바뀌는 값을 멋모르고 처음부터 생성자로 지정해 놓으면 나중에 객체
				 //      생산 할때 매우 어려움 변동하지 않는 값만 생성자로 지정해 놓아야 함
				 //    아마 생성자와 메소드의 차이는 그 값이 변하는 가 계속 값을 받아서 변하는 가 그게 중요함 
		
		
	}
}


class Singlton {
	
	
	private static Singlton singlton = new Singlton();
	
	private Singlton() {
		
	}
	
	
	static Singlton getInstance() {
		
		return singlton;
		
	}
	
	
}



















