package abst;

public class Abstraction implements Bank {

	@Override
	public void saving() {
		System.out.println("saving is 15%");
	}

	@Override
	public void current() {
		System.out.println("current is 26%");
	}

	@Override
	public void deposite() {
		System.out.println("deposite is 40%");
	}
public static void main(String[] args) {
	Abstraction ab=new Abstraction();
	ab.current();
	ab.deposite();
	ab.saving();
}
}
