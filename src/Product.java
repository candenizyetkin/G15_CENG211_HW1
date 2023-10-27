
public class Product {
	
	 public int id;
	 String productName;
	 public  double price;
	 public  int quantity;
	 //We used an additional attribute to our Product constructor so we could easily calculate total price in transaction management class
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
