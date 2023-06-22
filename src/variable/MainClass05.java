package variable;
class TestClass05{
//	public String msg="연습";
	
	public static String msg ="연습";
	//static가 붙이면 클래스 변수로 선언하겠다.
	//static이 붙이면 클래스 이름으로 접근하고
	//객체가 만들어지기 전에 미리 만들어져 있는 변수!!!!!
	public int num;
	//인스턴스 변수는 객체가 만들어짐과 동시에 만들어짐
	
}
public class MainClass05 {
	public static void main(String[] args) {
//		TestClass05 t = new TestClass05();
//		System.out.println(TestClass05.msg);
		//String msg라는 인스턴스 변수가 있어야 사용가능함
		
		System.out.println(TestClass05.msg);
		TestClass05 t = new TestClass05();
		System.out.println( t.msg);
	
	
		
	}
}
