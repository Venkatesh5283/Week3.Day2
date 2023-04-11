package week3.Day2;

public class Automation extends MultipleLanguage {

	
	
	
	public void java() {
		// TODO Auto-generated method stub
		System.out.println(" Interface 1 : Language Interface, Java Method Called");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2 : TestTool Interface, Selenium Method Called");
	}

	@Override
	public void ruby() {
		System.out.println("Abstract Class, Ruby Method Implemented in Concrete Class and called");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation a=new Automation();
a.java();
a.selenium();
a.python();
a.ruby();
	}

}
