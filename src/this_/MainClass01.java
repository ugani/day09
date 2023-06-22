package this_;

class TestClass01{
	public int num = 123456789;
	public void test() {
		int num = 7777777;
		System.out.println("this :" +this);
		System.out.println("test1 :" +num);
		System.out.println("test2 :" +this.num);
		//this를 실행시키면 주소형 정보를 출력하는데
		//아래 t를 출력한것과 동일한 결과가 나오는걸 확인 가능
		// this.num을 출력해보면 t.num과 출력 결과가 같음
		// this로도 다른 변수를 불러와서 사용 가능
		// 위에서 num을 this를 안붙이면 클래스 내부의 num이 우선시 되고
		// this.num을 붙이면 외부에 있는 num을 사용 가능하게됨
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * this 
		 * - 메소드의 0번째 매개변수로 자동으로 만들어진다.
		 * - 클래스 자기자신의 정보를 가지고 있는 변수
		 */
		TestClass01 t = new TestClass01();
		System.out.println("t : "+t);
		//t는 주소형 정보를 가지고 있는 참조형 변수
		System.out.println("main: "+t.num);
		t.test();
	}
}
