package a;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실습문제 - 2차원 배열 :구구단
		/**
		 * 2단부터 9단까지 출력하기
		 * 1. 2차원 배열 선언 (2단~9단)
		 * 2.2차원 배열 초기화 하기 (반복문 사용)
		 * 3. 구구단 출력하기
		 * 
		 * 2*1=2
		 * 2*2=4
		 * ...
		 * 9*1=9
		 * 9*2=18
		 * 
		 */
		/*
		int [][] array = new int[8][9];
		for (int i =0; i<9; i++) {//바깥쪽 for문 : 행(row) 반복
			//
			for (int j=0; j<9; j++) {// 안쪽 for문: 열(column) 반복
				array[i][j] = (i+2)*(j+1);
				System.out.print(array[i][j]+"\t");
			}
			
			System.out.println();
		}
*/
		//2자원 배열에 구구단 결과값 넣기 (2중 반복문 사용)
		//예시: nums[0][0]=2 -> (2*1=2)
		//예시: nums[2][8]= 27 ->(3*9=27)

		//2차원 배열 출력하기 (구구단 출력하기)
//		int [][]nums = new int [8][9];
//		//단수
//		int row = nums.length;
//		//구구단에서 반복 횟수
//		int col = nums.length;
//		
//		for(int i =0; i< row; i++) {
//			for(int j = 0; j<col; j++) {
//				nums[i][j]=(i+2)*(j+1);
//			}
//		}
//		//2차원 배열 출력하기 (구구단 출력하기)
//		for(int i =0; i< row; i++) {
//			for(int j = 0; j<col; j++) {
//				nums[i][j]=(i+2)*(j+1);
//				//단수(i)x반복횟수 (j) = 결과값(nums[i][j])
//				System.out.printf("%dx%d=%d\t", i, j, i*j);
//			}
//		}
		//별 찍기 반복문 심화
		
		/* 별 출력하기
		  *
		  **
		  ***
		  ****
		  *****
		  */
		// n번째 라인에는 n개의 별이 출력된다.
		/*for(int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>j) 
				System.out.print(" ");
				else 
					System.out.print("*");
			}
			System.out.println();
		}
		 */
		for(int i =0; i<=5; i++) {
			for(int j=0; j< 5+i; j++) {
				if(5-j >=i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			}

}
	}
