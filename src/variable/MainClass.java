package variable;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class MainClass {
public static void main(String[] args) {
	/*
	 * 클래스 변수 - 클래스가 메모리에 올라갔을 경우에 생성된다.
	 * 인스턴스 변수 - 인스턴스(객체)가 생성될때 생성된다.
	 * 지역 변수-해당 지역이 실행될 때 생성된다.(각각 지역에서 만드는 변수)
	 */
	String name = "길동홍";
	if(true) {
		
		String n2 = "김말이";
		name = "김개똥";
	}
	System.out.println(name);
}
}
