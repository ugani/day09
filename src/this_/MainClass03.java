package this_;

class TestClass03{
	private int num,age;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setNum(int n) {
		num = n; 
	}
	public int getNum() {
		return num;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.setNum(12345);
		int re = t.getNum();
		System.out.println("결과 :"+re);
	}

}
