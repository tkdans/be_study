package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

*/
//		int i = 0; 
//		for(i=i; i<=10; i++) {
//			System.out.println("i가 "+i+"번");
//		}
//		for( i=1; i<10; i++) {
//			System.out.println("i가 "+i+"번");
//		}
//		for(i=10; i<=100; i+=10) {
//			System.out.println("i가 "+i+"번");
//		}
//		for(i=25; i<=100; i+=25) {
//			System.out.println("i가 "+i+"번");
//		}
		
		/*
		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
//		i = 50;
//		while (i<=55) {
//			System.out.println("i가 "+ i +"반복");
//			i++;
//		}
//		int j = 10;
//		while (j >=1) {
//			System.out.println("j가 "+ j +"반복");
//			j--;
//		}
//		int c = 30;
//		while(c>=0) {
//			System.out.println("c가 "+ c +"반복");
//			c-=5;
//		}
//		int d = 30;
//		while(d>=5) {
//			System.out.println("d가 "+ d +"반복");
//			d-=5;
//		}
//		int b = 25;
//		while(b>=0) {
//			System.out.println("b가 "+ b +"반복");
//			b-=5;
//		}
//		1) i가 0~10으로 11번 반복
		for(int i=0; i<11; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();//줄바꿈 역활
//		2) i가 1~9로 9번 반복
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d",i);
		}
//		3) i가 10 ~ 100 으로 10번 반복
		for(int i=10; i<=100; i=i+10) {
			System.out.print(i + "");
			}
//		4) i가 25 50 75 100 해서 4번 반복
		for(int i=25; i<=100; i=i+25) {
			System.out.print(i + "");}
//		while.
//		5) i가 50 ~ 55로 6번 반복
		int i = 50;
		while(i<=55) {
			System.out.print(i+"");
			i++;
//			if(i>55)
//				break;
		}
//		6) i가 10 ~ 1로 10번 반복
		i=10;
		while(i>=1) {
			System.out.print(i+ "");
			i=i-1;
		}
		System.out.println();
//		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		//30 25 20 15 10 5 0
		i=30;
		while(i>=0) {
			System.out.print(i+ "");
			i=i-5;
		}
		System.out.println();
//		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		i=30;
		while(i>0) {
			System.out.print(i+ "");
			i=i-5;
		}
		System.out.println();
//		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		i=25;
		while(i>0) {
			System.out.print(i+ "");
			i=i-5;
		}
		System.out.println();
		
}
}
