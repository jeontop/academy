package seongcar;

public class KumhoTire extends Tire{

	
	public KumhoTire(int maxAge, String location) {
		super(maxAge, location);
		
	}
	
	public boolean roll() {
		
		++rotation;
	
		if(maxAge > rotation) {
		
			System.out.println(location + "KumhoTire 수명" + (maxAge - rotation) + "회");
			return true;
		
		}else {
		
			System.out.println(location + "KumhoTire 펑크");
			return false;
			
		}
	
	
}
	
	

}
