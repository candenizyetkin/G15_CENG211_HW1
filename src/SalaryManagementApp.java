
public class SalaryManagementApp {

	public static void main(String[] args) {
		
		 Product[] productArray = FileIO.readProductData("src\\products.csv");
		 ShopAssistant[] shopAssistantArray= FileIO.readShopAssistantData("src\\shopAssistants.csv");
		 TransactionManagement app = new TransactionManagement(FileIO.IdCounter("src\\products.csv"),productArray, shopAssistantArray);
		 Query showapp= new Query(shopAssistantArray, app.randomProductAssigner(3,15));
		 showapp.displayer();
		
	
		

		
	}

	
  
}
