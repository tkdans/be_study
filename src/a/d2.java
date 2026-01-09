package a;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		SoundMachin machin = new SoundMachin();	
		
		myDog.sound();
		myCat.sound();
		
	}

	class Animal {
		void sound() {
			System.out.println("동물이 소리를 낸다.");
		}String getAnimalName(){
			return "동물";
		};
	}
	class Dog extends Animal{
		public void sound() {
			System.out.println("멍멍");
			
		}
		String getAnimalName() {
			return "강아지";
		};
	}
	class Cat extends Animal{
		public void sound() {
			System.out.println("야옹야옹");
		}
		String getAnimalName() {
			return "고양이";
	}
	}
	class SoundMachin{
		public void sound(Animal animal ) {
			System.out.println(animal.getAnimalName());
			
			animal.sound();
			System.out.println();
		}
	}
	}

