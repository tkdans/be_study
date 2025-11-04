package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int point1 = scanner.nextInt();
		System.out.print("수학점수 : ");
		int point2 = scanner.nextInt();
		System.out.print("영어점수 : ");
		int point3 = scanner.nextInt();
		
		int average = point1 + point2+ point3 /3;
		if(average > 60 ) {
			if(point1 > 40) {
				System.out.println("합격입니다.");
			}else if(point2 > 40 ) {
				System.out.println("합격입니다.");
			}else if(point3 > 40) {
				System.out.println("합격입니다.");
			}
		}else {
			System.out.println();
		}
				}
	}


