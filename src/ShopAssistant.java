
public class ShopAssistant {

 private int id;
 private String name;
 private String surname;
 private int phoneNumber;

	ShopAssistant(int id, String name, String surname, int phoneNumber ){
		
		this.id = id;
		this.name = name; 
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		
		
	}
	
	  public String toString(){
	
	        return id+","+name+","+surname+","+phoneNumber;
	    }
}
