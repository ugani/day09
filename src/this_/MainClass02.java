package this_;

class TestClass02{
	private int num; 
	//변수를 프라이빗으로 설정하는것을
	//정보은닉화 라고 부름
	
	public void test(int n) {
		num=n;
	//프라이빗으로 변수 선언하면
	//내부에서만 사용 가능함
	//프라이빗으로 설정한 해당 변수를 사용 할 수 있게 만드는 메소드
	}
	public int test2() {
		return num;
	}
	//프라이빗으로 설정한 변수에 값을 돌려주는 메소드
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		int n = 12345;
		t.test(n);
		int re = t.test2();
		System.out.println("결과 :"+re);
	}
}
