
public class Query {
	ShopAssistant[] shopAssistant;
	Transaction[][]	transaction;
	Query(ShopAssistant[] shopAssistant,Transaction[][] transaction){
		this.shopAssistant=shopAssistant;
		this.transaction=transaction;
	}
	public double highestTotalPrice(){}
	public String mostExpensiveProductInTheLowestPriceTransaction(){}
	public double lowestTransactionFee(){
		double lowestFee=transaction[0][0].transactionFee;
		for(int i =0;i<100;i++) {
			for(int j =0;j<15;j++) {
				if(lowestFee>transaction[i][j].transactionFee) {
					lowestFee=transaction[i][j].transactionFee;
					
				}else {}
				}
		}
		return lowestFee;
	}
	public String highestSalaryShopAssistant(){
		double maxSalary=shopAssistant[0].totalSalary;
		int asistantId=0;
		for(int i;i<100;i++) {
			if(maxSalary<shopAssistant[i].totalSalary) {
				asistantId=i;
				
			}else {}
			
			
		}
	}
	public double totalRevenue(){}
	public double totalProfit(){}
}
