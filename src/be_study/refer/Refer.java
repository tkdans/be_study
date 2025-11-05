package be_study.refer;

import java.util.Scanner;

public class Refer {

	public static void main(String[] args) {
		//기본타입변수
		int n;//값x 기본공간
		int num = 0;//값o 공간, 값이 존재
		//참조타압 변수
		String s1; //값X 참조변수
		String s2= null; //지금 참조하는게 없다. null 예약어
		
//		System.out.println(n);
//		System.out.println(s1);// 초기화가 안됨
		System.out.println(num);
		System.out.println(s2);// null값을 가진다.
		
		Scanner scanner = new Scanner(System.in);
		String t1 ="사과";
		String t2 = "사과";
		String t3 = scanner.nextLine();
		String t4 = new String("사과");
		System.out.println(t1==t2);//주소비교
		System.out.println(t1.equals(t2));//실제문자열값 비교
		System.out.println(t2==t3);//주소비교
		System.out.println(t3.equals(t2));
		System.out.println(t2==t4);//주소비교
		System.out.println(t4.equals(t2));// equals로 t4를 비교하면 true가 된다
		
		String ne =null;
		System.out.println(ne==null);
//		System.out.println(ne.equals("사과"));
//		//NullPointerException
		
		//값 복사
		int n1 = 10;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		
		String ss1 = "배";
		String ss2 = ss1;
		System.out.println(ss1);
		System.out.println(ss2);
	
	
	}

}
