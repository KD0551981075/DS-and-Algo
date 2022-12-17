package array;

public class KadanesAlgo {

    public static void main(String args[])
    {
       int[] numbers = {-47, 43, 94, -94, -93, -59, 31, -86};
        int minimum = Integer.MIN_VALUE;
        System.out.println(printMaxSum(numbers));
    }

    public static int printMaxSum(int[] numbers) {
        int totalSum = Integer.MIN_VALUE, currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum > totalSum)
                totalSum = currentSum;
            if (currentSum < 0)
                currentSum = 0;
        }

        return totalSum;
    }
}
