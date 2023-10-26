import java.util.Random;
public class TransactionManagement {
	
	private Product[] productArray =FileIO.readProductData(null)
	private int [] idNumber;
		TransactionManagement(int[] idNumber,Product[] productArray ){
			this.productArray=productArray;
		}
		
		
		public void randomProductAssigner() {
			 Random random = new Random();
			 int numberOfElementsToSelect = 100;
			 
			 
			 for (int i = 0; i < numberOfElementsToSelect; i++) {
				 Product[] selectedProduct = new Product[numberOfElementsToSelect];
				 int j=0;
		            int randomIndex = random.nextInt(idNumber.length);
		            int selectedProductId = idNumber[randomIndex];
		            while(selectedProduct[3]==null) {
		            if(productArray[i].id==selectedProductId) {
		            selectedProduct[j]=productArray[i];
		            }}
		            Transaction transaction = new Transaction(3,selectedProductId,4,5);
		            selectedTransactions[i] = transaction;
		        }
			 
		}
		
		public void randomProductAssigner() {
			
		}
		
		public Product productIdMatch(){
			
			for (int i = 0; i < )
			
		}
		
		
		
}
