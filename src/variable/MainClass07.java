package variable;

class TestClass07{
	public static final String KOREA = "대한민국";
}
//	1. 클래스에서 스태틱으로 클래스 변수가 만들어지면

class T01{
	public void test() {
		TestClass07 t =new TestClass07();
		System.out.println(t.KOREA);
	}
}
//	2. 선언 될 때 객체를 생성하지 않아도

class T02{
	public void test() {
		System.out.println(TestClass07.KOREA);
	}
}
// 	3. 스태틱으로 만들어진 클래스를 바로 호출해서 사용이 가능함

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		//t.KOREA = "미국"
		System.out.println(t.KOREA);
		
		System.out.println(TestClass07.KOREA);
	}
}
