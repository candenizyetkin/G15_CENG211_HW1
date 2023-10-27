import java.util.Random;
public class ShopAssistant {

 private int id;
 private String name;
 private String surname;
 private int phoneNumber;
 public double comission;
 public double totalSalary;

	ShopAssistant(int id, String name, String surname, int phoneNumber ){
		
		this.id = id;
		this.name = name; 
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.totalSalary=totalSalary;
		
		
	}

		
	
	public int seniority(){
		Random random = new Random();

        int seniority  = random.nextInt(16);
		
		return seniority;}  
	
	public double weeklySallary() {
		if(seniority()<=1) {
			return 1500;
		}
		else if(seniority()<=3) {
			return 2000;
		}
		else if(seniority()<=5) {
			return 2500;
		}else {return 3000;}
	}
	  public String toString(){
	
	        return id+","+name+","+surname+","+phoneNumber+" "+ seniority()+ " "+ weeklySallary();
	    }
}
