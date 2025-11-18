package be_study.quiz;

public class TopScorestudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basecode
	
		// 배열 생성
		String[] names = {"Elena","Suzie","John","Emily","neda","kate","Alex","Daniel","hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};

		// 1등 인덱스 검색
		int i = topIndex(scores);

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		}

}
