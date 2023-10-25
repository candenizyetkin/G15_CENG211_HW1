
public class SalaryManagementApp {

	public static void main(String[] args) {
		 
		ShopAssistant shopassistant = new ShopAssistant(45,"burak","yusuf",456);
		
		System.out.println(shopassistant.toString());

		Product products = new Product(32,"tu",67);
		
		System.out.println(products.toString());
		
		Transaction transaction = new Transaction(45,null,76,54);
		
		System.out.println(transaction.toString());
	}

}
