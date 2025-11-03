package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		// if-else if-else문 
		/*
		 if
		 if
		 if
		 ---
		 else 혼자 x
		 
		  if
		  else
		  
		  if
		  else if (연달아 물어본다) 혼자 x
		  
		  if
		  else if (연달아 물어본다) 혼자 x
		  else
		  if
		  else if (연달아 물어본다) 혼자 x
		  else if
		  else if
		  else if
		  else if
		  else 
		  
		 
*/
		int dice = 5;
				if(dice ==1) {
					System.out.println("1칸 전진");
				}
		if(dice == 1) {
			System.out.println("1칸 전진");
		}
		else {
			System.out.println("2칸 전진");
		}
		if(dice == 1) {
		}else if(dice ==2) {}
		else if(dice ==3) {}
		else if(dice ==4) {}
		else if(dice ==5) {}
		else if(dice ==6) {}
		//문법적으로 실행할 수 없다. 이거 중에 참이면 실행하겠다.
		if(dice == 1)
		{
		}else if(dice ==2) {}
		else if(dice ==3) {}
		else if(dice ==4) {}
		else if(dice ==5) {}
		else{}// 거짓이면 실행 
		
	//elsd if문은 1~6
	if(dice == 1) {} 
	else if(dice ==2) {}
	else if(dice ==3) {}
	else if(dice ==4) {}
	else if(dice ==5) {}
	else if(dice ==6) {}
	//차이는 문법적으로 하나만 실행되느냐? 여러개가 되느냐? 여러개가 실행될수 있다
	//여러번 물어볼 수 있다.
	//else if는 세트 여러개 실행되서 여러개 중에 하나만 실행
	//if문은 하나를 선택하면 밑에 문장도 실행되어 누적된다.
	if(dice == 1) {} 
	if(dice ==2) {}
	if(dice ==3) {}
	 if(dice ==4) {}// 실행할 경우 밑에 라인도 실해된다. 누적으로 다 실행된다.
	 if(dice ==5) {}
	if(dice ==6) {}	
	//참이어도 전체 다 실행된다. 밑에 비교한다. 여러개를 다 실행한다.
	//조건식이 복잡한 상태인 경우에는 부담이 커진다. 
	
	//switch문 and, or 연산을 처리, 그값과 같은가
	//특징이 있어서 전략을 쓰느냐에 따라서 
	if (dice > 0) {}
	if(dice > 0 && dice<=0) {}
	
	switch (dice) { // (dice값을 비교한다.
	case 1: //조건의 결과값이 필요업다. if(dise ==1)
		System.out.println("case1");
		System.out.println("case1");
		System.out.println("case1");
		break;//범위 안에서만 실행
	case 2: 
		System.out.println("case2");
		break;
	case 3: 
		System.out.println("case3");
		break;
	case 4: 
		System.out.println("case4");
		break;
	case 5: // 참이면 밑의까지 계속 실행한다.
		System.out.println("case5");
		break;
	case 6: 
		System.out.println("case6");
		break;//실행을 멈춘다
	default:// else에 해당
			System.out.println("default");
			//break; 뒤에 없어서 걸어줄 필요가 없다.
			
			//---------------------------
			/* 출근시간 일
			 * 8시	청소
			 * 9시	회의
			 * 10시	업무
			 * 11시	외근
			 * if,if else, switch
			 */
			int showTime = 8; //출근시간
			
			//if(showTime<=11){} 범위를 지정할 때 비교를 할 것을 생각해야한다.
			//아니면 if(점수>=0 && 점수<= 60)
			if(showTime <=8) { //하나만 실행
				System.out.println("청소");
				System.out.println("회의");
				System.out.println("업무");
				System.out.println("외근");
//			}else if (showTime <=9) {
//				* 9시	회의
//				 * 10시	업무
//				 * 11시	외근
//			}else if (showTime <=10) {
//				 * 10시	업무
//				 * 11시	외근
//			}else if (showTime <=11) {
//				* 11시	외근
//			}
				//else
				//if만 가지고도 가능
				if(showTime <=8){
					//청소
				}
				if(showTime <=8) {
					//회의
				}
				if(showTime <=10) {
					//업무
				}
				if(showTime <=8) {
					//외근
				}
				
				switch(showTime) {
				case 8:
				//청소
				case 9:
				//회의
				case 10:
				//업무
				case 11:
				//외근
				//default
				}
				switch(showTime) {
				case 8:
				//청소
				//회의
//업무
//외근
					break;
				case 9:
				//회의
//업무
//외근
					break;
				case 10:
				//업무
//					 외근
					break;
				case 11:
				//외근
					break;
				//default
				}
				}
		}
			
	}
	}

//}
