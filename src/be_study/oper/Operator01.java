package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {
	
		// 산술 연산지
		
		System.out.println(1+1);
		System.out.println(10-5);
		System.out.println(5*9);
		System.out.println(30/7);
		System.out.println((double)30/7);
		System.out.println(30/7.0);
		System.out.println(9%5);
		System.out.println(28%9);
		
		//부호(+ -)
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		System.out.println(-(-10));
//증감 ++, -- 1증가, 1감소
		// ++변수 증가 먼저
		// 변수 ++ 증가 나중에
		System.out.println("====================");
		
		int x = 10;
		System.out.println(x);
		System.out.println(++x);// 1씩증가
		System.out.println(x); // x:11, 원본 변수에 영향을 준다.
		
		System.out.println(1+x);// 일시적인 값
		System.out.println(x);
		//X: 11
		System.out.println(x++);// 이 라인 줄을 끝내고 다음줄에 내려갈 때부터 한다.
		System.out.println(x);
		// 증감이 앞에 있냐 뒤에 있냐 
		
		int y = 8;
		System.out.println(y--); //뺄셈 8
		System.out.println(--y); //6 뺄셈 7, 앞에 있어서 6
		System.out.println(y);//6
		int z = 30;
		System.out.println(z+1); //31 (변수에 영향이 없다)
		System.out.println(z++); //30
		System.out.println(z);//31
		z++;
		++z;
		z= z+ 1; 
		
		int q = 1; //2
		int w = 3; //2
		int e = 10 + ++q; //10+2 = 12
		int r = 3 + w--;// 3 + 3 = 6
		System.out.printf("%d %d %d %d\n",q,w,e,r);
										//	2 2 12 6, 
		// w값이 2인 이유는 증감부호가 뒤에 있어서 연산이 이루어지니까,
		//연산을 하면 3-2 끝의 연산값을 가지고 온다

		// 논리 부정  true false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		isHungry = !isHungry; // !는 부정을 뜻한다.
		
		//문자열 결합 연산자
		System.out.println(133+3.345+"문자");
		
		//비교 연산자 결과값이 boolean 타입으로 산출
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(3 < 5);
		System.out.println(10 >= 9);
		System.out.println(4 > 4);
		System.out.println(9 <= 1);
		boolean b1 = (9 > 8); // boolean타입으로 결과가 나와야 한다.
		
		//논리 연산자
		//AND연산자 &&, or연산자 ||(shift+\) 논리를 비교
		boolean b2 = (10>6) && (10>5);
		//				true && true --> true
		System.out.println(b2);
		
		boolean b3 = (5 !=1)||(10<4);
		System.out.println(b3);
		// 				true || fale -> true
		boolean b4 = (2>=1) && !(3<4); //부정;
		System.out.println(b4);
		// 				true && false ->false
		
		//대입연산자
		int a = 30;
		a = 50;
		//a + 20 = 50; //안된다
		
		a += 30; //a = 30
		a -= 10; //a = 10
		a *= 3; // a = a * 3
		a /= 2; // a = a/2
		a %= 4; // a = a%4
		
		// 삼항 연산자 (조건)
		int point = 300; // 포인트
		
		//포인트 200점까지는 사은품 생수
		//200점 넘으면? 커피
		//조건식 ? 앞 : 뒤
				//참: 거짓
		String eventItem = point >200 ? "커피" : "생수";
			System.out.println(eventItem);
			eventItem = point <= 200 ? "생수" : "커피";
			System.out.println(point > 50 ? "단골" : "신규");
		//point > 200의 반대는 point <=200이다 
			// point >= 200의 반대는 < 200이다
			System.out.println(point > 50 ? "단골" : "신규");
			//(조건식) ? 참 : 거짓 조건식은 중복이 가능하다.
			//(조건식) ? 참 : ()
			//(조건식) ? 참 : ((조건식) ? 참 : 거짓)
			//(조건식) ? 참 : (조건식) ? ((조건식)? 참 : 거짓) : 거짓)

			
			//0~200 : 생수
			//201~300 :커피
			//301~	:멕주
			
			point = 320;
			
			//삼항연산자 조건식
			System.out.println(point <= 200 ? "생수": (point > 300 ? "맥주" : "커피"));
			
			int num =-30;
			System.out.println(num < 0 ? "음수" : "양수");
			//음수 0 양수 논리구조(로직)
			System.out.println(num == 0 ? "0" : (num > 0 ? "양수" : "음수"));
			System.out.println(num !=0 ? (num < 0 ? "음수" : "양수"): "0");
			// 알고리즘 로직을 가지고 있는 조건이나 값을 분석헤서 논리적으로 값을 
			
			System.out.println(num>0? "양수":(num< 0?"음수":"0"));
			System.out.println(num>=0 ? (/*다시구분*/ num==0? "0": "양수"):"음수");
			
			
			
			
			
			
			
	}

}
