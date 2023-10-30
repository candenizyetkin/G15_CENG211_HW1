
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
			
	        return "Transaction id: "+id+", product1: "+products[0]+","+" product2: "+products[1]+","+" product3: "+products[0]+", total price: "+totalPrice+", transaction fee: "+String.format("%.2f", transactionFee);
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


