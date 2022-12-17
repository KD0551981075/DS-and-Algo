package array;

import java.util.Arrays;

public class LeftSwift {
    public static void main(String args[])
    {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int position = 5;
        //output
        // 2,3,4,5,6,7,8,9,10,1
        // 3,4,5,6,7,8,9,10,1,2

        while (position > 0) {
            //store initial value
            int temp = input[0];
            //iterate/swift all the values except first
            for (int i = 0; i < input.length-1; i++)
                input[i] = input[i + 1];
            //insert the initial value to last index
            input[input.length - 1] = temp;
            position --;
        }

        Arrays.stream(input).forEach(each->System.out.println(each));
    }
}
