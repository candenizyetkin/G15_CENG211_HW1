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
					 				} 	
					 				Transaction forArray = new Transaction(transactionId,selectedProduct,5,5);
					 				transaction[i][z]= forArray;
					 		
				
				
				 }   	
					  }System.out.println(transaction[i][z].products[0]);
				
				 }
			 
			}
		             
		        }
			 
//		public void tostring() {System.out.println(transaction[1][1]);}
		
}
		
		
		

