package com.junit;



class ComplexNumber {
	private int real;
	private int img;

	/*
	 * public Complex () {
	 * 
	 * }
	 */
	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public int getReal() {
		return this.real;
	}

	public int getImg() {
		return this.img;
	}

	@Override
	public String toString() {
		return this.getReal() + " + " + this.getImg() + "j";
	}

	public static ComplexNumber addComplex(ComplexNumber complex1, ComplexNumber complex2) {

		int real = complex1.real + complex2.real;
		int img = complex1.img + complex2.img;
		ComplexNumber result = new ComplexNumber(real, img);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		ComplexNumber comp = (ComplexNumber) obj;
		return Integer.compare(this.real, comp.real) == 0 && Integer.compare(this.img, comp.img) == 0;
	}

}