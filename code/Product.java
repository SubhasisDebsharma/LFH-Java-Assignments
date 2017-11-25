class Product{
	int productId, productPrice;
	String productName, productType;
	
	void displayProductDetails(){
		System.out.println("Product ID: "+String.valueOf(productId));
		System.out.println("Product Name: "+String.valueOf(productName));
		System.out.println("Product Type: "+String.valueOf(productType));
		System.out.println("Product Price: "+String.valueOf(productPrice));
	} 
}

class ProductTest{
	public static void main(String args[]){
		Product p = new Product();
		p.productId = 1001;
		p.productName = "Bat";
		p.productType = "Sports";
		p.productPrice = 2500;
		p.displayProductDetails();
	}
}
