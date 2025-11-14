package be_study.quiz26;

public class Circle {
//	double radius;
//	double base;
//	double height; 
//	Circle(){}
//	Circle(double radius,double base,double height){
//		this.radius =radius;
//		this.base = base;
//		this.height = height;
		
//	}
	int radius;
	
    void setRadius(int radius) {
		this.radius = radius;
	}
	double getArea() {//넓이 
		double area = radius*radius*3.14;
		return area;
	}
	
//	
}
