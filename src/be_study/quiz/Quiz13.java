package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		//예외처리 
		if(year % 4==0 && year % 100 !=0) {
			System.out.println("윤년이다");
		}else if(year % 400 ==0) {
			System.out.println("윤년이다");
			
		}else {
			System.out.println("윤년이 아니다");			
		}
	
	//뭐가 윤년이냐? 우선순위가 우선으로 처리
	//2001년 %4 =1
	//우선 순위 %4, 	%100, 	%400 비교하면  윤년
	//2004 		 0    X     x		O
//	2100		 0	  0		X	    X
	//2400		 O	  O		O		O
//2007		     X	  X		X		X	
	//		순위가낮다			순위가높다
	//우선순위		낮다	2번처리	1번째처리
	if(year%400 == 0) {
		System.out.println("윤년이다");
	}else if (year%100 ==0) {
		System.out.println("윤년이 아니다");
	}else if(year%4==0) {
		System.out.println("윤년이다");
	}else {
		System.out.println("윤년이 아니다");
	}
	if(year%4 ==0) {
		if(year%400 ==0) {
			System.out.println("윤년이다");
			}else {
				if(year%100 ==0) {
					System.out.println("윤년이 아니다");
				}else {
					System.out.println("윤년이다");
				}
			}
	}else {
		System.out.println("윤년X");
	}
	// 분석해야 한다.
	if(year%400 ==0 ||(year%4 ==0 &&!(year%100==0))) {
		System.out.println("윤년이다");
	}else {
		System.out.println("윤년이 아니다");
	}
	}
}
