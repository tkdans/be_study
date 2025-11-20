package be_study.cls12;

import java.util.ArrayList;

public class ClassRoom {

	//필드
	int floor; //몇층
	int roomNumber; //몇호실이냐 몇번교실
	double area; //30평 85.7m2
	boolean hasWhiteBoard;//화이트보드 존재 여부
	
//	String whiteboard;// 문자열로 엄청큰 
//	화이트 보드의 대한 정보를 객체단위로 부품화 하여 쓴다
	WhiteBoard whiteBoard; 
	AirCon airCon;
//	Desk [] deskArr;
	ArrayList<Desk> deskList;// 동적배열의 리스트로 여러개의 책상을 만들 수 있다.
	//	Desk desk;//책상이 하나있다.
//	Desk desk2;
//	Desk desk3;
//	Desk desk4;
//	똑같이 타입이 여러개 있다.

	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		airCon = null;
		deskList = null;
		}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor=floor;
		this.roomNumber= roomNumber;
	}
	public ClassRoom(WhiteBoard whiteBoard, AirCon airCon) {
		this.whiteBoard = whiteBoard;
		this.airCon = airCon;
		this.deskList = new ArrayList<Desk>();
	}
	
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	public void setDeskList(ArrayList<Desk> d) {
		this.deskList = d;
	}
	public void addDesk(Desk desk) {
		deskList.add(desk);
	}
}
