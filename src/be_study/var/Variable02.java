package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2진수, 8진수, 10진수, 16진수: 해당숫자가 되는 시점에 자릿수가 올라간다.
		//
		int num2 = 0b10; //2집수표기로 10 --> 실제값 2   1010 //0010010
		int num8 = 012; //8진수표기로 12->실제 값 10
		int num10 = 10; //10*
		int num16 = 0x30; // 16진수표기 30 -> 실제값 48
		// 전화번호 저정 010123456178 8진수로 인식한다.
		
		char chr1 = 'A'; // chr 타입 (정수타입) : 문자 1개 저장
				      // 'A'작은따옴표로 감싸서 문자 1개
				      	// 'abc'-> 'xxx'
						// 문자1개를 정해둔 문자로 인식을 할 수 있게 한다. 
		char chr2 = 86;
		char chr3 = 0x23; // 실제값 291
		//케릭터셋 문자세(코드표)
		// 유니코드 asc코드표 숫자를 기반으로 문자를 저장하는 타입
		//
		char chr4 = 'F';
				
			System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		char chr5 ='안';
		//char chr6 = '안녕' ; // char은 문자 1개만 가능
		//문자열 타입 " " 큰따옴표로 감싼 여러개의 문자
		
		//String 클래스의 대부분은 문자도 대문자 구분 지어야 한다.
		// 변수로 오는 경우는 문자는 상관이 없다.
		String s1 = "안";
		String s2 = "녕";
		String s3 = "안녕하세요~";
		String s4 = "1324"; //문자로 인식 한다. 연산이 안된다. 갖다 붙여버린다.
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n = 1234; //정수형
		System.out.println(n+10);
		//1234+10=1244
		System.out.println(s4+10);
		//"1234" +10="123410"
		System.out.println("지금은" + 16 + "시 입니다.");
		System.out.println("지금은 16시 입니다.");
		
		String msg = "\"안녕\"하세요";
		System.out.println(msg); // 안녕하세요 "안녕"하세요
		System.out.println("어서\t오세요~\n반갑습니자.");
		
		double d1 = 12.123;
		
		;
	}

}
