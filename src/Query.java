
public class Query {
	ShopAssistant[] shopAssistant;
	Transaction[][]	transaction;
	Query(ShopAssistant[] shopAssistant,Transaction[][] transaction){
		this.shopAssistant=shopAssistant;
		this.transaction=transaction;
		mostExpensiveProductInTheLowestPriceTransaction();
		highestTotalPrice();
		lowestTransactionFee();
		highestSalaryShopAssistant();
		totalRevenue();
		totalProfit();
	}
	public void displayer() {
		 System.out.println("1) The most expensive product in the lowest price transaction is: "+mostExpensiveProductInTheLowestPriceTransaction());
		 System.out.println("2) The highest total price is: "+String.format("%.2f",highestTotalPrice()));
		 System.out.println("3) The lowest transaction fee is: "+String.format("%.2f",lowestTransactionFee()));
		 System.out.println(highestSalaryShopAssistant());
		 System.out.println(totalRevenue());
		 System.out.println(totalProfit());
	}
	public String mostExpensiveProductInTheLowestPriceTransaction(){
		int firstIndex=0;
		int secondIndex=0;
	
		int indexOfTheMostExpensiveProduct = 0;
		double min = transaction[0][0].totalPrice;
        for (int i=0 ;i<shopAssistant.length;i++) {
	    	for (int z=0;z<transaction[1].length;z++) {
	    		 
	    	if (transaction[i][z].totalPrice < min) {
	    	    firstIndex = i;
	    	    firstIndex = z;
	    	    
	        }else {}
	             
	    }

	} double max = transaction[firstIndex][secondIndex].products[0].price ;
			 for (int f=1; f<transaction[firstIndex][secondIndex].products.length; f++) {
				if (transaction[firstIndex][secondIndex].products[f].price > max) {
					max = transaction[firstIndex][secondIndex].products[f].price; 
					indexOfTheMostExpensiveProduct = f;
						
				}else {}
			 }
	  return transaction[firstIndex][secondIndex].products[indexOfTheMostExpensiveProduct].productName;	
}

	public double highestTotalPrice(){
       double max = transaction[0][0].totalPrice;
       	for (int i=0 ;i<shopAssistant.length;i++) {
	    	for (int z=0;z<transaction[1].length;z++) {
	    		
	    	if (transaction[i][z].totalPrice > max) {
	    	        max = transaction[i][z].totalPrice;
	    	} 
	    	else{}
	    
	    }
	}return max;}
	    	
		
	public double lowestTransactionFee(){
		double lowestFee=transaction[0][0].transactionFee;
		for(int i =0;i<shopAssistant.length;i++) {
			for(int j =0;j<transaction[1].length;j++) {
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
		for(int j=0 ;j <100;j++){
			if(maxSalary<shopAssistant[j].totalSalary) {
				asistantId=j;
				
			}
			else {}
			}
			return "4) ShopAssistant id: " + shopAssistant[asistantId].id+
					", name: "+ shopAssistant[asistantId].name + " " + shopAssistant[asistantId].surname+
					", seniority: " +shopAssistant[asistantId].seniority()+", weekly salary: "+
					String.format("%.2f", shopAssistant[asistantId].weeklySallary())+" commision: "+String.format("%.2f",shopAssistant[asistantId].comission)+
					", total salary: "+ String.format("%.2f", shopAssistant[asistantId].totalSalary);                        
			
			
		}
	
	public double totalRevenueValue(){
		double totalRevenueValue = 0;
	
		for (int i=0;i<shopAssistant.length;i++) {
			for (int j=0;j<transaction[1].length;j++) {
				totalRevenueValue+= (transaction[i][j].totalPrice+transaction[i][j].transactionFee);
			}
		}
		
	return totalRevenueValue;
	}
	
	public String totalRevenue(){
		double totalRevenueValue = 0;
	
		for (int i=0;i<shopAssistant.length;i++) {
			for (int j=0;j<transaction[1].length;j++) {
				totalRevenueValue+= (transaction[i][j].totalPrice+transaction[i][j].transactionFee);
			}
		}
		
	return "5) The total revenue that is earned from 1500 transactions: "+ String.format("%.2f",totalRevenueValue)   ;
	}
	
	public String totalProfit(){
		 double realTotalSalary = 0;
		for(int i =0;i<100;i++) {
			realTotalSalary += shopAssistant[i].totalSalary;
			
			
		}
		double totalProfit = totalRevenueValue()-realTotalSalary;
		
	return 		"6) The total profit that is earned after paying the shop assistant salaries is "+String.format("%.2f", totalProfit);
	}
}
