package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//		
//	//		1.로직, 입력, 배열
////	+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
////	몇번째 수인가요? : 그에 해당하는 수를 출력
////	ex) 10 20 30 50 90
////	몇번째 수인가요? 5
////	결과 : 90
//// 배열없이
//	System.out.println("숫자를 입력해주세요 : ");
//	int n1 = scanner.nextInt();//띄어쓰기로 5개 입력
//	int n2 = scanner.nextInt();
//	int n3 = scanner.nextInt();
//	int n4 = scanner.nextInt();
//	int n5 = scanner.nextInt();
//	System.out.print("몇번째 수인가요:");
//	int num = scanner.nextInt();
//	if(num == 1) {
//		System.out.println("결과: "+n1);
//	}else if(num ==2) {
//		System.out.println("결과: "+n2);
//	}else if(num ==3) {
//		System.out.println("결과: "+n3);
//	}else if(num ==4) {
//		System.out.println("결과: "+n4);
//	}else if(num ==5) {
//		System.out.println("결과: "+n5);
//		
//	}else {
//		System.out.println("잘못");
//	}
		//	int[] num = new int[5];
			//nArr 5개 공간
			//index : 0 1 2 3 4 
			//num은 참조타입 , 값을 저장 없다
			
		
		// int 변수 
//		System.out.print("숫자를 입력해주세요 : "); 	
//		num[0]= scanner.nextInt();
//		
//        System.out.print("숫자를 입력해주세요 : ");
//		num[1]= scanner.nextInt();
//		
//		System.out.print("숫자를 입력해주세요 : ");
//		num[2]= scanner.nextInt();
//		
//	    System.out.print("숫자를 입력해주세요 : ");
//		num[3]= scanner.nextInt();
//		
//		System.out.print("숫자를 입력해주세요 : ");
//		num[4]= scanner.nextInt();
		     // 똑같은 것은 방지, 반복문으로 만든다   
//	        for(int i = 0; i<5/*num.length;*/; i++) {// i : 0 1 2 3 4
//	        	System.out.print("숫자를 입력해주세요 : ");
//	    		num[i]= scanner.nextInt();
//	        }
//		       System.out.println();
//		       
//	       System.out.print("몇번째 수인가요? : ");
//		       int n = scanner.nextInt(); // 규칙 0번째 배열이 0부터 시작하는 개념
//	       //index : 0 1 2 3 4
			// 순서:  1 2 3 4 5
		
//	       System.out.println("결과"+num[n-1]);
		       

//			
//		}
		

//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
	/*
			//n1 n2 n3 n4 n5
			//n5 n4 n3 n2 n1
			//배열 활용 저장 후 출력하는 방법
	       int[] num1 = new int[5];
	       //12345
	       //54321
	       //index ------
	       //01234
	       //43210
	       ///저장하는 과정 순방향
	       for(int i = 0; i<5; i++) {
	        	System.out.print("숫자를 입력해주세요 : ");
	    		num1[i]= scanner.nextInt();
	    	   }
	       //인덱스를 꺼꾸로 세울 때 조건으로 출력 역방향
	       for (int i=4(num1.length-1;) i>=0; i--) {
//	    	   System.out.print(num1[i]+" ");
//	       }
//			
//			 	   
           
*/
	
	
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
	//반복문 어떤 흐름 어떤 패턴 |접근하는 순서대로 저장
	// 
	int[][]arr= new int[4][4];
	//저장을 값을 저장
	//변수는 밖에 선언
	int n1 = 1;
	for(int i =0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			//i:0000 1111 2222 3333
			//j:0123 0123 0123 0123
			//n:1234 5678 9101112 13141516
			//arr[0][3]=4, 
			//arr[i][j]=n, 
		}
		
			
	int[][] num3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//	for(int i = 0; i<num3.length; i++) {
//		System.out.println(num3[i][j]+"");
//		System.out.printf(num2[i]+"");
	}
	}

}
