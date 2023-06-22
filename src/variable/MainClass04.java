package variable;

class Test04{
	String name; //-> 여러 지역에서 사용하는 변수는
				//	  인스턴스 변수로 만들어서 사용
	public void inputDate() {
		String name = "호옹길동";
	}
	
	public void pringDate() {
		System.out.println(name);
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		
	}

}
