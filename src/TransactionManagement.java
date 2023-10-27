import java.util.Random;

public class TransactionManagement {
	private ShopAssistant[] shopassistant;
	private Product[] productArray;
	private int [] idNumber;
	private Transaction[][] transaction= new Transaction[100][15];
	public TransactionManagement(int[] idNumber,Product[] productArray,ShopAssistant[]shopassistant ){
	
		this.idNumber=idNumber;
			this.productArray=productArray;
			this.shopassistant=shopassistant;
		}
		
		
		public void randomProductAssigner() {
			FileIO.readProductData("C:\\Users\\genyu\\Documents\\GitHub\\G15_CENG211_HW1\\src\\products.csv");
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
					 				//System.out.println( transaction[i][z].transactionFee+" weferg"+ transaction[i][z].totalPrice );
					 			//transaction[i][z].products[1].price + " " +  transaction[i][z].products[1].quantity+ " "+
					 			//			transaction[i][z].products[2].price + " " +  transaction[i][z].products[2].quantity+ " " +transaction[i][z].totalPrice);
				
				 }
				 
			}SalaryManagement a =new SalaryManagement(	shopassistant,transaction);
			a.totalSalaryForAssistants(	shopassistant,transaction);
			Query show= new Query(shopassistant,transaction);
			
			show.displayer();
			for(int i=0 ;i<100;i++) {
		             System.out.println(" "+shopassistant[i].totalSalary);
			}
		        }
	
			 

		
}
		
		
		

