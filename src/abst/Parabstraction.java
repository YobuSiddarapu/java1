package abst;

public class Parabstraction extends Family {

	@Override
	public void parent() {
		System.out.println("parent name is joseeph");
	}

	@Override
	public void child() {
		System.out.println("child name is patrik");
	}

	@Override
	public void grandchild() {
		System.out.println("grandchild name is uday");
	}

	@Override
	public void grandparent() {
		System.out.println("grandparent name is john");
	}
public static void main(String[] args) {
	Parabstraction pa=new Parabstraction();
	pa.child();
	pa.grandparent();
	pa.grandchild();
	pa.parent();
}
}
