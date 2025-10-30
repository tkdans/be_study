package be_study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// 출력
		System.out.println("println1");
		System.out.println("println2");
		String s1 = "text text";
		System.out.println(s1);
		// print 줄바꿈 없음
		System.out.print("print1");
		System.out.print("print2");
		System.out.println("println3");
		System.out.println(); // 줄 바꿈
		// 줄바꿈
		System.out.println("\nprintln3");// 줄바꿈

		// printf
		int hour = 15;
		int minute = 2;

		// 현재 시간은 15시 2분 입니다.
		// 정수 값을 printf에 입력
		System.out.println("현재 시간은" + hour + "시" + minute + "분 입니다.");
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n", hour, minute); // "현재 시간은 0시 0분 입니다.",변수, 변수

		// 문자열을 printf에 입력
		String menu = "멸치밥버거";
		// 오늘 점심 메뉴는 ㅇ 입니다.
		System.out.println("오늘 점심 메뉴는 " + menu + "입니다.");
		System.out.printf("오늘 점심 메뉴는 %s입니다.\n", menu);
		
		// 실수값을 printf에 입력
		double rate = 3.4612;
		// 오늘 기준 이자율은 3.4612% 입니다.
		System.out.println("오늘 기준 이자울은 " + rate + "% 입니다.");
		System.out.printf("오늘 기준 이자율은 %.2f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %10.4f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %-10.4f%% 입니다.\n", rate);
		// %는 %%로 나타낸다,
		// .2f%% --> 나타나는 숫자 수
		// .10.4f---> 전체칸수와 나타나는 숫자 수

		// 입력 받기 Scanner
		// css 아이콘 사용하는 것처럼 기능에 관련 것을 가져와야 한다.
		Scanner scanner = new Scanner(System.in);

		// int 정수형 scanner. nextInt()
		// double 실수형 scanner. nexrDouble()
		// String 문자열 scanner. nextLine()
		// 코딩을 아래로 순서대로 진행된다. 그러면 밑에 코딩을 
		// 1.숫자를 입력하세요.가 먼저 console창에 나오면 숫자를 잆력하면
		//2. 그다음 실수형 입력하세요 문자가 console창에 뜬다
		System.out.print("숫자를 입력하세요 :");
		int number = scanner.nextInt();
		System.out.println("당신이 입력한 숫자는 " + number + "입니다.");
		System.out.printf("당신이 입력한 숫자는 %d입니다.\n", number);
		
		System.out.print("실수형 입력하세요 :");
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한 숫자는 %f입니다.\n", number2);
		// 문자열은 엔터가 입력되기 전에 문자를 가져간다, 위에 int와 double이 남긴 엔터가
		//있어서 안되는 경우
		scanner.nextLine(); //  그래서 청소를 (이전에 남은 찌꺼기 엔터 처리용)
		System.out.print("문자열을 입력하세요 :");
		String str = scanner.nextLine();
		System.out.printf("문자열을 입력하세요:"+ str);
	}

}
