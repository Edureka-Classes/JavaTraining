public class Test1 {

    int Account_number; 
    String Account_Name;

    Test1(int number, String name ){
        this.Account_Name = name;
        this.Account_number = number;
    }

    public static void main (String [] args) {  
            
        Test1 t1 = new Test1(100, "Pearl");  
        //t1.Account_number = 100;  
        //t1.Account_Name = "Pearl"; 

        //System.out.println("Id " + t1.Account_number); 
        //System.out.println("Name " + t1.Account_Name); 
    
        System.out.println(t1);
    }
    
}
