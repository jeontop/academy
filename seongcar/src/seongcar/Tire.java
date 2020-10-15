package seongcar;

public class Tire {
	
	public int maxAge;  //타이어 수명
	public int rotation = 0; // 누적회전수
	public String location; // 타이어 위치
	
	
	public Tire(int maxAge , String location) {
		
		this.maxAge = maxAge;
		this.location = location;
		
	}
	
	public boolean roll() {
		
			++rotation;
		
			if(maxAge > rotation) {
			
				System.out.println(location + "Tire 수명" + (maxAge - rotation) + "회");
				return true;
			
			}else {
			
				System.out.println(location + "Tire 펑크");
				return false;
				
			}
		
		
	}
	
	

	
	


}
