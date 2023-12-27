package day7.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main (String[] args) {
        Map<String, Float> bank = new LinkedHashMap<>();

        System.out.println(bank.put("Sunil", 11500f)); //null
        System.out.println(bank.put("Sunil", 115009.50f));
        System.out.println(bank);


        bank.put("Buhari", 8977322.23f);
        bank.put("Fatima", 29990.67f);
        bank.put("Maryam", 5628.98f);

        System.out.println(bank);
    }
}
