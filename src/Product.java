
public class Product {
	
	 public int id;
	 String productName;
	 public  double price;
	 public  int quantity;
	 
	 Product(int id, String productName, double price, int quantity){
		 this.id = id;
		 this.productName = productName;
		 this.price = price;
		 this.quantity=quantity;
		 
	 }
	 
	  public String toString(){
			
	        return id+","+productName+","+price+ ", "+quantity;
	    }
	  public void add() {
		  
	  }
	 
}
