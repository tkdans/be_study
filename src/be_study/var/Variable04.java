package be_study.var;

public class Variable04 {
// 피연산자 중 하나가 문자열일 경우에는 나머지 피연산자에도 문자열로 자동 변환
	public static void main(String[] args) {
		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		System.out.println(n1 + n2 + s1);
		System.out.println(n1 + s1 + n2);

		// 11 + 22 + 12 =45
		// 11+ 22 +"12"= 3312
		// 문자열의 타입 변환
		String s2 = "1234";
		int n3 = 16;
		System.out.println(s2 + n3);
		
		//String---> 숫자(정수/실수) (int/ double)
		System.out.println(Integer.parseInt(s2) + n2);
		//					Integer.parseInt("1234")
		// 1234 +16
		
		String s3 = "33.55";
		//int n4 = Integer.parseInt(s3);
		//왜 안되냐. 실수형태의 성질이 문자열 -> int 변환
		//double d4 = Double.parseDouble(s3); 변환하는 클래스
		
		//System.out.println(d4 + 12.1);
		
		//String s4 = "12a.12b";
		//Double.parseDouble(s4);
		
		// 논리값
		boolean b1 = true; // false;
		String s5 = "false"; // 문자열 형태 "false"
		boolean b2 = Boolean.parseBoolean(s5); //false로 변환하여 계산
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
				String s11 = String.valueOf(123);
				String s12 = String.valueOf(33.598);
				String s13 = 123+""; // "123"
				//         	int + String ->> String
				
	}

}
