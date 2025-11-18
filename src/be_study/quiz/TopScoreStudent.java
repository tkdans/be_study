package be_study.quiz;

public class TopScoreStudent {
	String names;

	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		/* 해당 함수를 완성하세요. */
		int scores = 0;
		int index = 0;
		for (int i = 0; i <= 9; i++) {
			if (arr[i] > scores) {
				scores = arr[i];
				index = i;

			}
		}
		return index;
	}

}
