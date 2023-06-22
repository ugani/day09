package overloading;

public class TestClass01 {
	
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	// 위와 아래는 메소드 이름은 같지만
	// 매개변수 개수가 다르므로 서로 다른 메소드이다
	// 또는 타입이 달라야한다
	public void sumFunc(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void sumFunc(String s1, String s2) {
		System.out.println(s1+s2);
	}
	//메소드를 서로 같은 이름으로 지정할순 있지만
	//매개변수의 개수나, 타입이 달라야 한다
}
