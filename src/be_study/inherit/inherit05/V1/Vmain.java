package be_study.inherit.inherit05.V1;

import java.util.ArrayList;
import java.util.List;

public class Vmain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		DustCleaner dc1 = new DustCleaner() ;
//		DustCleaner dc1 = new DustCleaner() ;
//		DustCleaner dc1 = new DustCleaner() ;
//		DustCleaner dc1 = new DustCleaner() ;
		DustCleaner[] dc1 = new DustCleaner[3] ;
		dc1[0]=new DustCleaner();
		dc1[1]=new DustCleaner();
		dc1[2]=new DustCleaner();
		
		List<WindowCleaner> windoeList = new ArrayList<WindowCleaner>();
		windoeList.add(new WindowCleaner());
		windoeList.add(new WindowCleaner());
		windoeList.add(new WindowCleaner());
		
		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		for(int i= 0; i<dc1.length; i ++) {
			dc1[i].removeDust();
		}
		for(int i= 0; i<windoeList.size(); i ++) {
			windoeList.get(i).washWindow();
		}
		for(int i = 0; i<floorList.size(); i++) {
			floorList.get(i).cleanFloor();
		}
	}

}
