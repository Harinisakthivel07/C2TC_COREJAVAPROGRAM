package com.tnsif.entityassignment;

public class ProductDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Product p1 = new Product();
        p1.setProductId(111);
        p1.setProductName("HP LAPTOP");
        p1.setPrice(50000);

        
        Product p2 = new Product();
        p2.setProductId(222);
        p2.setProductName("DELL LAPTOP");
        p2.setPrice(45000);

  
        Product p3 = new Product();
        p3.setProductId(333);
        p3.setProductName("LENOVO LAPTOP");
        p3.setPrice(40000);

        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);



	


	}

}
