
public class SalaryManagementApp {

	public static void main(String[] args) {
		FileIO.readProductData("C:\\Users\\genyu\\Documents\\GitHub\\G15_CENG211_HW1\\src\\products.csv");
		 FileIO.readShopAssistantData("C:\\Users\\genyu\\Downloads\\shopAssistants.csv");
		 TransactionManagement app = new TransactionManagement(FileIO.IdCounter("C:\\Users\\genyu\\Documents\\GitHub\\G15_CENG211_HW1\\src\\products.csv"),FileIO.readProductData("C:\\Users\\genyu\\Documents\\GitHub\\G15_CENG211_HW1\\src\\products.csv"));;
		 app.randomProductAssigner();
		 app.toString();
		 
	}

	

}
