
public class Transaction {
	
	private int id;
	private Product[] products;
	private float totalPrice;
	private float transactionFee;
	
	Transaction(int id,Product[] products, float totalPrice, float transactionFee){
		this.id = id;
		this.products =  products;
		this.totalPrice = totalPrice;

		this.transactionFee = transactionFee;
		}
	
	

	public String toString(){
			
	        return id+","+products+","+totalPrice+","+transactionFee;
	    }
	}


