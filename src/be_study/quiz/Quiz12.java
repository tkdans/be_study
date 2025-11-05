package be_study.quiz;

public class Quiz12 {

	public static void main(String[] args) {
		
		     
		        // 바깥쪽 루프: 5번의 "12345" 뭉치를 만듭니다.
//		        for (int i = 1; i < 5; i++) {
//		            // 안쪽 루프: 1부터 5까지 숫자를 출력합니다.
////		            for (int j = 1; j <= 5; j++) {
////		                System.out.print(j);
//		        	System.out.print("");
//		           // 각 뭉치 사이에 공백을 추가합니다.
//		        	 System.out.println("12345"); 
//		        }
		        
//		        for (int i = 1; i <= 5; i++) {
//		        	System.out.println("12345");
//		        }
//		        for(int i = 0; i<5; i++) {
//		        	for(int j = 1; j<=5; j++) {
//		        		System.out.print(j);}
//		        	System.out.println();
//		        }
//		for(int i = 1; i<=5; i++) {
//			
//			for(int j = 1; j<=5; j++) {
//				System.out.print(i);
//			}System.out.println();
//		}
//		Hint
//		i, j 값 변화 추적 -> 규칙 찾기
//		print
//		println
//
//
//		※규칙을 찾아보고 작성
//		1) 반복문 1개로 결과 만들기
//		2)반복문 2개 중첩해서 결과만들기
//
//		//아래와 같은 결과가 출력되도록 코드를 작성하시오
//		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
		System.out.println("-------------");
		System.out.println("12345");//
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("---------------");
		for(int i=1; i<=5; i++) {//i: 12345
			System.out.println("12345");
		}
		System.out.println("---------------");// 결과값 출력 후 반복횟수한 경우
		for(int j=1; j<=5;j++){// 반복회수
			for(int i =1; i<=5; i++) {//12345 한줄 출력
				System.out.print(i);
		}
			System.out.println(); //줄바꿈
		}
//	for문	밖에 기준값 줄 바꿈_역활
//			안에 기준값
//			11111
//			12345
//			22222
//			12345
//			33333
//			12345
//			44444
//			12345
//			55555
//			12345
//		//2.
//		11111
//		22222
//		33333
//		44444
//		55555
		System.out.println("---------------");
		//i : 1 2 3 4 5
//		for(int i= 1; i<=5; i++) {
//			System.out.println(""+i+i+i+i+i);
//			//(1111*1)
			for(int i= 11111; i<=55555; i=i+11111) {
				System.out.println(i);
		}
//			for(int i =1; i<=5; i++) { //i 1 11 1 1 22 2 22 3 3 3 3 4 55 
//			for(int j=1; i<=5;j++)// 단순 5회 반복용
//				{//12345 한줄 출력
//					System.out.print(i);
//			}
//			System.out.println();
//			}
		    }
	}


