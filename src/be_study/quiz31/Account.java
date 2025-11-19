package be_study.quiz31;

public class Account {
	//필드
	private String owner; //소유주
	private long balance=10000; //잔액
	//메인
	public static void main(String[] args) {
		Account at = new Account();
		at.setOwner("김부자");
		at.setBalance(50000);
		
		Account a2 = new Account("정부자",30000);
				System.out.println("5000원 입금합니다.");
		System.out.println("입금 처리 후 잔액 : "+ a2.deposit(5000));
		System.out.println(at.deposit2(1000)+"원 입금");
		System.out.println(at.getBalance());
	}
	//생성자
	public Account() {
		owner = null;
		balance = 0;
	}
	public Account(String owner){
		this.owner =owner;
	}
	public Account(long balance){
		this.balance=balance;
	}
	public Account(String owner, long balance){
		this.owner =owner;
		this.balance= balance;
	}
	public Account(long balance, String owner){
	this.owner =owner;
	this.balance= balance;}
	//메소드 
	public long deposit(long amount) {//입금후 잔액
		balance += amount;	
		return balance;
		//기존잔액 : 3만원  입금 : 1만원
		// 입금 기능의 return을 뭐로 해줄거니?
		// 1) 입금한 금액 1만원
		// 2) 입금후 잔액 4만원
	}
	public long deposit2(long amount) {//입금액 출력
		balance += amount;	
		return balance;// 입금 처리된 금액 반환
		//기존잔액 : 3만원  입금 : 1만원
		// 입금 기능의 return을 뭐로 해줄거니?
		// 1) 입금한 금액 1만원
		// 2) 입금후 잔액 4만원
	}
	public long withdraw(long amount) {
		//balance 잔액 amount 출금하려는 금액
		
		
		if(amount>balance) {
			System.out.println("잔액이 부족합니다.");
			return balance;
			//잔액 return
			//출금 실패 -> return -99
			//클래스 객체 필드변수 (여러정보 전달)
			//출금성공, 실패, 잔액 얼마, 얼마출금
		}
		//잔액 >= amount
		//출금을 했으니까 내 잔고 중에
		balance -= amount;
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
