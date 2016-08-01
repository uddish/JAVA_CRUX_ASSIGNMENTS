package lecture12;

public class Product implements Comparable<Product>{
	int ID;
	int price;
		
	public boolean isGreater(Product p) {
		if(this.price > p.price) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
