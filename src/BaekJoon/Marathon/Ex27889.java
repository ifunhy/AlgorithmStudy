package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex27889 {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();

        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(map.get(br.readLine()));
    }
}
