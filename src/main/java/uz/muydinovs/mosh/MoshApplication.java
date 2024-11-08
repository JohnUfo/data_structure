package uz.muydinovs.mosh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MoshApplication {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String fruit = "a green apple";

        var chars = fruit.toCharArray();
        for (var ch : chars) {
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count+1);
        }

        for(var ch : chars) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }


    }
}
