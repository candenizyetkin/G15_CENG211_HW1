import java.util.Random;

public class TransactionManagement {
	
	private Product[] productArray;
	private int [] idNumber;
	private Transaction[][] transaction= new Transaction[100][15];
	public TransactionManagement(int[] idNumber,Product[] productArray ){
	
		this.idNumber=idNumber;
			this.productArray=productArray;
		}
		
		
		public void randomProductAssigner() {
			int transactionId=0;
			 
			for(int i=0 ;i<100;i++) {
				 for(int z=0;z<15;z++) {
					 Product[] selectedProduct=new Product[3];
					 
					 int k =0;
					 	while(selectedProduct[2]==null) {
					  Random random = new Random();
					 int randomIndex = random.nextInt(idNumber.length);
					 			for(int j=0; j<productArray.length;j++) {
					 				if(randomIndex==productArray[j].id) {
					 					selectedProduct[k]=productArray[j];
					 					k++;
					 					transactionId++;
					 				}else {}
					 				
					 				
					 		
				
				
				 }   	
					  }double totalPrice=selectedProduct[0].price*selectedProduct[0].quantity +
							  selectedProduct[1].price*selectedProduct[1].quantity+
							  selectedProduct[2].price*selectedProduct[2].quantity;
							  Transaction transactionInTwoDimantionalArray = new Transaction(transactionId,selectedProduct,totalPrice,5);
					 				transaction[i][z]= transactionInTwoDimantionalArray;
					 				System.out.println( transaction[i][z].products[0].price + " " +  transaction[i][z].products[0].quantity + " " +
					 			transaction[i][z].products[1].price + " " +  transaction[i][z].products[1].quantity+ " "+
					 						transaction[i][z].products[2].price + " " +  transaction[i][z].products[2].quantity+ " " +transaction[i][z].totalPrice);
				
				 }
			 
			}
		             
		        }
		
			 
//		public void tostring() {System.out.println(transaction[1][1]);}
		
}
		
		
		

