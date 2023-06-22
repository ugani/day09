package variable;

class TestClass02{
	public int test1() {
		int var = 100;
		System.out.println("test1 var : "+var);
		return var;
	}
	//서로 다른 지역변수라서 테스트1의 변수 var를 사용 할 수 없음
	//사용할려면 return을 통해서 사용해야함
	public void test2(int var) {
		System.out.println("test2 var :"+var);
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		int v = t.test1();
		t.test2(v);
		
	}
	

}
