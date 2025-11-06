package be_study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// Array 배열
		int score1 =100;
		int score2 =50;
		int score3 =75;
		int score4 =80;
		int score5 =40;
		
		int sum = 0;
		sum = score1 + score2+ score3+ score4 + score5;
		double avg = sum / 5.0;
		
		System.out.println("총점 : "+sum + "평균"+avg);
				
		//점수들~~ 한번에 모아 보겠다.
		//하나인지 여러개인지 알 수 있게 scores scoreArr scoreArrey
		//사용하는 방법은  변수의 값을 초기화 , 값을 세팅하고
		//배열을 접근할 때  구분하는 방법은 index로 배열인덱스는 0부터 시작 
		int[]scoreArr = {100,50,75,80,40};
		//index				0	1	2	3	4
		
		sum = 0;
		sum = scoreArr[0/*인덱스*/]+scoreArr[1]+scoreArr[2]+scoreArr[3]+scoreArr[4];
		avg = sum/ 5.0;
		System.out.println("총점 : "+sum + "평균"+avg);
			
		sum= sum + scoreArr[0];
		sum= sum + scoreArr[1];
		sum= sum + scoreArr[2];
		sum= sum + scoreArr[3];
		sum= sum + scoreArr[4];
		//5번 반복뿐만 아니라 01234가 숫자로 바뀐다.
		// index :01234
		sum =0;
		for(int i=0; i<5; i++ ) {
			sum = sum + scoreArr[i];
		}
			System.out.println("총점 : "+sum);
			//방법론과 배열이 친한 관계, 배열의 인덱스를 이용해 for문으로 쉽게 구할 수 있다.
		
			//int[]pointArr;//단순선언]
			int[] pointArr = null; //null값 초기화, 공간만 확보 
//			pointArr = {30, 12, 10, 5, 1} 불가능한 사용방법
//			pointArr = new int[] {30, 12, 10, 5, 1}// 사용가능
			// 인덱스를 사용하여 배열변수로 접근하면 인트변수
			pointArr = new int[5]; // 사이즈(공간)을 명시하면서 생성
			//int n;
			//n = 30;
			//pointArr = >참조변수 주소를 의미
			//pointArr -> int변수 
			//index 0 1 2 3 4
			pointArr[0] =30;
			pointArr[1] =12;
			pointArr[2] =10;
			pointArr[3] =5;
			pointArr[4] =1;
			//pointArr[5] =50; 사용불가--> 인덱스 범위 벗어나
			//저장하고 싶은 값 : 1 2 3 4 5
			
			
			for(int i=0; i<5; i++) {// i : 0 1 2 3 4 인덱스~
				pointArr[i]=i+1; //값 1 2 3 4 5
			}
			for(int i =1; i<=5; i++) {// i: 1 2 3 4 5 값
				pointArr[i-1]=i;	 //인덱스:0 1 2 3 4 
			}
			//배열은 똑같은 공간에 여러개를 관리
			//인덱스 몇번째 칸에서 가져오겠다. 0에서 시작
			// 배열의 값을 출력을 할 수 있다.
			//배열 index : 0~
			for (int i =0; i<5; i++) { // i: 0 1 2 3 4 
				System.out.print(pointArr[i]+"");
			}
			System.out.println();
			
			System.out.println(pointArr);//주소
			
			//초기값 확인
			int[]intArr = new int[6];
			double[] doubleArr = new double[12];
			String[] stringArr = new String[30];
			boolean[] booleanArr = new boolean[7];
			
			for(int i =0; i<6; i++ ) {
				System.out.println(intArr[i]+"");}
			for(int i =0; i<12; i++ ) {
					System.out.println(doubleArr[i]+"");}
			for(int i =0; i<30; i++ ) {
						System.out.println(stringArr[i]+"");}
			for(int i =0; i<7; i++ ) {
							System.out.println(booleanArr[i]+"");}
			// 배열 길이	
			for(int i =0; i<intArr.length; i++ ) {
								System.out.println(intArr[i]+"");}				
			for(int i =0; i<doubleArr.length; i++ ) {
				System.out.println(doubleArr[i]+"");}
			for(int i =0; i<stringArr.length; i++ ) {
				System.out.println(stringArr[i]+"");}
			for(int i =0; i<booleanArr.length; i++ ) {
				System.out.println(booleanArr[i]+"");}
			
			
	}

}
