package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		//Iteration 반복문
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		//for 문
//		for(초기화식; 조건식; 증감식;) {
//			실행문;
//		}
		
			//i:1 2 3 4 5 6 7 8 9 10(참) | 11(거짓)=>  
			//			10<=10
		// 						+1
		for(int i = 1;  i<=10;  i++) {
			System.out.println("즐겁다");
		}
		
		/*int i = 1 초기화는 영역안에서만 사용
		 
		 * if(i<=10)
		   system.out.println("즐겁다"); 
		 * 
		 * i++;
		 * 
		 * if(i<=10)
		   system.out.println("즐겁다"); 
		   if(i<=10) 거짓이 될때까지
		   system.out.println("즐겁다");
		 */
		
		
		int i = 0;// 변수선언을 앞서서 했다.
		//i : 1 2 | 3
		//		3<3
		for(i=1; i<3; i++) {
			System.out.println("화요일"); //1 2
		
		//i: 35 36 37 38 39 40 41 42 43 44(참)| 45(거짓)
				//i<45, 45<45
		for(i=35; i<45; ++i) {// 단순 10번 선택
			System.out.println("실행문1");
			}
		System.out.println(i);// 실행을 45까지 했을 때 거짓이라서 for문이 끝났다.
		
		System.out.println("다이어트 1일차");
		System.out.println("다이어트 2일차");
		System.out.println("다이어트 3일차");
		System.out.println("다이어트 4일차");
		System.out.println("다이어트 5일차");
		
		//j : 10 9 8 7 6 | 5
		//			5>5
		for (int j = 10; j>5; j--) {//단순 5회 반복
			System.out.println("다이어트 1일차");
			System.out.println("다이어트 2일차");
			System.out.println("다이어트 3일차");
			System.out.println("다이어트 4일차");
			System.out.println("다이어트 5일차");
		}
		
		System.out.println("------------------------------");
		//실행문에서 사용할 목적으로 값을 조정 --> 반복
		for(int j = 1; j<8;/*(범위를 꼭 챙겨라)*/ j++) {
		//j:1 2 
			System.out.println("다이어트" + j + "일자");
			//							1일차	
			//							2일차	
			//							3일차	
			//							4일차	
			//							4일차	
		}
		System.out.println("------------------------------");
		int number =1+2+3+4+5;
		number = number+1;
		number = number+2;
		number = number+3;
		number = number+4;
		number = number+5;
		
		//n: 1 2 3 4
		int sum = 0; // 0+0+0+0 = 0 , 덧셈에 영향을 주지않는다
		for (int n=1; n<=100; n++) {
			//sum :0 1 3 6 10 15
			sum= sum + n;
		//0(변수값) + 1(조건값)= 1	
		//1 + 2 =3
		//3 + 3 =6
		//6 + 4 =10
		//10 + 5 = 15
	}
		System.out.println("최종합" + sum );

		//10 20 30 40 50 60 70 80 90 100의 합
		//반복문 숫자의 반복 패턴을 찾는것이 좋다.
		int total=0 ;
		for(int k=10; k<=100; k= k + 10) {
			total= total + k;
		}
		System.out.println(total);
		
		total =0;// 변수가 아니다.
		for(int k =1; k<=10; k++) {
			//k:1 2 3 4 5 . . . 10
			//값: 10 20 30 40 . . . 100
			//k*10
			total=total + (k*10);
		}
		System.out.println(total);
		
		for(int k=400; k>100; k=k-50) {
	} //k: 400, 350, 300, 250, 200, 150| 100
		
		for(int k =2; k<20; k=k*2) {
			//k: 2 4 8 16 | 32
		}
		System.out.println(total);
		for(int k = 100; k>=90;k--) {
			//k: 100 99 98 97 96 95 94 93 92 91 90 | 89
		}
		System.out.println(total);
	}
	}}
	
