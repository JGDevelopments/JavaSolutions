import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int[] numbers = {2,12,7,5,1,8,4,10};
        Scanner input = new Scanner(System.in);
        Integer sum = input.nextInt();
        int[] ret = twoSums(numbers, sum);

    }

    private static int[] twoSums(int[] numbers, int spec){
        int[] ret = {-1, -1}; // this returns - 1 both if no sum is found

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i); //numbers[i] is our key (index) and the i is our value of that key (index)
            int subNum = (spec - numbers[i]);

            if(map.get(subNum)!= null && map.get(subNum)!= i) {
                ret[0] = i;
                ret[1] = map.get(subNum);
                System.out.println("Values can be located at indexes: " + ret[0] + ", " + ret[1]);
            }
        }


        int i = 0;
        int subNum = (spec - numbers[i]);
        if(map.get(subNum) == null){
                System.out.println("--------------------------------------------");
        }

        System.out.println("HashMap = " + map);
        return ret;

    }

}


// a single loop and hashmap done
// a sorted array using 2 point approach not done
// palindrome function done
// compression not done