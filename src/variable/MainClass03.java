package variable;

class TestClass03{
	public int var; //인스턴스(객체) 변수
	//1회성 변수들은 인스턴스 변수로 만들지 않는게 좋음
	//1회성 변수들은 해당 지역의 변수로 만들어서 사용
	//ex)  i(i=0; i<10; i++)같은 변수
	//인스턴스 변수는 여러번 사용할 변수를 만듬
	//(여러지역에서 사용할 변수)
	
	public void test1() {
		var = 100;
		//이 지역에서는 var에 100을 저장
	}
	public void test2() {
		System.out.println(var);
		//이 지역에서는 var를 출력
	}
}

public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t = new TestClass03();
	t.test1();
	t.test2();
	
	
}
}
