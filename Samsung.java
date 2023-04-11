package week3.Day2;

public class Samsung extends AndroidTV {

	

	public void playVideo() {
		
		System.out.println("Interface Missing Methods 2, PlayVideo Method was Called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s=new Samsung();
		s.openApp();
		s.playVideo();
	}
}
