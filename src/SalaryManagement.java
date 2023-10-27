
public class SalaryManagement {
 double totalSalesofEachAssistant = 0;
 double comission;
 SalaryManagement(){}
 
 public void totalSalesForEachAssistant(Transaction[][] temp, ShopAssistant[] asist) {
	    
	 	for (int i=0 ;i<100;i++) {
	    	for (int z=0;z<15;z++) {
	    		totalSalesofEachAssistant = totalSalesofEachAssistant + temp[i][z].totalPrice;
	    	
	    	}if(totalSalesofEachAssistant > 7500){
    			comission = totalSalesofEachAssistant*0.03;
    			asist[i].comission=comission;
    			
    					
    	}
	    	else {
    		    comission = totalSalesofEachAssistant*0.01;
    		    asist[i].comission=comission;
    		    
    		    
    	}
  }
	 
 }

}
