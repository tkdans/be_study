package be_study.quiz;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
		라인(행)수 1 2 3 4 5 5회반복
		별 출력 수 5 4 3 2 1 5회부터 1회까지
*/
		
//		for(int i=1; i<=5; i++) {
//			for(int j= 1; j<=5; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
*/
		for(int i = 1; i<=4; i++) {
			//i : 1 2 3 4
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6 나누어 0을 떨어지느냐 기준 입력한 숫자가 
		1 2 3 6
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int n =scanner.nextInt();
		
		//1  2 3 4 .... n  해당 숫자
		
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {//입력받은 수 n
				//i로 나머지 연산
				//나누어 0 떨어지면 약수
				System.out.print(i+"");
			}
		}System.out.println();
		
		
		
		/*
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		입력 3만큼 반복이 되라
		*/
		
		
		/*

		입력 : 3

		*
		**
		***
		**
		*
*/
System.out.print("입력 : ");
int n1 =scanner.nextInt();
//
		for(int i = 1; i<=n1; i++) {
			//i : 1 2 3 4
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		for(int i=1; i<=n1; i++) {
			for(int j =n1; j<=1; j-- ) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		힌트
		1+ 
		(1+2)+ 
		(1+2+3)+
		(1+2+3+4)+
		...+(1+2+3+...+10) 일정한 패턴으로 반복한다.
		바뀐 값을 더한다.
		i:1 2 3 4 5  .. 10
		// i+면
		j: 1 1 2 1 2 3 1 2 3 4 
		//j값을 더한다.
		///
		*/
		int sum = 0;
		for(int i =1; i<=10;i++) {
			for(int j = 1; j<=i;/*응석씨*/ j++) {
				sum= sum +j;
			}
		}
		System.out.println("누적된 총합: "+sum);
		sum= 0;
		int currentSum =0; 
		for(int i =1; i<=10; i++) {
			currentSum = currentSum +i;
			sum = sum + currentSum;
		}
		System.out.println("누적된 총합: "+sum);
		
		sum = 0;
		for(int i =1; i<=10; i++) {
			sum =sum +(i*(10-(i-1)));
			//          1*(10)
			//			2*(9)
			//			3*(8)
			//			10*(1)
		}
		System.out.println("누적된 총합: "+sum);
/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
 		짝수는 빼기, 100까지 */
		// 1-2+3-4...>=100??
		//어디까지 모르겠다
		
		int i = 1;
		int total = 0;
		while(true) {
			if(i%2 == 0) {//짝수 빼기
				total = total -i;
			}else {//홀수 더하기
				total = total + i;
			}
			
			if(total>=100)
				break;
			i++;//밑에 넣은 이유 100이 넘어서 계산을 시작 그래서 멈추는 시점에 증가 
		}
		// 1-2+3-4 ....+197 -198 +199
		//2개 셋트 -1
		//1-2  3-4
		//-198 ---> 99개 세트 ---> -99 + 199 =100
		System.out.println("100 이상이된 시점의 누적합 :"+ total+"얼마까지 계산: "+i);
		
		total=0;
		for(i=1; total<100; i++) {
			if(i%2 == 0) {//짝수 빼기
				total = total -i;
			}else {//홀수 더하기
				total = total + i;
			}
		}
		System.out.println("100 이상이된 시점의 누적합 :"+ total+"얼마까지 계산: "+i);
		
	}

}
