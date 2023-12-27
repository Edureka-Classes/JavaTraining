package day7.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main (String[] args) {
        Map<String, Float> bank = new HashMap<>();

        System.out.println(bank.put("Sunil", 11500f)); //null
        System.out.println(bank.put("Sunil", 115009.50f));
        System.out.println(bank);


        bank.put("Buhari", 8977322.23f);
        bank.put("Fatima", 29990.67f);
        bank.put("Maryam", 5628.98f);

        System.out.println(bank);
        System.out.println();

        float balance = bank.get("Buhari");
        System.out.println("A/C Balance of \" Buhari\"" + balance);

        balance += 1234.6;
        bank.put("Buhari", balance);
        System.out.println(bank);
        System.out.println();

        Set<String> accHolderSet = bank.keySet();
        System.out.print("A/C Holders -----> ");
        for(String name: accHolderSet){
            System.out.print(name + " | ");
        }
        System.out.println("\n");

        Set<Map.Entry<String, Float>> entries = bank.entrySet();
        Iterator<Map.Entry<String, Float>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, Float> entry = it.next();
            String name = entry.getKey();
            float bal = entry.getValue();

            System.out.printf("%-10s ----> %.2f \n", name, bal);

            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println();
        }

    }

}
