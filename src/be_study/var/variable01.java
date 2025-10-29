package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 선언 (값을 담을 수 있는 바구니)
		// 변수 선언 시점이 중요하다.
		//타입 여백 변수명
		// int 타입 : 정수형 숫자 타입
		
		// 변수 선언
		int abc; // 변수 선언
		int def; // 정수형 숫자 타입의 변수
		int point;
		int score;
		
		score = 90; //score라는 변수에 90이란 값을 저장
		//int score=90; // 중복된 로컬 변수로 선언할 수 없다.
		
		//level = 99; // 선언한 변수가 아니다 .
		int level; // 선언한 라인보다 변수 위에 있으면 선언이 안된다. 순서도 중요하다
		
		int math = 99; //선언과 동시에 저장한 경우 = 초기화 (변수의 최초의 값을 세팅하는 것)
		int time; //변수 선언
		time = 12; // 변수의 값을 12로 저장
		time = 13; // 변수 12값를 빼고 13값으로 바뀐 것 (무제한)
		//변수는 하나지만 계속 갖다 쓸 수 있다.
		int myTime = 10 + 5 -2; // 연산이 가능
		myTime = time +5; //변수를 계속 가져다가 쓸 수 있는 형태가 된다. 18값이 저장이 된다.
		//time = 20;  time 값은 20
		myTime = time + 4 + time - 1 + time;
		//        13 +4+13-1+13 = 42
		// 마지막 라인 수의 존재하는 값의 수에 따라서 계산된다.
				
		int value = 20; // value 변수선언만 + 초기화(값저장)
		int reult = value + 5; // 값이 있는 변수만 연산 가능 그러면 이경우 사용할 수 없다
		// 개별 선언
	//	int x;
	//	int y;
	//	int z;	
		// 동시에 선언
		int x,y,z;
		//변수명은 영문으로 의미있게 전달하는게 좋다 단어로 저장하는것이 좋다
		//띄어쓰기는 영문에서 대문자로 표현 newFile
		//출력
		System.out.println("문자를 넣으면 출력");
		System.out.println(1235);
		System.out.println(value);
		System.out.println(reult + 50);
		System.out.println( reult + value + reult + value);
		//                    25     20     25       20 
		System.out.println(myTime);
		
		int totalScore = score + score + 50; //90+90+50
		System.out.println(totalScore); // 260
		System.out.println(totalScore + 30); //230
		System.out.println(totalScore);//230
		totalScore = totalScore + 70; // 저장하는 과정이 있느냐 없느냐에 따라 다르다.
		System.out.println(totalScore); //300
		
		//변수의 특징_ 변수의 위치를 바꾸는 방법
		// a:10 b:20 값을
		// a:20 b:10으로  바꾸는 방법
		int a = 10;
		int b = 20;
		System.out.println(a); //10
		System.out.println(b); //20
		// int를 하나 더 만즐어 복사하고 변수값을 다르게 저장한다.
		int c = a; // a:10 b:20 c: 10
		a=b;	//a:20 b: 20 c:10
		b=c;    // a:20 b:10 c:10
		// a:20 b:10으로  바꾸는 방법
		System.out.println(a); 
		System.out.println(b);
		
		
	}

}
