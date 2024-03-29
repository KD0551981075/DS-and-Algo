package StringDS;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {
        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            String numAnsStr = "";

            if(divisibleBy3 && divisibleBy5)
                numAnsStr = "FizzBuzz";

            else if (divisibleBy3)
                // Divides by 3, add Fizz
                numAnsStr = "Fizz";


            else if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsStr = "Buzz";
            }

            else if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr = Integer.toString(num);
            }

            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }

        return ans;
    }

    public static void main(String args[])
    {
        fizzBuzz(100).stream().forEach(System.out::println);
    }
}
