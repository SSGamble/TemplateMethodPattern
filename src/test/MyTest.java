package test;

import service.ClothesShopping;
import service.ShoesShopping;
import service.Shopping;

public class MyTest {
	public static void main(String[] args) {
		Shopping shoesShopping = new ShoesShopping();
		shoesShopping.buyGoods();
		System.out.println("-----------------------");
		Shopping clothesShopping = new ClothesShopping();
		clothesShopping.buyGoods();
	}
}
