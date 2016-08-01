package lecture11;

public class productUse {
	
	private static int fact(int n){
		return 1;
	}

	public static void main(String[] args) {
		
		product p = new product();								//first product p
//		p.numProducts = 100;
		product.numProducts = 100;								//accessing static by class name
		p.name = "Laptop";
		p.price = 80000;
		System.out.println("Laptop: " + p.price + " " + p.name + " "  + product.numProducts);
		
		product p2 = new product();								//second product p2
		p2.name = "Smartphones";
		p2.price = 50000;
		product.numProducts = 99;
		System.out.println("Smartphone: " + p2.price + " " + p2.name + " "  + product.numProducts);
		
	}

}
