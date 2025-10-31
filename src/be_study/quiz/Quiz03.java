package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
	
//	1. 아래 1), 2) 에 맞게 풀이.
//	int x = 10;
//	int y = 4;
//	___result = ___x/y; //int/int --> int 2
//	System.out.println(result);
//
//	1) 결과가 2가 나오도록 작성하세요
		int x = 10;
		int y = 4;
		int result = x/y; //int/int --> int 2
		System.out.println(result);
//	int result = X/Y;

//	2) 결과가 2.5가 나오도록 작성하세요
		double result1 = (double)x/y; //int/int --> int 2
		System.out.println(result1);
//	double result = double X/Y // 틀렸어, (double)문법이 틀렸어
//	
//	2. 결과가 7.5가 나오도록 작성하세요
//	double a = 3.5;
//	double b = 4.7;
//	double result =;
//	System.out.println(result);
		double a = 3.5;
		double b = 4.7; //double인 값을 int로 변환
		double result2 = a + (int)b;// 배운 내용인데 활용하지 못했어
		System.out.println(result2);
		
//	3. 계산결과가 12가 나오도록 작성하세요
//	String a = "3.4";
//	String b = "4";
//	______ result = ________;
//	System.out.println(result);
		String a1 = "3.4";//3.4 * 4 --> 13.6 
		String b1 = "4";	//3 * 4 ---> 12
		//3+3+3+3
		double c3 = Double.parseDouble(a1);
					//(int) c3 * Double.parseDouble(b1);
		int result3 =(int)Double.parseDouble(a1)*Integer.parseInt(b1);
		System.out.println(result3);
//	int result = Integer.parseInt(a)*Integer.parseInt(b) 문법도 방법도 틀림
//
//	----------------------------------------------------
//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요. 문자열로 나타내는이 중요
//	String a = "10";
//	int b = 3;
//	double c = 4.5;
//	_____ result = _______;
//	System.out.println(result);
		String a2 = "10";
		int b2 = 3;
		double c = 4.5; //3*4=12 , 3*4.5 =13.5
						//"10"+13 => "1013"
		String result4 = a2 +(int) b2*c;
		System.out.println(result4);
		
//	String result a+ (b*c) 망했어
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
//	int a = 4;
//	double b = 3.4;				// 2	4	3	// 4 *6 + "3"-> 243
//	String c = "6.8";
//	_____ result = _______;
//	System.out.println(result);

		int a3 = 4;
		double b3 = 3.4; // 2	4	3	// 4 *6 + "3"-> 243
		String c1 = "6.8";
		//String result5 = a3 * (int) Double.parseDouble(c1)+ (int)b3;
		//System.out.println(result5);	
		
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//	int x = 111;
//	int y = 13;
//	int result = _____;
//	System.out.println(result);
//
//	1) 출력결과 : 7
//	2) 출력결과 : 8
//   x/y
//	번역 보기
		int x1 = 111;
		int y1 = 13; //111/13 -? 8.538 , (int) 8
		int result6 = x1/y1;
		System.out.println(result6);
		
		int x2 = 111;
		int y2 = 13; //111/13 -? 8.538 , (int) 8
		int result7 = x2 % y2;
		System.out.println(result7);
		
		//int result8 = x2 / y2*(x2 / y2)
				
	}

}
