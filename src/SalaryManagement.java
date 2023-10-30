
public class SalaryManagement {
 
 double comission;
 double totalSalary;
 public ShopAssistant[] shopAssistant;
 public Transaction[][] transaction;
 SalaryManagement(ShopAssistant[] shopAssistant,Transaction[][] transaction){
	 this.shopAssistant = shopAssistant;
	 this.transaction = transaction;
	
	 
 }
 
 public void totalSalesForEachAssistant(ShopAssistant[] shopAssistant, Transaction[][] transaction) {
	    
	 	for (int i = 0 ;i<shopAssistant.length;i++) {
	 		double totalSalesofEachAssistant = 0;
	    	for (int z = 0;z<transaction[1].length; z++) {
	    		totalSalesofEachAssistant = totalSalesofEachAssistant + transaction[i][z].totalPrice;
	    	
	    	}if(totalSalesofEachAssistant > 7500){
    			comission = totalSalesofEachAssistant*0.03;
    			shopAssistant[i].comission=comission;	
    	    }
	    	else {
    		    comission = totalSalesofEachAssistant*0.01;
    		    shopAssistant[i].comission=comission;
    		    
    		    
    	}
  }}
	 
 public void totalSalaryForAssistants(ShopAssistant[] shopAssistant,Transaction[][] transaction){

	 		totalSalesForEachAssistant(shopAssistant,transaction);
	 		for (int i = 0 ;i<100;i++) {
	 			totalSalary = shopAssistant[i].comission + 4* shopAssistant[i].weeklySallary();
	 			shopAssistant[i].totalSalary=totalSalary;
  } 	
 }
}
