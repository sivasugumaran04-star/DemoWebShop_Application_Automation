package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;

import utilities.BaseClass;

public class AddToCart extends BaseClass {

	@Test
	public void addTocart() {
	AddToCartPage ap=new AddToCartPage(driver);
	ap.addtocart("siva","siva@gmail.com");
	}
	
	@Test
    public void updateProduct() {
    	AddToCartPage ap=new AddToCartPage(driver);
    	ap.updateProduct("5");
	}
	@Test
	public void removeProduct() {
		AddToCartPage ap=new AddToCartPage(driver);
		ap.removeProduct();
	}
	
}
