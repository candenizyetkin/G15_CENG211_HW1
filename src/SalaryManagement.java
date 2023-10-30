
public class SalaryManagement {
 
 double comission;
 double totalSalary;
 public ShopAssistant[] shopAssistantArray;
 public Transaction[][] transaction;
 SalaryManagement(ShopAssistant[] shopAssistantArray,Transaction[][] transaction){
	 this.shopAssistantArray=shopAssistantArray;
	 this.transaction=transaction;
	
	 
 }
 
 public void totalSalesForEachAssistant(ShopAssistant[] shopAssistantArray,Transaction[][] transaction) {
	    
	 	for (int i=0 ;i<shopAssistantArray.length;i++) {
	 		double totalSalesofEachAssistant = 0;
	    	for (int z=0;z<transaction[1].length;z++) {
	    		totalSalesofEachAssistant = totalSalesofEachAssistant + transaction[i][z].getTotalPrice();
	    	
	    	}if(totalSalesofEachAssistant > 7500){
    			comission = totalSalesofEachAssistant*0.03;
    			shopAssistantArray[i].setComission(comission);
    			
    					
    	}
	    	else {
    		    comission = totalSalesofEachAssistant*0.01;
    		    shopAssistantArray[i].setComission(comission);
    		    
    		    
    	}
  }}
	 
 public void totalSalaryForAssistants(ShopAssistant[] shopAssistantArray,Transaction[][] transaction){

	 		totalSalesForEachAssistant(shopAssistantArray,transaction);
	 		for (int i=0 ;i<100;i++) {
	 			totalSalary=shopAssistantArray[i].getComission() + 4* shopAssistantArray[i].weeklySallary();
	 			shopAssistantArray[i].setTotalSalary(totalSalary);
	} 	
 
 }

}
