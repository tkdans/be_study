package be_study.quiz;

public class Quix06 {

	public static void main(String[] args) {

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		double x = 2;
		double y = 2;
		System.out.println(x*y/2);

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		double x1 = 2;
		double x2 = 2;
		double y1 = 4;
		System.out.println((x1+x2)*y1/2);

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
			System.out.println(100 % 24);
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
			
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x3 = 10;
		int y3 = 20;
		System.out.println("x="+x3+ " y3="+y3);
		//x와 y를 바꾼 작업
		int z1 = x3;
		x3 = y3;
		y3 = z1;
		System.out.println("x="+x3+ " y3="+y3);

	}

}
