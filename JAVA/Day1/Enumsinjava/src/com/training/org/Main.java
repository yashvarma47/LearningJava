package com.training.org;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
class Test {
	Size pizzaSize;
	public Test(Size pizzaSi) {
		this.pizzaSize = pizzaSi;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}




class Main {
	public static void main(String[] args) {
		Test t1 = new Test(Size.MEDIUM);
		t1.orderPizza();
	}
}