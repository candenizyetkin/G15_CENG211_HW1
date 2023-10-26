
public class Product {
	
	 public int id;
	 private String productName;
	 private double price;
	 
	 Product(int id, String productName, double price){
		 this.id = id;
		 this.productName = productName;
		 this.price = price;
	 }
	 
	  public String toString(){
			
	        return id+","+productName+","+price;
	    }
	  public void add() {
		  
	  }
}
