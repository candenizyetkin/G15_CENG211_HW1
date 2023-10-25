
public class Product {
	
	 private int id;
	 private String productName;
	 private int price;
	 
	 Product(int id, String productName, int price){
		 this.id = id;
		 this.productName = productName;
		 this.price = price;
	 }
	 
	  public String toString(){
			
	        return id+","+productName+","+price;
	    }
}
