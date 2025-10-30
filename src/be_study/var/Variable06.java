package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = 10;
		
		// 값이 같은가? 비교하는 연산자 ==
		// ==비교 결과 --> 논리형 (true/ false)
		boolean b1 = (num1 == num2);// 결과가 논리
				System.out.println(b1);
				scanner. nextLine(); //앞에 남은 엔터(\n) 청소
				
				String str1 = scanner.nextLine();
				String str2 = "햄버거";
				System.out.println(str1);
				System.out.println(str2);
				System.out.println(str1==str2);//숫자열 안된다. 
				System.out.println(str1.equals(str2));
				System.out.println(str2.equals(str1));
				System.out.println(str2.equals("햄버거"));
	}

}
