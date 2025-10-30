package be_study.var;

public class Variable03 {

	public static void main(String[] args) {
		// 타입 변환
		
		// 1. 자동형 타입 변환
		// int < double
		
		int i1 = 30; //숫자
		int i2 = i1; // 크기가 똑같다
		//int i3 = 3.11 //정수형 변수 = 실수형 값 안된다.
		
		double d1 = 3.11; //실수형으로 저장
		double d2 = d1; // 크기가 맞아 넣을 수 있다.
		
		double d3 = 40; // 자동 변환이 일어나는 것이다. double -> int , 40 -> 40.0
		double d4 = 40.0;
		System.out.println(d3); // 40.0
		double d5 = i1; // double -> int, 작은 컵에서 큰컵으로 가는 것 30 -> 30.0
		
		char c1 = 'A';
		int i3 = c1; //'A' -> 65
		System.out.println(c1); //A
		System.out.println(i3);//65
		
		char c2 = (char) i3; //(char)65
		System.out.println(c2);// A
		
		double dd1 = 12.34;
		int il1 = (int) dd1; //강제타입변환 12.34 -> 12
		System.out.println(il1);
		
		//java에서 정수 --> int
		//java에서 실수 --> double
		float f1 = 4.45f; //강제변환을 해준다
		double dd2 = f1; // float < double 자동타입 변환
		
		// 연산에서 타입벼환
		int i10 = 3;
		double d10 = 5;
		
		//int i11 = i10 + d10; // int + double ---> double
		//         3   +  5 =8 --> 8.0
		double d11 =i10+ d10;
		
		int i12 = 10;
		double d12 = 5.5;
		
		//int i13 = i12 + d12; //int+ double --->double
		//  10 +5.5  --> 15.5
		
		int i13 = (int)(i12 + d12);
		//          15
		i13 = i12 + (int)d12;
		// int + (int)double -> int
		//        10    +    5 -> 15
		
		
		
		//i13 = (int) i12+d12;
			//		(int) int+double -->double
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		// 어느 시점에 소수점을 버리고 계산하는가에 따라 값이 다르다
		//중요 이률이나 할인에 따라 단위 절삭에 따라 결과값이 다르다
		//int result = (int) dv1 + (int)dv2;
		//   				5		6
		//System.out.println(result);
		//result = (int)(dv1+dv2);
		//               12
		//System.out.println(result);
		
		//int 타입이 중복 되는 경우
				int x = 1;
				int y = 2;
				double result = x / y ;
				// int / int --> int
				// 1/2 ->0.5 ->0
				//double result = 0.0 
				//result2 = (double)x / y;
				//result3 = x /(double) y ;
				//result4 = (double)x /(double) y ;
				//result0 = 1/2;
				//result2 = (double)1/2;
				//result2 = 1/2.0; // 실수로 인식할 수 있다.
		
				
		
		
		
		
	}

}
