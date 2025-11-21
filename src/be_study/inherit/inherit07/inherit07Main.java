package be_study.inherit.inherit07;

import java.util.concurrent.Flow.Publisher;

public class inherit07Main {

	public static void main(String[] args) {
		//Obfect 객체
		
		
		Drive d = new Drive();
		Taxi t = new Taxi();
		Bus b = new Bus();
		System.out.println(d.toString());
		System.out.println(t.toString());
		System.out.println(b.toString());
		
		d.diveBus(b);
		d.diveTaxi(t);

		Vehicle v1 = new Taxi();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Vehicle();

		d.drive(v1);
		d.drive(v2);
		d.drive(v3);
		System.out.println("Vehicle 매개변수에 택시 버스를 전달 가능");
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		d.drive(t1);
		d.drive(b1);

		Taxi t2 = takeTaxi();
		Bus b2 = takeBus();
		Vehicle v10 = takeTaxi();
		Vehicle v11 = takeBus();
		
//		Bus b10 =  takeBus2(); 
		Vehicle v12 =  takeBus2();
		if(v12 instanceof Bus) {
		Bus b10 =  (Bus)v12;
		}
		// Bus b= v  XXX
		
	}

	public static Taxi takeTaxi() {
		return new Taxi();
	}

	public static Bus takeBus() {
		return new Bus();

	}
	public static Vehicle takeBus2() {
		return new Bus();
		
	}
}
