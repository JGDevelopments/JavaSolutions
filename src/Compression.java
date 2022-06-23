import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String compress = input.nextLine();


        for (int i = 0; i < compress.length(); i++) {
            char ch = compress.charAt(i);
            Integer counter = map.get(ch);

            if (counter == null) {
                    counter = 0;
            }

            counter++;
            map.put(ch, counter);
        }
        System.out.println("Character Counter: " + map);
    }
}
