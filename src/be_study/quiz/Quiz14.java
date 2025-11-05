package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		// 기준을 %2로 결과 0 --> 2의 배수 ->짝수
		//%2결과 1 ->홀수
		
		//if(num%2==0)
//		if(num%2==1)
//		if(num%2!=0)홀수
//		if(num%2 !=1)짝수 
		if(num%2==0){
			System.out.println("even");
			}
		else{
			System.out.println("odd");
			}
		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		System.out.println("7의 배수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		if(num1 % 7 == 0 ) {
			System.out.println("7의 배수입니다.");
		}else {
			System.out.println("아닙니다.");
		}
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
//		int sum = 0;
//		int j = 1;
//		
//		while(j<=1000) {
//			if(j%5==0)
//				sum += j;
//			j++;
//		}
//		System.out.println(sum);
//		int sum =0; //뎃셈으로 누적에 영향이 없는 0값을 사용
//		for(int i = 1; i<=100; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//				for(int i =1; i<=1000; i++) {
//		//5의 배수 일때만
//					if(1%5==0) {//1X 2X 3X 4X 5o
//						sum = sum +i; // +5,+10 . . .
//					}
//				sum=0;
//				for(int i=5; i<=1000; i=i+5) {
//					sum= sum+i;}
//				}
//	System.out.println(sum);
		
		
		
//
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		System.out.println("*갯수를 입력하세요 : ");
//		int num2 = scanner.nextInt();
//		if(num2>=1 && num2<=50) {
//			for(int i =1; i<=num2; i++) {//입력받은 값을 받아서 계산
//				for(int i =num; i>=1; i--){ // i: 8 7 6 5 4 3 2 1
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}else {
//			System.out.println("1애서 50까지 사이의 숫자를 입력 ");
//		}
		
		
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		System.out.println("*숫자를 입력하세요 : ");
		int num3 = scanner.nextInt();
		
//		int k = num3%2;
//		while(k==0) {
//			k--;
//		}System.out.println(k);
//		int result = 1- 2 + 3 -4 +5 -6 +7 - 8 +9 -10;
//		System.out.println(result);
//		int result=0;
//		for (int i=1; i<=10; i++) {// i: 1 2 3 4 5 
//			//짝수 :-
//			//홀수 : +
//			if(i%2 ==0) {//짝수
//				result = result - i;
//			}else {
//				result = result + i;
//				
//			}
		
			
			
			
		
		
		
//		6. 정수를 1부터 계속 누적으로 더한다. 이런 패턴으로 누적으로 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
//			1+2+3+4 ....
			//끝이 언제인지 알때 for문
		/*	int total = 0;
			for(int i =1; i <=1000;i++) {//46~1000 955바퀴
				//1000이 될때까지 더하자
				if(total<1000) {
					total =total +i;
				}else {
					break;
				}
				
			}
			System.out.println(total);
			//누적으로 언제 끝날지 모를때
			total = 0;
			int i =1;// 기억하고 유지되어야 한다.
			while(true) {
				total = total + i; //total = total+ i++;
				i++;// i = i + 1;
				//언제 멈춰야 할지 조건을 알고 있어서
				if(total>=1000) {
					break;
				}
			}
			System.out.println(total);
			// 조건을 알고 있어서
			total = 0;
			i =1;
			while(total<1000) {
				total = total +1;
				i++;
			}
			System.out.println(total);
			// for문 위치에 따른 것이다. 다른 변수들이 조건에 들어가도 된다.
			total = 0;
			for(i=1; total<1000; i++) {
				total = total+i;
			}
			System.out.println(total);
			*/
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
			//3* 1		1~9 입력한 숫자는 1부터 9까지 처리
			//3*2
			//3*n
			System.out.print("1~9까지 중에 보고싶은 구구단은 : ");
			int num7 = scanner.nextInt();
			for(int p=1; p<=9; p++) {
				System.out.printf("%d*%d=%d\n",num7,p,num7*p);
			}
			
			
			
			
	}

}

