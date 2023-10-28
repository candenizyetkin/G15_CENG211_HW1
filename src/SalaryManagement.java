
public class SalaryManagement {
 
 double comission;
 double totalSalary;
 public ShopAssistant[] assist;
 public Transaction[][] temp;
 SalaryManagement(ShopAssistant[] assist,Transaction[][] temp){
	 this.assist=assist;
	 this.temp=temp;
	
	 
 }
 
 public void totalSalesForEachAssistant(ShopAssistant[] assist,Transaction[][] temp) {
	    
	 	for (int i=0 ;i<assist.length;i++) {
	 		double totalSalesofEachAssistant = 0;
	    	for (int z=0;z<temp[1].length;z++) {
	    		totalSalesofEachAssistant = totalSalesofEachAssistant + temp[i][z].totalPrice;
	    	
	    	}if(totalSalesofEachAssistant > 7500){
    			comission = totalSalesofEachAssistant*0.03;
    			assist[i].comission=comission;
    			
    					
    	}
	    	else {
    		    comission = totalSalesofEachAssistant*0.01;
    		    assist[i].comission=comission;
    		    
    		    
    	}
  }}
	 
 public void totalSalaryForAssistants(ShopAssistant[] assist,Transaction[][] temp){

	 		totalSalesForEachAssistant(assist,temp);
	 		for (int i=0 ;i<100;i++) {
	 			totalSalary=assist[i].comission + 4* assist[i].weeklySallary();
	//	asist[i].totalSalary=totalSalary;
	 			assist[i].totalSalary=totalSalary;
	} 	
 
 }

}
