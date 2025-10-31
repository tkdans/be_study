package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
//		아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.
//		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
//		6000원 이하 -> "훌륭" 이하
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"
		//int menu = 6000;
		//System.out.println( price >= 6000 ? "훌륭" : (6000 <=8000 ? "선방" : (8000 <= 12000 ? "눈물" : (price<12000 ? "물로배채우기")))); 
		
		// 조건의 범위 값을 정의 
		//1. 조건의 수 계산
		//어디를 구분하느냐
		int menuPrice = 7500; //점심값 (임의로 변경
		String result = menuPrice <=6000 ? "훌륭" : (menuPrice);
		
		
		
			}

}
