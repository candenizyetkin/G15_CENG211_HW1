import java.util.Random;

public class TransactionManagement {
	private ShopAssistant[] shopassistant;
	private Product[] productArray;
	private int [] idNumber;
	private Transaction[][] transaction;
	public TransactionManagement(int[] idNumber,Product[] productArray,ShopAssistant[]shopassistant ){
	
		this.idNumber=idNumber;
			this.productArray=productArray;
			this.shopassistant=shopassistant;
			
		}
		
		
		public Transaction[][] randomProductAssigner(int productNumber,int transactionNumber) {
			transaction= new Transaction[shopassistant.length][transactionNumber];
			
			int transactionId=0;
			 
			for(int i=0 ;i<shopassistant.length;i++) {
				 for(int z=0;z<transactionNumber;z++) {
					 Product[] selectedProduct=new Product[productNumber];
					 
					 int k =0;
					 	while(selectedProduct[productNumber-1]==null) {
					  Random random = new Random();
					 int randomIndex = random.nextInt(idNumber.length);
					 			for(int j=0; j<productArray.length;j++) {
					 				if(randomIndex==productArray[j].id) {
					 					selectedProduct[k]=productArray[j];
					 					k++;
					 					transactionId++;
					 				}else {}
					 				
					 				
					 		
				
				
				 }   	
					  }double totalPrice=0;
					 	for(int j =0; j<productNumber;j++) {
					 		totalPrice+=selectedProduct[j].getPrice()*selectedProduct[j].getQuantity() ;
							 // selectedProduct[1].price*selectedProduct[1].quantity+
							  //selectedProduct[2].price*selectedProduct[2].quantity;
					 		}
					  double fee;
					  if(totalPrice<=499) {
						  fee=totalPrice*0.01;
					  }else if(totalPrice<=799) {
						  fee=totalPrice*0.03;
					  }else if(totalPrice<=999) {
						  fee=totalPrice*0.05;
					  }else {fee=totalPrice*0.09;}
							  Transaction transactionInTwoDimantionalArray = new Transaction(transactionId,selectedProduct,totalPrice,fee);
					 				transaction[i][z]= transactionInTwoDimantionalArray;
					 				//System.out.println( "fee  "+transaction[i][z].transactionFee+"  totalprice"+ transaction[i][z].totalPrice+ " transaction[i][z].products[1].price "+ transaction[i][z].products[1].price + " transaction[i][z].products[1].quantity " +  transaction[i][z].products[1].quantity+" "+transaction[i][z].products[2].price + " transaction[i][z].products[2].quantity " +  transaction[i][z].products[2].quantity);
									 		//				transaction[i][z].products[2].price + " " +  transaction[i][z].products[2].quantity+ " " +transaction[i][z].totalPrice );
					 	//		transaction[i][z].products[1].price + " " +  transaction[i][z].products[1].quantity+ " "+
					 		//				transaction[i][z].products[2].price + " " +  transaction[i][z].products[2].quantity+ " " +transaction[i][z].totalPrice);
				
				 }
				 
			}SalaryManagement a =new SalaryManagement(	shopassistant,transaction);
			a.totalSalaryForAssistants(	shopassistant,transaction);


			//for(int i=0 ;i<100;i++) {
		  //           System.out.println(" "+shopassistant[i].totalSalary);
			//}
		       
		return transaction;}
	
			 

		
}
		
		
		

