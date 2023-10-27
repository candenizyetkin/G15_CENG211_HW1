
public class Transaction {
	
	private int id;
	public Product[] products;
	public double totalPrice;
	public double transactionFee;
	
	Transaction(int id,Product[] products, double totalPrice, double transactionFee){
		this.id = id;
		this.products =  products;
		this.totalPrice = totalPrice;

		this.transactionFee = transactionFee;
		}
	
	

	public String toString(){
			
	        return id+","+products+","+totalPrice+","+transactionFee;
	    }
	}


