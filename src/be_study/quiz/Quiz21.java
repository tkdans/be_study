package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*  수행해야하는 순서(흐름)
		 * 조건 --> 처리 방향
		 * 연제까지 할 것인가 
		 * 어떻게 코드를 만들어야 하나?
		 * 뭘선택하느냐에 따라서 결과가 따라온다.
		 * 무슨 기준으로 처리하느냐
		 * 플로우차트 그려보기, 흐름을 그려보면서 정리하기
		 * 조건에 따라 선택하는 흐름의 변화
		 * *** 메뉴 뭐 시켰는지 어디에 저장/관리?
		 * *** 메뉴 뭐 몇개 시켰지?
		 * *** 메뉴 금액 얼만지 어디에?
		 * *** 가지고 있는 메뉴가 뭐뭐가 있는지
		 * 메뉴보여주기--> 메뉴선택 입력받기 --> 주문 수량 몇개 입력받기
		 * 추가주문 여부 체크(y/n) 
		 * ---> 추가주문 y -->다시 메뉴보여주기부터 반복
		 * ---> 추가주문 n -->(메뉴수량, 총금액) -- 끝
		 * 반복문 횟수 조건, 언제까지 보여줘야 할 것인가? 어느 시점에 멈춰야 할 것인가?
		 * 
		 * while(true){
		 * 메뉴보여주기
		 * 메뉴선택
		 * 수량선택
		 * 추가주문 여부 선택
		 * if(추가 주문 여부가 "n"일때
		 * break; ---> 주문 내역/ 금액
		 * 몇잔을 어떻게 관리하는가 중요
		 * 
		 * }
		 * 주문한 메뉴별 수량 보여주기
		 * 주문 총금액 보여주기
		 */
		Scanner scanner = new Scanner(System.in);
		//배열 활용
		String[] menuArr = {"아메리카노","카페라떼","바닐라라떼"};//메뉴이름
		int[] priceArr = {3500,4100,4300};//메뉴가격
		int[] countArr = new int [menuArr.length];//메뉴주문수량
		
		int menu; // 메뉴선택
		int count; // 수량선택
		String addOrder; //추가 주문여부
		
		while(true){
			//메뉴 보여주기
			System.out.println("======== 메뉴 ==========");
			for(int i=0; i<menuArr.length;i++) {
				System.out.printf("%d.%8s%7d원\n", i+1, menuArr[i],priceArr[i]);
			}
			
			System.out.println("=======================");
			// 메뉴선택
			System.out.print("메뉴선택 : ");
			menu = scanner.nextInt();
			
			if(menu>=1 && menu<=menuArr.length) {//정상선택
				break;
				
			}else {
				System.out.println("잘못입력");
			}
		}
		//메뉴선택 정상적으로 했다.
		
		//메뉴선택완료
		//수량 선택
	
		System.out.println("수량 선택 :");
		count = scanner.nextInt();
		//몇번 메뉴 선택? -->menu
		//몇개 시켰지? --> co
		countArr[menu-1] += count; //선택한 메뉴번호 -1 위치 인덱스에 수량 추가
		if(menu == 1) {
		menu1Count += count;
		}else if(menu == 2) {
			menu2Count += count;
		}else {
			menu3Count += count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// 자료구조로 저장할 것이냐? 자료구조, 알고리즘, 접근성의 도움 공부하면 좋다
		// 메뉴가 몇개인지? 각각 변수를 가지고 처리하는 방식, 정적인 코딩
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		//기타 필요한 변수
		int menu; // 메뉴선택
		int count; // 수량선택
		String addOrder; //추가 주문여부
		
		while{
			//메뉴 보여주기
			System.out.println("======== 메뉴 ==========");
			System.out.println("1. 아메리카노		3500원");
			System.out.println("2. 카페라떼 		4100원");
			System.out.println("3. 바닐라라떼 		4300원");
			System.out.println("=======================");
			
		}
		//메뉴선택
		System.out.print("메뉴선택 : ");
		menu = scanner.nextInt();
		
		if(menu>=1 && menu<=3) {
			//수량선택
			System.out.println("수량 선택 :");
			count = scanner.nextInt();
			if(menu == 1) {
			menu1Count += count;
			}else if(menu == 2) {
				menu2Count += count;
			}else {
				menu3Count += count;
			}
			
			//추가주문 여부 선택
			scanner.nextLine();
			
			System.out.print("추가주문 하시겠습니까?(y/n) :");
			addOrder = scanner.nextLine();
			//if (추가주문 여부가 "n' 이다?)
			//break; 주문내역/금액출력
			if(addOrder.equals("y")|| addOrder.equals("n")) {
				break;
		}else {//잘못선택 후 중첩으로 처리할 필요 없음.
			System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
//			continue;}
		
			else {//잘못선택 후 중첩으로 처리할 필요 없음.
			System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
		
//		int price = 0;
//		String menu = "";
//		switch(num1) {
//		case 1:
//			price = 3500;
//			menu = "아메리카노";
//			break;
//		case 2:
//			price = 4100;
//			menu = "카페라떼";
//			break;
//		case 3:
//			price = 4300;
//			menu = "바닐라라떼";
//			break;
//			default:
//				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
//				System.out.print("메뉴선택 : ");
//				int num2 = scanner.nextInt();
//				System.out.print("수량 선택 : ");
//				int num3 = scanner.nextInt();
//				System.out.print("추가 주문하시겠습니까?(y/n) : ");
//				String num4 = scanner.next();
				*/
				
		
		
       }
	       
		
	}


