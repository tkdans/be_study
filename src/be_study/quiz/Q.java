package be_study.quiz;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원의 등급 : ");
		String grade = scanner.next();
		System.out.println("회원의 보유 포인트 : ");
		int point = scanner.nextInt();
		
		if(grade.equals("vip") && point > 7500) {
		System.out.println("특별할인 쿠폰발급");
		}else if(grade.equals("vip")&& point < 5000) {
			System.out.println("포인트 부족");
		}else {
			System.out.println("쿠폰 발급 대상이 아닙니다.");
		}
		
		int num;
		int sum = 0;
		for(num= 1; num <= 100; num++) {
			if(num % 2 ==0) {
				sum = sum+num;
				System.out.print(sum);
			}
		}
		System.out.println
		("1부터 100까지의 짝수 합계 :"+ sum);	
		
	}

}
