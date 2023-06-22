package variable;

import java.util.Scanner;


public class TestClass00 {
	public static String name;
	public static int kor;
	public static int eng;
	public static int math;
	public static int sum;
	public static double avg;
	public static String grade;
	
	
	public static void input() {
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 입력: ");
	name = sc.next();
	System.out.print("국어 점수: ");
	kor = sc.nextInt();
	System.out.print("영어 점수: ");
	math = sc.nextInt();
	System.out.print("수학 점수: ");
	eng = sc.nextInt();
	}
	
	public int sum() {
		sum = kor+eng+math;
		return sum;
	}
	public double avg() {
		avg = sum/3;
		return avg;
	}
	
	public void grade() {
	if(avg >= 90) {
		grade = "A";
	}else if(avg >= 80) {
		grade = "B";
	}else if(avg >= 70) {
		grade = "C";
	}else if(avg >= 60) {
		grade = "D";
	}else {
		grade = "F";
	}
		
	}
	
	public static void output() {
		System.out.println();
		System.out.println("이름: "+TestClass00.name);
		System.out.println("국어 점수: "+TestClass00.kor);
		System.out.println("영어 점수: "+TestClass00.eng);
		System.out.println("수학 점수: "+TestClass00.math);
		System.out.println("3 과목의 합:"+TestClass00.sum);
		System.out.println("3 과목의 평균: "+TestClass00.avg);
		System.out.println(TestClass00.name+"은 "+TestClass00.grade+"급 이다.");
	}

}
