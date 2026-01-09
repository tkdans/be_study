package a;
import java.util.Random;
public class d1 {

	public static void main(String[] args) {
		// 클래스의 다형성 , 상속, 사물이라 사물
//기본 개념은 '실제 세계는 사물(객체)로 이루어져 있으며, 
		//발생하는 모든 사건들은 사물간의 상호작용이다
		//클래스 -> 인스턴스화 -> 인스턴스(객체)
		
		class Animal{
			void sound() {
				System.out.print("....");
				
			}
		}
		class dag extends Animal{
			void sound() {
				System.out.print("멍멍");
		
	}
		}
		CardPayment CardPayment = new CardPayment();
		CashPayment CashPayment = new CashPayment();
		
		}
}
	interface Payment{
		void pay(int amount);
	}
	class CardPayment implements Payment{
		//카드번호 -랜점형 값을 출력
		//결제금액 -출력
		@Override
	    public void pay(int amount) {
			Random rendom = new Randdom();
			//a~b 
//			random.nextlnt(b)->0~b-1
//			random.nextlnt(b-a+1)+a -> 0~b
			int cardNumber = Random.nextlnt(100)+1;
			
	        // 카드번호를 랜덤으로 생성해서 출력
	        int
	        // 결제 금액 출력
	        System.out.println("결제금액: " + amount + "원");
		}
	}
	class CashPayment implements Payment{

	    public void pay(int amount) {
			System.out.println("결제금액: " + amount + "원");
		}
	}
	
}

