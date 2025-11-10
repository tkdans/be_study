package be_study.random;

public class Rand01 {

	public static void main(String[] args) {
		// 난수 (랜던값)뽑기 사용
		//Math.random()	0<=랜덤값<1
		//(int)(Math.random() * 갯수(범위))+시작숫자
		//1~10까지 중 램덤
		//(int)(Math.random()*10)+1
		
//		랜덤값 0 ~1    *10	(int)  +1
		
		for(int i=1; i<=10; i++)
		System.out.println(Math.random());
		for(int i=1; i<=10; i++)
			System.out.println(Math.random());
		for(int i=1; i<=10; i++)
			System.out.println((int)(Math.random()*10)+1);
		for(int i=1; i<=10; i++)
			System.out.println((int)(Math.random()*50)+1);
	}

}
