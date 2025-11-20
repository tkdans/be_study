package be_study.quiz.quiz35;

public class Kitchen {
	// 필드
	Icebox Icebox;
	Sink Sink;
	
	GasRange GasRange;
	Cup Cup;
	WasteBasket WasteBasket;
	KitchenSize KitchenSize;

	// 생성자
	public Kitchen() {

	}

	public Kitchen(KitchenSize KitchenSize) {
		this.KitchenSize = KitchenSize;
	}

	public Kitchen(Icebox Icebox, Sink Sink, GasRange GasRange) {
		this.Icebox = Icebox;
		this.Sink = Sink;
		this.GasRange = GasRange;
	}
	public void setWasteBasket()
	
}
