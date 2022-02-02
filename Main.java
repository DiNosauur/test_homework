import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>();
        ArrayList<Integer> february;
        ArrayList<Integer> march;
        ArrayList<Integer> may;
        ArrayList<Integer> june;
        ArrayList<Integer> november;
        january.add(1);
        january.add(7);
        stateHolidays.put("������", january);
        stateHolidays.put("�������", new ArrayList<>());
        stateHolidays.get("�������").add(23);
        put(stateHolidays, "�������", 9);
        stateHolidays.computeIfAbsent("����", k -> new ArrayList<>()).add(8);
        stateHolidays.computeIfAbsent("����", k -> new ArrayList<>()).add(28);
        stateHolidays.compute("����", (s, Integer) -> Integer == null ? new ArrayList<>() : Integer).add(18);
        System.out.println(stateHolidays);
        for (String month : stateHolidays.keySet()){
            System.out.println(month);
        }
        Scanner scanner = new Scanner(System.in);
    }

    private static <KEY, VALUE> void put(HashMap<KEY, ArrayList<VALUE>> map, KEY key, VALUE value) {
        map.compute(key, (s, Integer) -> Integer == null ? new ArrayList<>() : Integer).add(value);
    }

}