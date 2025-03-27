import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static String solution(String s) {
        String answer = "";

        String[] strArrary = s.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String str : strArrary) {
            numbers.add(Integer.parseInt(str));
        }

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        answer = min + " " + max;

        return answer;
    }
}