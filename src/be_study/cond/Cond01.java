package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문 if문
		// if(조건식) 참이면 실행
		int num = 20;//(값을 바꿔 가면서)
		// 지역변수
		int x = 3;
		if (num > 5) {
			System.out.println("num이 5보다 크네");
			System.out.println("if문 안에 실행");
			//거짓이면 무시
			//int x=30; // x 변수면 중복
			x = 30; //x는 이미 11번 라인에 선언되어 있음.
			//지역변수
			int y = 20;
			y = y + 50;
	}
		x = 20;
		//y = y - 5; y변수는 저 위에 if문 지역내부에서만 인식되는 변수
		int y = 5;
		//위에서 인식이 안되어서 이름이 중복되지 않는다. 지역변수
		
		if(num < 10) {
		System.out.println("num이 10보다 작구나");
		// 중괄호를 지우면 다음줄을 실행한다. 한줄이면 중괄호를 무시할 수 있다.
		System.out.println("num 작네...");}
		else
			System.out.println("num이 10보다 작지않네?");
		//if와 else는 동시에 실행할 수 없다. if와 else는 세트이다
		//if(조건식) 조건식 -> 결과가 논리형 (true/false)
		boolean b1n= (num !=15);
		//boolean은 조건식 없이 사용할 수 있다.
		 if(b1n) //결과가 논리형
		// 결과는 true/false 
		//if (b1n == true) 참이면
		//if (b1n == false) 거짓이면
		//if (!b1n) 문법형식은 맞지만 논리상 맞지않다
		//if (b1n== false) //진행하는 논리상 맞게 진행
		{System.out.println("15랑 다른수");}
			else {
			System.out.println("15랑 같은수");
		}
		
		
		System.out.println("end");
	}
}
