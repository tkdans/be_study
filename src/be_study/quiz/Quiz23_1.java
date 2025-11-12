package be_study.quiz;

import java.util.Scanner;

public class Quiz23_1 {

	public static void main(String[] args) {
		/* 엘리베이터

스마트 엘리베이터 시스템을 제작하려고 합니다.
해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )

- 기본 문제
1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)

+ 탑승 인원을 입력받습니다.
+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다 
(* 입력된 층은 중복되지 않게 입력이 된다고 가정예시)
[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
)
*/
		
		Scanner scanner = new Scanner(System.in);
		//탑승인원입력
		//탑승인원만큼 층수를 입력받고
		//엘리베이터의 층수가 변경될 때마다 현재층수를 출력한다.
		
		System.out.print("탑승 인원을 입력받습니다. : ");
		int person = scanner.nextInt(); //여기에 저장
		 
		//입력을 받는 범위는 person만큼이다. 
		int[] floor = new int[person];//탑승 인원 수만큼 내릴 층을 저장할 고정된 크기의 배열 생성,
		//탑승인원 수만큼 내릴 층수를 입력 받고 배열에 저장(반복문 사용)
			
			for(int i =0; i<person; i++) {
				System.out.print("승객 " + (i + 1) + " 내릴 층 입력: ");
	            int floor1 = scanner.nextInt();
	            floor[i] = floor1;
			}
			System.out.println("\n=== 엘리베이터 운행 시작 (1층 출발) ===");

	        // 3. 엘리베이터 운행 및 현재 층수 출력 (반복문 및 조건문 사용)
	        // 엘리베이터는 1층에서 100층까지 오로지 한 방향으로만 운행
			//1lv : 1->100->1
			//2lv : 1-> 입력한 층수 중에 최고층까지만 갔다가-->
			//destFloorArr에서 
			//
			//
	        for (int currentFloor = 1; currentFloor <= 100; currentFloor++) {
	            System.out.println("현재 층수: " + currentFloor + "층");

	            // 현재 층에 내릴 승객이 있는지 확인하기 위해 배열을 순회
	            
	            for (int j = 0; j < floor.length; j++) {
	                // 조건문: 배열에 저장된 목적지 층과 현재 층이 일치하는지 확인
	                if (floor[j] == currentFloor) {
	                    System.out.println(">> " + currentFloor + "층에서 승객이 하차했습니다.");
	                    // 하차한 승객의 목적지 층 정보를 무효화 (예: 0 또는 -1 등으로 설정)
	                    // 이미 내린 승객을 다시 체크하지 않기 위함
	                    floor[j] = -1; 
	                }
	            }
	        }
	        for (int k = 100; k >= 1; k--) {
	            System.out.println("현재 층수: " + k + "층");
	        }
	       //진행 방향을 별도의 변수로 처리
	        /*int floorW = 1; //현재 층수
	        boolean isUp = true;// flog 역활 true 올라가는 방향 / false 내려가는 방향
	        
	        while(true) {
	        	System.out.println(floor+"층");
	        	floorW++;
	        	//내릴 층인가?
	        	if(floorW >=100) {
	        		isUp = false;
	        	}
	        	if(floorW<=1 && isUp ==false) {// 내려오는 방향으로 1층일때 끝
	        		break;
	        	}
	        	if(isUp)// isUp true -->올라가는 중++1
	        	floorW++;//1-->100 ++
	        	else
	        	floorW--;//1-->100 ---1
	        }*/

	        int floorW = 1; //현재 층수
	        int flow = 1; // flog 역활 true 올라가는 방향 / false 내려가는 방향
	        //flow : 1 -1 층이 변하는 연산에 값으로 참여 (층의 진행 방향을의미)
	        while(true) {
	        	System.out.println(floor+"층");
	        	floorW++;
	        	//내릴 층인가?
	        	if(floorW >=100) {
	        		flow=-1;
	        	}
	        	if(floorW<=1 && flow ==-1) {// 내려오는 방향으로 1층일때 끝
	        		break;
	        	}
	        	
	        	floorW += flow;//1-->100 ---1
	        }
	        // 4. 운행 종료 메시지
	        System.out.println("=== 엘리베이터 100층 도착 및 운행 종료 ===");
	        System.out.println("엘리베이터가 1층으로 복귀합니다.");

//	        scanner.close(); // 스캐너 리소스 반환
	        
	        System.out.println("엘리베이터가 멈출 수 있는 최대 횟수");
	        int num = scanner.nextInt();
//	        int[] floor3 = new int [];
//	        for(int i =0; i<; i++) {
//				System.out.print("승객 " + (i + 1) + " 내릴 층 입력: ");
//	            int floor4 = scanner.nextInt();
//	            floor3[i] = floor4;
	        System.out.print("탑승 인원을 입력받습니다. : ");
			int person1 = scanner.nextInt();
			int[] floor3 = new int[person1];
			for(int i =0; i<person1; i++) {
				System.out.print("승객 " + (i + 1) + " 내릴 층 입력: ");
	            int floor4 = scanner.nextInt();
	            floor3[i] = floor4;
			
//			}
	    }
		}}


	
