package be_study.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		int num = -10;
		System.out.println(num ==0 ? "0" : (num > 0 ? "양수" : "음수"));

		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		//첫번째 숫자를 입력하세요 : ㅇ
		//입력한 숫자=ㅇ
		//두번째 숫자를 입력하세요 : ㅇ
		//입력한 숫자=ㅇ
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 :");
		double number1 = scanner.nextDouble();
		System.out.println(number1);
		
		
		System.out.print("두번째 숫자를 입력하세요 :");
		double number2 = scanner.nextDouble();
		System.out.println(number2);
		//int 행태
		
		System.out.println("더하기 : "+ number1+"+"+number2+"="+(number1+number2));
		System.out.println("뻬기 :" + number1 + "-"+number2+"="+(number1-number2));
		System.out.println("곱하기 :"+ number1 + "*"+ number2 + "="+(number1*number2));
		//System.out.println("나누기 :"+ number1+"/"+number2+ "="+(number1/number2));
//		System.out.printf("더하기 : %4d+%4d=%4d\n", number1,number2,(number1+number2));
		System.out.printf("나누기 :%4f/%4f=%4.2f\\n" ,number1,number2,(number1/number2));
		
		//더하기 : ㅇ+ㅇ=ㅇ
		//뺴기 : ㅇ-ㅇ=ㅇ
		//곱하기 : ㅇ*ㅇ=ㅇ
		//나누기 : ㅇ/ㅇ=ㅇ

	}

}
