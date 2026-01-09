package a;

public class C1 {

	public static void main(String[] args) {
		//실제 세계는 사물로 이루어져 있고 
		
//			Calculator calculator1 = new Calculator();
//			//calculator1.add(10,20);
//			System.out.println(calculator1.add(10,20));
//			//calculator1.max(10,50);
//			System.out.println(calculator1.max(10,50));
//			System.out.println(calculator1.multiplication(10,50));
			
			int[]scores = {3,9,10,20,60,70,90,30};
			ScoreManager sm = new ScoreManager();
			
			sm.printScore(scores);
			
			//총합
			System.out.println(sm.getTotal(scores));
			//평균
			System.out.println(sm.getAverage(scores));
	}

}


class Student{
	//학생번호
	
	//나이
	
	
	//성적
	
	//매서드
	public Student(String name, int age, int score) {
	//	this.name =name;
	//	this.age = age;
	//	this.score =score;
	}
}


//계산기 Calculator
//요구사항 - add 매서드, max 매서드
class Calculator{
	int add(int a, int b) {
		//더하기 구현 후 값 return 하기
		return a+b;
	}
	int max(int a, int b) {
		//a와 b중에서 큰 값 return 하기 
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	int multiplication(int a,int b) {
		return a*b;
	}
	int division(int a,int b) {
		
		if(b==0) {
			return 0;
		}else {
		return a/b;
	}
}
}
	/**
	 * Calculator calculator1 = new Calculator();
	 * 매서드 add, max의 결과값을 출력하기
	 * 
	 */
// 스코어 관리 클래스 
	/**
	 * 1.스코어 생성하기
	 * 2.스코어 출력하기
	 * 3.스코어 총점 계산하기
	 * 4.평균계산하기
	 * 
	 */
	class ScoreManager{
		void printScore(int[] scores) {
			//출력하기
			for(int i =0; i<scores.length; i++) {		
				System.out.println(scores[i]);
			}
			
		}
		int getTotal(int[]scores) {
			//스코어 총점 계산
			int sum = 0;
			for(int i =0; i<scores.length; i++) {
				sum += scores[i];
			}
			return sum; //계산한 값을 return
		}
		double getAverage(int[]scores) {
			//스코어 평균계산
			int sum = 0;
			double avg =0;
			
			for(int i =0;i<scores.length; i++) {
				sum += scores[i];
			}
			avg = (double)sum/scores.length;
			return avg;
			}	
	}
	

