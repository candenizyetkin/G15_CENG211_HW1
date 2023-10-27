
public class Query {
	ShopAssistant[] shopAssistant;
	Transaction[][]	transaction;
	Query(ShopAssistant[] shopAssistant,Transaction[][] transaction){
		this.shopAssistant=shopAssistant;
		this.transaction=transaction;
	}
	public double highestTotalPrice(){}
	public String mostExpensiveProductInTheLowestPriceTransaction(){}
	public double lowestTransactionFee(){}
	public String highestSalaryShopAssistant(){}
	public double totalRevenue(){}
	public double totalProfit(){}
}
