package sec01_theneedforgeneric.EX01_ProblemsBeforeGeneric;

class Apple {}
class Goods1 {
	private Apple apple;
	public Apple getApple() {
		return this.apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Pencil {}
class Goods2 {
	private Pencil pencil;
	public Pencil getPencil() {
		return this.pencil;
	}
	
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();

		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}
}
