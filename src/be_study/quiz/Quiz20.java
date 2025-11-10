package be_study.quiz;

public class Quiz20 {

	public static void main(String[] args) {
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.
/*
		1.
		1 2   3   4
		5 6   7   8
		9 10 11 12
		13 14 15 16
*/
		int[][] arr = new int[4][4];
		//index 0~3
		int n =1;
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				arr[i][j]=n++;
				}//값을 저장
					}
	
	//값 출력
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
		System.out.printf("%3d", arr[i][j]);
		}
		System.out.println();
	}

		/*
		 * 
		2.
		1 5  9  13
		2 6 10 14
		3 7 11 15
		4 8 12 16
		*/
// i가 고정되어 뒤에 j가 증가
	//j가 고정되어있고 i가 증가
	
	//index 0~3
	System.out.println();
	n =1;
	for(int i = 0; i<4; i++) {
		for(int j = 0; j<4; j++) {
			arr[j][i]=n++;
			}//열 인덱스 고정
			//행 인덱스 변화
				}//방향을 바꾸어 값 저장 

//값 출력
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[i].length; j++) {
	System.out.printf("%3d", arr[i][j]);
	}
	System.out.println();
}
for(int j = 0; j<4; j++) {
	for(int i = 0; i<4; i++) {
		arr[i][j]=n++;
		}//열 인덱스 고정
		//행 인덱스 변화
			}//방향을 바꾸어 값 저장 

		
		/*
	 j  0  1  2  3
i 0		16 15 14 13
  1		12 11 10 9
  2		8   7   6  5
  3		4   3   2  1

	i:3			2			1		0
	j:3 2 1 0   3 2 1 1		3 2 1 0 3 2 1 0
		 */
System.out.println();
	n =1;
	for(int i = 3; i>=0; i--) {
		for(int j = 3; j>=0; j--) {
			arr[j][i]=n++;
			}//열 인덱스 고정
			//행 인덱스 변화
				}//방향을 바꾸어 값 저장 

//값 출력
for(int i=0; i<arr.length; i--) {
	for(int j=0; j<arr[i].length; j--) {
	System.out.printf("%3d", arr[i][j]);
	}
	System.out.println();
/*





		4.
		16 12 8 4
		15 11 7 3
		14 10 6 2
		13 9  5  1
*/
	}

}}
