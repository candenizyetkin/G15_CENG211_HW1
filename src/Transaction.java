
public class Transaction {
	
	private int id;
	private String[] products;
	private double totalPrice;
	private double transactionFee;
	
	Transaction(int id,String[] products, double totalPrice, double transactionFee){
		this.id = id;
		this.products = new String[3];
		this.totalPrice = totalPrice;

		this.transactionFee = transactionFee;
		}
	 public String toString(){
			
	        return id+","+products+","+totalPrice+","+transactionFee;
	    }
	}


