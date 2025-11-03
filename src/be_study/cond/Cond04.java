package be_study.cond;

public class Cond04 {

	public static void main(String[] args) {
		//중첩해서 사용
//조건식 ? 참: 거짓
//조건식 ? 참: (조건식 ? 참: 거짓)
		/*
		if() {//참이면 실행
			
		}else {//거짓이면 if 실행 
			
			if() {}//참인지 확인
		}
		*/
		
		//21시 전에 일찍
		//21시 늦게 늦게
		
		//8시 많이 많이
		//8시 적게 적게
		
		//일찍 많이
		//일찍 적게
		//늦게 많이
		//늦게 적게
		//조건문으로 비교
		int goBedTime = 21;//범위를 지정한다. switch문은 힘들다
		int sleepTime = 8;// 수면시간
		
		if(goBedTime<=21) {//일찍
			
		if(sleepTime>8) {// "일찍 많이"
			System.out.println("일찍많이");
		}else {
			System.out.println("일찍적게");
			}
			
		}
		else{//늦게
			if(sleepTime>8) {// "일찍 많이"
				System.out.println("일찍많이");
			}else {
				System.out.println("일찍적게");}}}}
		
		




