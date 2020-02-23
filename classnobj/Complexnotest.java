package com.classnobj;

class Complexno {

	private int real, img;

	public Complexno(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public Complexno add(Complexno n) {

		int realsum = this.real + n.real;
		int imgsum = this.img + n.img;

		Complexno result = new Complexno(realsum, imgsum);
		return result;
	}

	public int getReal() {
		return this.real;
	}

	public int getImg() {
		return this.img;
	}

	public String toString() {
		return this.getReal() + "+" + this.getImg() + "i";

	}

}

class Complexnotest {
	public static void main(String args[]) {
		Complexno C1 = new Complexno(10, 15);
		Complexno C2 = new Complexno(11, 16);
		Complexno result = C2.add(C1);

		System.out.println("Result =" + result);

	}
}