package variable;

class TestClass06{
	public static int su;
	
	public void test() {
		su = 100;
	//test는 메인에서 TestClass06객체가 
	//생성되어야 사용이 가능
	//단 클래스에 있는 test에 static이 붙으면 객체가 생성되지 않아도 사용가능
	//static은 클래스 안에서 만들어져야 에러 발생 안함
	//두개의 변수가 있으면 static은 위에 있어야함
		
	}
}

public class MainClass06 {
	public static int num;
	
	
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		//위 객체가 생성되어야 클래스 안의 test를 사용가능(객체화)
		
		num = 100;
		//클래스에서 static으로 num이라는 변수가 생성 되어서
		//메인에서 객체가 생성되지 않아도 num변수를 사용 가능
		//클래스 안에서 만들어지는 static으로 선언된 변수들은
		//미리 만들어진 변수들로 객체가 생성되지 않아도 사용 가능
	
	}

}
