package be_study.quiz26;

public class Triangle {

	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
			}
	double getArea() {
		return (double)width * height/ 2.0;
		//        int * int /int  = int
		// double 변수 = int값
	}
}
