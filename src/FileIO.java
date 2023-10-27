import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class FileIO {
    // Define methods to read data from CSV files
    
    // Method to read product data from 'products.CSV' file
    public static Product[] readProductData(String filename) {
         Product [] products = new Product [90] ;
       
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i =0;
            int[] idNumber= new int[90];
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                int ID = Integer.parseInt(data[0]);
                idNumber[i]=ID;
                String productName = data[1];
                data[2]=data[2].replace(",",".");
                double price = Double.parseDouble(data[2]);
                Product product = new Product(ID, productName, price);
           
                products[i]=product;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
    public static int[] IdCounter(String filename) {
             int[] idNumber= new int[90];
      
       try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           String line;
           int i =0;
      
           while ((line = br.readLine()) != null) {
               String[] data = line.split(";");
               int ID = Integer.parseInt(data[0]);
               idNumber[i]=ID;
               
               i++;
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

       return idNumber;
   }
    // Method to read shop assistant data from 'shopAssistants.csv' file
    public static ShopAssistant[] readShopAssistantData(String filename) {
        ShopAssistant[] assistants=new ShopAssistant[100];
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i =0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                int ID = Integer.parseInt(data[0]);
                
                String name = data[1];
                String surname = data[2];
                data[3]=data[3].replace("-","");
                int phoneNumber = Integer.parseInt(data[3]);
                ShopAssistant assistant = new ShopAssistant(ID, name, surname, phoneNumber);
             
                assistants[i]=assistant;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return assistants;
    }
    	
}

