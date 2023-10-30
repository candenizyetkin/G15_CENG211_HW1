
public class Transaction {
	
	private int id;
	public Product[] products;
	private double totalPrice;
	private double transactionFee;
	
	Transaction(int id,Product[] products, double totalPrice, double transactionFee){
		this.id = id;
		this.products =  products;
		this.totalPrice = totalPrice;

		this.transactionFee = transactionFee;
		}
	
	

	public String toString(){
			
	        return id+","+products+","+totalPrice+","+transactionFee;
	    }
	
	public double getTotalPrice() {
		  return totalPrice;
	  }
	  
	  public void setTotalPrice(double totalPrice) {
		  this.totalPrice= totalPrice;
	  }
	  
	  public double getTransactionFee() {
		  return transactionFee;
	  }
	  
	  public void setTransactionFee(double transactionFee) {
		  this.transactionFee= transactionFee;
	  }
	}


